package stringcompression

import scala.annotation.tailrec

/**
  * Created by saikrishnamurthy on 04/11/2015.
  */
object StringCompression {
  def compress(input: String) = {

    @tailrec
    def squeeze(currIndex: Int, compressedResult: String, currCharOccuranceCount: Int): String = {
      if (currIndex >= input.length) compressedResult
      else if (input(currIndex) == input(currIndex - 1)) squeeze(currIndex + 1, compressedResult + input(currIndex).toString + (currCharOccuranceCount + 1).toString, currCharOccuranceCount + 1)
      else squeeze(currIndex + 1, compressedResult + input(currIndex).toString, 1)
    }
    if (input.length > 1) squeeze(1, input(0).toString, 1) else input
  }
}
