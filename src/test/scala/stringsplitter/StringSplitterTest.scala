package stringsplitter

import org.scalatest.{ShouldMatchers, FlatSpec}

/**
  * Created by saikris on 07/11/2015.
  */
class StringSplitterTest extends FlatSpec with ShouldMatchers {

  "stringSplitter" should "split the string for all possible combinations" in {
    val input = Array("A", "B", "C", "D")
    val expectedOutput = Array("A", "AB", "ABC", "ABCD", "B", "BC", "BCD", "C", "CD", "D")

    StringSplitter.split(input) should be(expectedOutput)
  }
  it should "split the string for all possible combinations for a smaller array" in {
    val input = Array("A", "B")
    val expectedOutput = Array("A", "AB", "B")

    StringSplitter.split(input) should be(expectedOutput)
  }
  it should "split the string for all possible combinations for array with unit length" in {
    val input = Array("A")
    val expectedOutput = Array("A")

    StringSplitter.split(input) should be(expectedOutput)
  }
}
