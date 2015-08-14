package binarysearch

/**
 * Created by sai on 14/06/2015.
 */
class BinarySearch {
  def search(toBeSearched: Int, input: List[Int]) = {
    def binarySearch(searchSpace: List[Int], startIndex: Int, endIndex: Int): Option[Int] = {
      val mid = (startIndex + endIndex) / 2
      if (startIndex >= endIndex) None
      else if (toBeSearched == searchSpace(mid)) Some(searchSpace(mid))
      else if (toBeSearched > searchSpace(mid)) binarySearch(searchSpace, mid + 1, endIndex)
      else binarySearch(searchSpace, startIndex, mid - 1)
    }
    binarySearch(input.sorted, 0, input.size - 1)
  }
}
