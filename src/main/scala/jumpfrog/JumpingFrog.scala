package jumpfrog

import scala.annotation.tailrec

/**
 * Created by sai on 11/08/2015.
 */
object JumpingFrog {

  def quickestTime(target: Int, arr: Array[Int], arrLength: Int): Int = {

    @tailrec
    def walk(currIndex: Int, collected: Set[Int]): Int = {
      if(currIndex == arrLength) -1
      else if(collected.size == target) currIndex - 1
      else walk(currIndex + 1, if(arr(currIndex) <= target) collected + arr(currIndex) else collected)
    }
    walk(0, Set())
  }
}
