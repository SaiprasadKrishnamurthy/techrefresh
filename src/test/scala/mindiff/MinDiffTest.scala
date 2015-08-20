package mindiff

import org.scalatest.{ShouldMatchers, FlatSpec}

/**
 * Created by sai on 20/08/2015.
 */
class MinDiffTest extends FlatSpec with ShouldMatchers {

  "Min Diff " should "find the minimum difference for a non empty array " in {
    MinDiff.mindiff(Array(3, 1, 2, 4, 3)) should be(1)
    MinDiff.mindiffx(Array(3, 1, 2, 4, 3)) should be(1)
  }
  it should "O(N) find the minimum difference for a larger non empty array in linear time" in {
    MinDiff.mindiffx((1 to 20000).toArray) should be(306)
  }
  it should "O(N^2) find the minimum difference for a larger non empty array in quadratic time" in {
    MinDiff.mindiff((1 to 20000).toArray) should be(306)
  }
}
