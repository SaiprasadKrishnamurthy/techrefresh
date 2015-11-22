package median

/**
  * Created by saikris on 22/11/2015.
  */
object Median {

  def median(arr1: Array[Int], arr2: Array[Int]) = {
    val totalLength = arr1.length + arr2.length

    def areArraysEven = totalLength % 2 == 0

    var median = Integer.MIN_VALUE

    val (largerArray, smallerArray) = if (arr1.length >= arr2.length) (arr1, arr2) else (arr2, arr1)

    var curr, next = Integer.MIN_VALUE
    var length = 0
    for (i <- 0 to largerArray.length - 1 if (median == Integer.MIN_VALUE)) {
      val elementFromLargerArray = largerArray(i)
      val elementFromSmallerArray = if (i <= smallerArray.length) smallerArray(i) else largerArray(i + 1)
      length = if (i <= smallerArray.length) length + 2 else length + 1
      val (curr, next) = if (elementFromLargerArray <= elementFromSmallerArray) (elementFromLargerArray, elementFromSmallerArray) else (elementFromSmallerArray, elementFromLargerArray)
      if (length >= totalLength / 2) {
        if (areArraysEven) median = (curr + next) / 2 else median = next
      }
    }
    median
  }
}
