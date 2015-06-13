package one

import org.scalatest.{FlatSpec, Matchers}

/**
 * Created by sai on 13/06/2015.
 */
class FizzBuzzTest extends FlatSpec with Matchers{

  val fizzBuzz = new FizzBuzz
  "A fizzBuzz calculator" should "return 'Fizz' for inputs divisible by 3" in {
    fizzBuzz.fizzBuzz(6) should be("Fizz")
    fizzBuzz.fizzBuzz(18) should be("Fizz")
  }

  it should("return 'Buzz' for inputs divisible by 5") in {
    fizzBuzz.fizzBuzz(5) should be("Buzz")
    fizzBuzz.fizzBuzz(25) should be("Buzz")
  }

  it should("return 'fizzBuzz' for inputs divisible by 15") in {
    fizzBuzz.fizzBuzz(15) should be("FizzBuzz")
    fizzBuzz.fizzBuzz(45) should be("FizzBuzz")
  }

  it should("echo the same number if it isn't divisible by 3 and 5") in {
    fizzBuzz.fizzBuzz(1) should be("1")
    fizzBuzz.fizzBuzz(88) should be("88")
  }

}
