package peakfinder

import scala.annotation.tailrec

/**
 * Created by sai on 14/08/2015.
 */
object PeakFinder {
  def peakOf(arr: Array[Int]) = {

    @tailrec
    def peak(elements: Array[Int], start: Int, end: Int): Int = {
      val mid = (start + end) / 2
      if (mid + 1 >= elements.length) -1
      else if (elements(mid) >= elements(mid - 1) && elements(mid) >= elements(mid + 1)) elements(mid)
      else if (elements(mid) < elements(mid - 1)) peak(elements, start, mid)
      else peak(elements, mid, end)
    }

    peak(arr, 0, arr.length)
  }

}
