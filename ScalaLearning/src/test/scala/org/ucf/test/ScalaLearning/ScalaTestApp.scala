package org.ucf.test.ScalaLearning;
/**
  * @author
  */
import org.junit.Test
import org.junit.Assert._

class ScalaTestAPP {
  @Test def testAdd() {
    println("Hello World From Scala");
    assertTrue(true);
    val t = new ScalaApp()
    println(t.simplifyTop(UnOp("-",UnOp("-",Var("x")))))
    t.tupleDemo((3,4))
    println(t.gernerlSize("I am the boy"))
    println(t.gernerlSize(Map(1 -> "brao",2 -> "bing")))
  }
  
  @Test def testMultiTable() {
    val tmp = new MultiTable(10,10)
    tmp.printMultiTable()
    println(tmp.multiTable())
  }
  
}