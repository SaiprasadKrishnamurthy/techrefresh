package equalindex

import scala.annotation.tailrec

/**
 * Created by sai on 07/08/2015.
 */
object BalancedIndex {

  def allGreaterThanZero(num: Int*) = !num.exists(_ <= 0)

  def find(elements: Array[Int], element: Int) = {

    def matching(n: Int) = n == element
    def notMatching(n: Int) = n != element

    @tailrec
    def walk(currIndex: Int, leftMatches: Int, rightMatches: Int, leftMismatches: Int, rightMismatches: Int): Int = {
      if (currIndex == elements.size - 1) -1
      else if (allGreaterThanZero(leftMatches, rightMatches, leftMismatches, rightMismatches) && leftMatches == rightMatches && leftMismatches == rightMismatches) currIndex - 1
      else {
        val split = elements.splitAt(currIndex)
        val l = (split._1, split._2.tail)
        walk(currIndex + 1, l._1.count(matching), l._2.count(matching), l._1.count(notMatching), l._2.count(notMatching))
      }
    }
    walk(0, -1, -1, -1, -1)
  }
}
