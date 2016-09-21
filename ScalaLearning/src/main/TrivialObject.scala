package org.ucf.test
object TrivialObject{
  def f(x:Int) = y+z
}

class TrivialClass (y:Int,z:Int){
  val  a:Int = 5
  def f1(x:Int) = y+z
  def f2(x:Int):Int = {
    val  w = x+y+z
    return w
  }
  def simplifyTop(expr:Expr) = expr match {
    case UnOp("-",UnOp("-",e))    => e
    case BinOp("+",e,Number(0))   => e
    case BinOp("*",e,Number(0))   => e
    case _ => expr
  }
}

trait TrivialTrait {
  val a:Int
  def f(x:Int) = x
}

abstract class Expr
case class Var(name:String) extends Expr