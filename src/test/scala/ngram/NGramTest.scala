package ngram

import org.scalatest.{FlatSpec, ShouldMatchers}

/**
 * Created by sai on 12/10/2015.
 */
class NGramTest extends FlatSpec with ShouldMatchers {

  "n-grammer" should "split the string as 2 grams given a valid string " in {
    val input = "abcdefg"
    val output = Array("ab", "bc", "cd", "de", "ef", "fg")
    val grams = 2
    NGrammer.ngram(input, grams) should be(output)
  }

  it should "split the string as 4 grams given a valid string " in {
    val input = "abcdefg"
    val output = Array("abcd", "bcde", "cdef", "defg")
    val grams = 4
    NGrammer.ngram(input, grams) should be(output)
  }

  it should "split the string as 5 grams when the string is lesser than the grams " in {
    val input = "abc"
    val output = Array("abc")
    val grams = 5
    NGrammer.ngram(input, grams) should be(output)
  }
}
