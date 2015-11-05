package islandfinder

import scala.collection.mutable.ListBuffer

/**
  * Created by saikrishnamurthy on 05/11/2015.
  */
object IslandFinder {
  def find(matrix: Array[Array[Int]]) = {
    val results = ListBuffer[(Int, Int)]()

    // Could do a recursive approach too. But that's not readable.
    for (i <- 0 until matrix.length) {
      val currRow = i
      val prevRow = if (currRow - i <= 0) 0 else currRow - 1
      val nextRow = if (currRow + i >= matrix.length) currRow - 1 else currRow + 1
      for (j <- 0 until matrix.length) {
        val currCol = j
        val nextCol = if (currCol + j >= matrix.length) currCol else currCol + 1
        val prevCol = if (currCol - j <= 0) 0 else currCol - 1

        val currValue = matrix(currRow)(currCol)
        val verticalIslandPath = (matrix(prevRow)(currCol) == 0 && matrix(nextRow)(currCol) == 0)
        val horizontalIslandPath = matrix(currRow)(prevCol) == 0 && matrix(currRow)(nextCol) == 0
        if (currValue == 1
          && (verticalIslandPath || horizontalIslandPath)) {
          results += ((currRow, currCol))
        }
      }
    }
    results
  }
}
