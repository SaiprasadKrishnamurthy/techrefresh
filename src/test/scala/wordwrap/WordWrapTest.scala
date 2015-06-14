package wordwrap

import org.scalatest.{ShouldMatchers, FlatSpec}

/**
 * Created by sai on 13/06/2015.
 */
class WordWrapTest extends FlatSpec with ShouldMatchers {

  "A word wrapper" should "not wrap the word for the line whose length is lesser than the column size " in {
    val inputLine = "Hello Scala"
    val wordwrap = new WordWrap
    wordwrap.wrap(inputLine, 50) should be(inputLine)
  }

  "A word wrapper" should "not wrap the word for the line whose length equal to the column size " in {
    val inputLine = "Hello Scala"
    val wordwrap = new WordWrap
    wordwrap.wrap(inputLine, inputLine.length) should be(inputLine)
  }

  "A word wrapper" should "wrap the words for a total of two lines " in {
    val inputLine = "Hello Scala"
    val wordwrap = new WordWrap
    wordwrap.wrap(inputLine, 7) should be("Hello\nScala")
    wordwrap.wrap(inputLine, 9) should be("Hello\nScala")
  }

  "A word wrapper" should "wrap the words for a total of five lines " in {
    val inputLine = "Hello Scala WordWrapper a quite a long input"
    val wordwrap = new WordWrap
    wordwrap.wrap(inputLine, 6) should be("Hello\nScala\nWordWrapper\na\nquite\na long\ninput")
    wordwrap.wrap(inputLine, 9) should be("Hello\nScala\nWordWrapper\na quite a\nlong\ninput")
  }

}
