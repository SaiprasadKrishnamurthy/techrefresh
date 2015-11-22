package median

import org.scalatest.{FlatSpec, ShouldMatchers}

/**
  * Created by saikris on 22/11/2015.
  */
class MedianSpec extends FlatSpec with ShouldMatchers {

  "median" should "find the median of two sorted arrays whose combined length is even" in {
    val arr1 = Array(1, 12, 15, 26, 38)
    val arr2 = Array(2, 13, 17, 30, 45)

    // 1,2,12,13,15,17,26,30,38,45 = 16

    Median.median(arr1, arr2) should be(16)
  }

  "median" should "find the median of two sorted arrays whose combined length is odd" in {
    val arr1 = Array(1, 12, 15, 26, 38, 40)
    val arr2 = Array(2, 13, 17, 30, 45)

    // 1,2,12,13,15,17,26,30,38,40,45 = 16

    Median.median(arr1, arr2) should be(17)
  }

  "median" should "find the median of two sorted arrays whose combined length is small" in {
    val arr1 = Array(1)
    val arr2 = Array(3)


    Median.median(arr1, arr2) should be(2)
  }

}
