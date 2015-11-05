package islandfinder

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import scala.collection.mutable.ListBuffer

/**
  * Created by saikrishnamurthy on 05/11/2015.
  */
class IslandFinderTest extends FlatSpec with ShouldMatchers {

  "An islanderFinder " should "find the coordinates of islands expressed as 1 bit in a 2D array" in {
    val arr =
      """0 0 0
        |1 1 1
        |0 0 0
      """.stripMargin

    val matrix = Array.ofDim[Int](3, 3)

    matrix(0)(0) = 0
    matrix(0)(1) = 0
    matrix(0)(2) = 0
    matrix(1)(0) = 1
    matrix(1)(1) = 1
    matrix(1)(2) = 1
    matrix(2)(0) = 0
    matrix(2)(1) = 0
    matrix(2)(2) = 0


    IslandFinder.find(matrix) should be(ListBuffer((1, 0), (1, 1), (1, 2)))


  }

  it should "find the coordinates of islands expressed as 1 bit in a 2D array when no island exist" in {
    val arr =
      """1 0 1
        |0 0 0
        |1 0 1
      """.stripMargin

    val matrix = Array.ofDim[Int](3, 3)

    matrix(0)(0) = 1
    matrix(0)(1) = 0
    matrix(0)(2) = 1
    matrix(1)(0) = 0
    matrix(1)(1) = 0
    matrix(1)(2) = 0
    matrix(2)(0) = 1
    matrix(2)(1) = 0
    matrix(2)(2) = 1


    IslandFinder.find(matrix) should be(ListBuffer())


  }
}
