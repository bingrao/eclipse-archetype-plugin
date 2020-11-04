package ${package}

/**
  * @author 
  */
object ScalaApp {
  val log = new ${package}.utils.Logging(this.getClass.getName)
  def printHello() =  log.info("Hello World from Scala")
  def main(args: Array[String]): Unit = {
    printHello()
  }
}