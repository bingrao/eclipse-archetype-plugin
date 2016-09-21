package org.ucf.test.ScalaLearning
import scala.tools.nsc._
import io._
import scala.io.Source
import scala.reflect.runtime.universe._
import scala.tools.reflect.ToolBox
import com.google.common.io.Files
import java.nio.charset.Charset
import java.io.File

object CompilerTree extends Global(new Settings()) {
  new Run
  def Parse(path:String) = {
    val code  = AbstractFile.getFile(path)
    val bfs = new util.BatchSourceFile(code,code.toCharArray)
    val parser = new syntaxAnalyzer.UnitParser(new CompilationUnit(bfs))
    parser.smartParse()
  }
  def Parse1(path:String) = {
    this.Parse(path).toString
  }
  def Parse2(path:String) = {
      showRaw(this.Parse(path))
  }
  def Parse3(path:String) = {
  val source = Files.toString(new File(path),Charset.forName("UTF-8"))
  val toolBox = runtimeMirror(getClass.getClassLoader).mkToolBox()
  val ast = toolBox.typecheck(toolBox.parse(source))
  showRaw(ast)
  }
}