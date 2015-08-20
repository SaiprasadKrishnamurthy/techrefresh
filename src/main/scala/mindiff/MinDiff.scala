package mindiff

/**
 * Created by sai on 20/08/2015.
 */
object MinDiff {

  // O(N + N^2 + N) = O(N^2)
  def mindiff(arr: Array[Int]) = {
    (1 to arr.length - 1)
      .map(index => arr.splitAt(index))
      .map(split => Math.abs(split._1.sum - split._2.sum))
      .min
  }

  // O(N)
  def mindiffx(arr: Array[Int]) = {
    val totalSum = arr.sum
    var diff = Int.MaxValue
    var lhsSum = arr(0)
    for (i <- 1 to arr.length - 1) {
      val rhsSum = totalSum - lhsSum
      val currDiff = Math.abs(lhsSum - rhsSum)
      if (currDiff <= diff) diff = currDiff
      lhsSum += arr(i)
    }
    diff
  }
}
