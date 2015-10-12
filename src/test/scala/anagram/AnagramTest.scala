package anagram

import org.scalatest.{FlatSpec, ShouldMatchers}

/**
 * Created by sai on 12/10/2015.
 */
class AnagramTest extends FlatSpec with ShouldMatchers {

  "anagram verifier " should "return true for 2 strings where one is an anagram of the other" in {
    val one = "eleven plus two"
    val two = "twelve plus one"
    Anagram.test(one, two) should be(true)
  }

  it should "return true for 2 strings where one is an anagram of the other being case insensitive" in {
    val one = "Eleven plus two"
    val two = "twelve plus one"
    Anagram.test(one, two) should be(true)
  }

  it should "return false for a 2 strings where one is a subset of the other" in {
    val one = "Eleven plus two"
    val two = "twelve plus one xxx"
    Anagram.test(one, two) should be(false)
  }

  it should "return false for strings where one is blank" in {
    val one = "Eleven plus two"
    val two = ""
    Anagram.test(one, two) should be(false)
  }

  it should "return false for strings where both are blank" in {
    val one = ""
    val two = ""
    Anagram.test(one, two) should be(false)
  }

}
