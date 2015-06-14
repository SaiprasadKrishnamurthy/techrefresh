package binarysearch

import org.scalatest.{FlatSpec, ShouldMatchers}

/**
 * Created by sai on 14/06/2015.
 */
class BinarySearchTest extends FlatSpec with ShouldMatchers {

  "A Binary search " should " find the single element in the list" in {
    val binarySearch = new BinarySearch
    binarySearch.search(1, List(1)) should be(Some(1))
  }

  it should " find the element in an unsorted list" in {
    val binarySearch = new BinarySearch
    binarySearch.search(2, List(6, 88, 8, 4, 2, 90, 1)) should be(Some(2))
  }

  it should " report a missing element in an unsorted list" in {
    val binarySearch = new BinarySearch
    binarySearch.search(112, List(6, 88, 8, 4, 2, 90, 1)) should be(None)
  }
  it should " find the element in a sorted list" in {
    val binarySearch = new BinarySearch
    binarySearch.search(90, List(6, 88, 8, 4, 2, 90, 1).sorted) should be(Some(90))
  }
}
