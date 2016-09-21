package org.ucf.test.ScalaLearning

class MultiTable(r:Int,c:Int) {
  val row = r
  val col = c
  
  def printMultiTable(){
    var i = 1
    while (i <= row)
    {
      var j = 1
      while (j <= col) {
        val prod = (i*j).toString
        var k = prod.length()
        while(k<4){
          print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }
      println()
      i += 1
    }
  }

  private def makeRowSeq(rw:Int) = 
    for(j <- 1 to col) yield {
      val prod = (rw*j).toString
      val padding = " "*(4-prod.length)
      padding + prod
    }
  private def makeRow(rw:Int) = makeRowSeq(rw).mkString
  
  def multiTable() = {
    val tableseq = 
      for(rw <- 1 to row)
        yield makeRow(rw)
    tableseq.mkString("\n")
  }

}