package one

/**
 * Created by sai on 13/06/2015.
 */
class FizzBuzz {

  def fizzBuzz(input: Int) = input match {
    case _ if(input % 15 == 0) => "FizzBuzz"
    case _ if(input % 3 == 0)  => "Fizz"
    case _ if(input % 5 == 0)  => "Buzz"
    case _ => input.toString
  }

}
