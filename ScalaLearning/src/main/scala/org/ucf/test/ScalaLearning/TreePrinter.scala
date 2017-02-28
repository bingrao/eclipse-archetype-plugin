package org.ucf.test.ScalaLearning 

import com.github.mlangc.brackets.DefaultBeautifier
import io._
import scala.io.Source
import scala.reflect.runtime.universe._
import scala.tools.reflect.ToolBox
import com.google.common.io.Files
import java.nio.charset.Charset
import java.io.File



object TreePrinter extends App {
  val sourcePath = "src/main/TrivialObject.scala"
  
  val source = Files.toString(new File(sourcePath),Charset.forName("UTF-8"))
  val toolBox = runtimeMirror(getClass.getClassLoader).mkToolBox()
  val ast = toolBox.parse(source)
  val rawAst  = showRaw(ast)
  //val rawAst = CompilerTree.Parse3(sourcePath)
  println(DefaultBeautifier.format(rawAst))
}