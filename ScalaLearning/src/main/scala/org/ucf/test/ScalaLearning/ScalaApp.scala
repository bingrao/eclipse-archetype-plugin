package org.ucf.test.ScalaLearning;

/**
  * @author 
  */
class ScalaApp() {
  
  def simplifyTop(expr:Expr) = expr match {
    case UnOp("-",UnOp("-",e))    => e
    case BinOp("+",e,Number(0))   => e
    case BinOp("*",e,Number(0))   => e
    case _ => expr
  }
  def tupleDemo(expr:Any) = expr match {
    case (a,b,c) => println("matched"+a+":"+b+":"+c)
    case (a,b) => println("matched"+a+":"+b+":")
    case _ =>
  }
  
  def gernerlSize(x:Any) = x match {
    case s:String => s.length()
    case m:Map[_,_] => m.size
    case _ => -1
  }
  
  def printHello(){
    println("Hello World from Scala");
  }
}