package bitcountmatrix

import scala.collection.mutable.ListBuffer

/**
  * Created by saikrishnamurthy on 04/11/2015.
  */
object BitCountMatrix {
  def bitCount(matrix: Array[Array[Int]], bit: Int) = {

    val colBitsIndices = ListBuffer[Int]()
    val rowBitsIndices = ListBuffer[Int]()

    // Could do a recursive approach too. But that's not readable.
    for (i <- 0 until matrix.length) {
      for (j <- 0 until matrix.length) {
        if (matrix(i)(j) == bit && !colBitsIndices.contains(j)) colBitsIndices += j
        if (matrix(i)(j) == bit && !rowBitsIndices.contains(i)) rowBitsIndices += i
      }
    }
    (rowBitsIndices.size, colBitsIndices.size)
  }
}
