package com.codacy.clangtidy

object Main {

  def main(args: Array[String]): Unit = {
    // TODO make this dynamic
    val toolName = "clang-tidy"

    // TODO allow to read report from file
    val lines = scala.io.Source.stdin.getLines().to(LazyList)
    val jsonString = new Converter(toolName).convert(lines)
    println(jsonString)
  }

}
