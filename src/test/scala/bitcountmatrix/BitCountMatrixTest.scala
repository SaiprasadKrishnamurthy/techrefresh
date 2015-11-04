package bitcountmatrix

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

/**
  * Created by saikrishnamurthy on 04/11/2015.
  */
class BitCountMatrixTest extends FlatSpec with ShouldMatchers {

  "matrixBitCount" should "count the 1 bits for an N X N matrix when the bits are only in the first row" in {
    val matrix = Array.ofDim[Int](5, 5)
    (0 to 4) foreach (colIndex => matrix(0)(colIndex) = 1)

    BitCountMatrix.bitCount(matrix, 1) should be(1, 5)

  }

  it should "count the 1 bits for an N X N matrix when the bits are sparsely located" in {
    val matrix = Array.ofDim[Int](5, 5)
    (0 to 4) foreach (colIndex => matrix(0)(colIndex) = 1)
    (0 to 4) foreach (rowIndex => matrix(rowIndex)(0) = 1)


    BitCountMatrix.bitCount(matrix, 1) should be(5, 5)

  }

}
