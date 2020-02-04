package com.codacy.clangtidy

import com.codacy.model.{FileResults, IssuesAnalysis, ToolResults}

class Converter(toolName: String) {

  def convert(lines: Seq[String]): String = {
    val parsed = ClangTidyReportParser.parse(lines)

    val grouped = parsed
      .groupBy(_.path)
      .view
      .map {
        case (path, res) =>
          FileResults(path, res.view.map(ClangTidyResult.toIssue).to(Set))
      }
      .to(Set)

    val toolResults = ToolResults(toolName, IssuesAnalysis.Success(grouped))
    CodacyReportSerializer.toJsonString(Set(toolResults))
  }

}