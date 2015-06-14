package roman

import org.scalatest.{ShouldMatchers, FlatSpec}

/**
 * Created by sai on 14/06/2015.
 */
class RomanNumeralTest extends FlatSpec with ShouldMatchers {

  "A Roman Numeral Calculator " should " calculate the numeral with single numeral" in {
    val romanNumeral = new RomanNumeral
    romanNumeral.calculate(1) should be("I")
    romanNumeral.calculate(5) should be("V")
    romanNumeral.calculate(10) should be("X")
    romanNumeral.calculate(50) should be("L")
    romanNumeral.calculate(100) should be("C")
    romanNumeral.calculate(500) should be("D")
    romanNumeral.calculate(1000) should be("M")
  }

  "A Roman Numeral Calculator " should " calculate the numeral for numbers that has a direct representation" in {
    val romanNumeral = new RomanNumeral
    romanNumeral.calculate(1) should be("I")
    romanNumeral.calculate(5) should be("V")
    romanNumeral.calculate(10) should be("X")
    romanNumeral.calculate(50) should be("L")
    romanNumeral.calculate(100) should be("C")
    romanNumeral.calculate(500) should be("D")
    romanNumeral.calculate(1000) should be("M")
    romanNumeral.calculate(9) should be("IX")
    romanNumeral.calculate(4) should be("IV")
    romanNumeral.calculate(400) should be("CD")
    romanNumeral.calculate(900) should be("CM")
    romanNumeral.calculate(90) should be("XC")
  }

  "A Roman Numeral Calculator " should " calculate the numeral for numbers in tens" in {
    val romanNumeral = new RomanNumeral
    romanNumeral.calculate(1) should be("I")
    romanNumeral.calculate(5) should be("V")
    romanNumeral.calculate(10) should be("X")
    romanNumeral.calculate(50) should be("L")
    romanNumeral.calculate(100) should be("C")
    romanNumeral.calculate(500) should be("D")
    romanNumeral.calculate(1000) should be("M")
    romanNumeral.calculate(9) should be("IX")
    romanNumeral.calculate(4) should be("IV")
    romanNumeral.calculate(400) should be("CD")
    romanNumeral.calculate(900) should be("CM")
    romanNumeral.calculate(90) should be("XC")
  }

}
