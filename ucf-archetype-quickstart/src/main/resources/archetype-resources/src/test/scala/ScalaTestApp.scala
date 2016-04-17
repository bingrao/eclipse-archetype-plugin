package ${package};
/**
  * @author
  */
import org.junit.Test
import org.junit.Assert._

class ScalaTestAPP {
  @Test def testAdd() {
    assertTrue(true);
  }
  @Test def testPrint(){
    val tmpScala:ScalaApp = new ScalaApp();
    tmpScala.printHello();
    val tmpJava:JavaApp = new JavaApp();
    tmpJava.printJavaHello();
  }
}