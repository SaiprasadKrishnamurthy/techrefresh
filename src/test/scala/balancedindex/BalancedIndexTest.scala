package balancedindex

import org.scalatest._

/**
 * Created by sai on 07/08/2015.
 */
class BalancedIndexTest extends FlatSpec with ShouldMatchers {

  import BalancedIndex._

  "A balanced index finder " should " find the first index which has the balanced number of matches and mismatches" in {
    find(Array(1, 5, 5, 0, 1, 3, 5, 5, 1), 5) should be(4)
  }

  "A balanced index finder " should " return -1 for a non existent index that has a balanced matches and mismatches" in {
    find(Array(1, 2, 3, 4, 5, 6, 7, 8, 9), 5) should be(-1)
  }

  "A balanced index finder " should " return -1 for an array with a single element" in {
    find(Array(1), 1) should be(-1)
  }

  "A balanced index finder " should " return -1 for a non existent element " in {
    find(Array(1, 2, 3), 5) should be(-1)
  }

  "A balanced index finder " should " return -1 for an empty array " in {
    find(Array(1, 2, 3), 5) should be(-1)
  }

}
