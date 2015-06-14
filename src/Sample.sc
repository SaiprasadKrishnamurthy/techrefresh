def search(toBeSearched: Int, input: List[Int]) = {


  def binarySearch(searchSpace: List[Int], startIndex: Int, endIndex: Int): Option[Int] = {
    val mid = (startIndex + endIndex) / 2
    if(startIndex > endIndex) None
    else if (toBeSearched == searchSpace(mid)) Some(searchSpace(mid))
    else if (toBeSearched > searchSpace(mid)) binarySearch(searchSpace, mid + 1, endIndex)
    else  binarySearch(searchSpace, startIndex, mid - 1)
  }
  binarySearch(input.sorted, 0, input.size - 1)
}

// 1,2,4,6,8,88,90
// 6,8,88,90

search(112, List(6, 88, 8, 4, 2, 90, 1))