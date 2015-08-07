package equalindex

import org.scalatest._

/**
 * Created by sai on 07/08/2015.
 */
class BalancedIndexTest extends FlatSpec with ShouldMatchers {

  "An balanced index finder " should " find the first index which has the balanced number of matches and mismatches" in {
    val index = BalancedIndex.find(Array(1, 5, 5, 0, 1, 3, 5, 5, 1), 5)
    index should be(4)
  }

  "An balanced index finder " should " return -1 for a non existent index that has a balanced matches and mismatches" in {
    val index = BalancedIndex.find(Array(1, 2, 3, 4, 5, 6, 7, 8, 9), 5)
    index should be(-1)
  }

  "An balanced index finder " should " return -1 for an array with a single element" in {
    val index = BalancedIndex.find(Array(1), 1)
    index should be(-1)
  }

  "An balanced index finder " should " return -1 for a non existent element " in {
    val index = BalancedIndex.find(Array(1, 2 , 3), 5)
    index should be(-1)
  }

  "An balanced index finder " should " return -1 for an empty array " in {
    val index = BalancedIndex.find(Array(1, 2 , 3), 5)
    index should be(-1)
  }

}
