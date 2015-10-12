package ngram

import scala.annotation.tailrec

/**
 * Created by sai on 12/10/2015.
 */
object NGrammer {
  def ngram(input: String, grams: Int) = {

    @tailrec
    def collect(masterIndex: Int, subIndex: Int, runningString: String, runningResults: List[String]): List[String] = {
      if (masterIndex >= input.length || subIndex >= input.length) {
        if (runningResults.isEmpty) runningResults :+ runningString
        else runningResults
      }
      else if ((subIndex - masterIndex) == grams - 1)
        collect(masterIndex + 1, masterIndex + 1, "", runningResults :+ (runningString + input.charAt(subIndex)))
      else
        collect(masterIndex, subIndex + 1, runningString + input.charAt(subIndex) + "", runningResults)
    }
    collect(0, 0, "", List[String]())
  }

}
