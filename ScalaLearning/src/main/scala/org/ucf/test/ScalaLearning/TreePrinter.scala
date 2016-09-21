package org.ucf.test.ScalaLearning 

import com.github.mlangc.brackets.DefaultBeautifier

object TreePrinter extends App {
  val sourcePath = "src/main/TrivialObject.scala"
  val rawAst = CompilerTree.Parse2(sourcePath)
  println(DefaultBeautifier.format(rawAst))
}