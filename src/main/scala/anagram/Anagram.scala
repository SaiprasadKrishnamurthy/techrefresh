package anagram

import scala.annotation.tailrec

/**
 * Created by sai on 12/10/2015.
 */
object Anagram {
  def test(one: String, two: String) = {
    // Collect character and it's count in a map.
    @tailrec
    def collect(str: String, index: Int, charCount: Map[String, Int]): Map[String, Int] = {
      if (str.length == index) charCount
      else {
        val char = str.charAt(index).toString.toLowerCase
        val count = charCount.getOrElse(char, 0)
        collect(str, index + 1, charCount + (char -> (count + 1)))
      }
    }

    @tailrec
    def verify(str: String, index: Int, charCount: Map[String, Int]): Boolean = {
      if (str.length == index) charCount.count(tuple => tuple._2 != 0) == 0
      else {
        val char = str.charAt(index).toString.toLowerCase
        val count = charCount.getOrElse(char, 0)
        verify(str, index + 1, charCount + (char -> (count - 1)))
      }
    }

    one.length > 0 && two.length > 0 && verify(two, 0, collect(one, 0, Map[String, Int]()))
  }
}
