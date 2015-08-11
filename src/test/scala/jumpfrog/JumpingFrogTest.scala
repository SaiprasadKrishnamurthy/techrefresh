package jumpfrog

import org.scalatest.{ShouldMatchers, FlatSpec}

/**
 * Created by sai on 11/08/2015.
 */
class JumpingFrogTest extends FlatSpec with ShouldMatchers {

  "A Jumping frog " should " find the earliest time to jump to the position when only one valid path exist " in {
    val arr = Array(1, 3, 1, 4, 2, 3, 5, 4)
    JumpingFrog.quickestTime(5, arr, arr.length) should be(6)
  }

  "A Jumping frog " should " find the earliest time to jump to the position when more than one valid path exist " in {
    val arr = Array(1, 2, 3, 4, 6, 5, 2, 3, 4, 5, 6)
    JumpingFrog.quickestTime(6, arr, arr.length) should be(5)
  }

  "A Jumping frog " should " be helpless when no paths exist" in {
    val arr = Array(1, 2, 3, 4, 6, 5, 2, 3, 4, 5, 6)
    JumpingFrog.quickestTime(8, arr, arr.length) should be(-1)
  }

  "A Jumping frog " should " find the earliest time to jump to the position when more than one valid path exist again" in {
    val arr = Array(1, 3, 1, 4, 2, 3, 5, 4)
    JumpingFrog.quickestTime(4, arr, arr.length) should be(4)
  }

  "A Jumping frog " should " be sleeping when the path is a vaccum!" in {
    val arr = Array[Int]()
    JumpingFrog.quickestTime(8, arr, arr.length) should be(-1)
  }
}
