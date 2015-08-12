package arrayintersect

import scala.annotation.tailrec

/**
 * Created by sai on 12/08/2015.
 */
object ArrayIntersect {


  def intersectionOf(arr1: Array[Int], arr2: Array[Int]) = {

    @tailrec
    def walk(smallerArray: Array[Int], biggerArray: Array[Int], smallerIndex: Int, biggerIndex: Int, results: List[Int]): List[Int] = {
      if (smallerIndex >= smallerArray.length) results
      else if (smallerArray(smallerIndex) < biggerArray(biggerIndex)) walk(smallerArray, biggerArray, smallerIndex + 1, biggerIndex, results)
      else if (smallerArray(smallerIndex) > biggerArray(biggerIndex)) walk(smallerArray, biggerArray, smallerIndex, biggerIndex + 1, results)
      else {
        if (smallerArray.length <= biggerArray.length) walk(smallerArray, biggerArray, smallerIndex + 1, biggerIndex + 1, results :+ smallerArray(smallerIndex))
        else walk(biggerArray, smallerArray, smallerIndex + 1, biggerIndex + 1, results :+ smallerArray(smallerIndex))
      }
    }
    if (arr1.length == 0 || arr2.length == 0) List() else walk(arr1, arr2, 0, 0, List())
  }
}
