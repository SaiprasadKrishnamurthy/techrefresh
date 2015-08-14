package peakfinder

import org.scalatest.{ShouldMatchers, FlatSpec}

/**
 * Created by sai on 14/08/2015.
 */
class PeakFinderTest extends FlatSpec with ShouldMatchers {

  "A Peak finder " should "find the first peak in an array when it exists " in {
    PeakFinder.peakOf(Array(1, 3, 4, 3, 5, 6, 7)) should be(4)
  }

  it should "find the first peak in an array when more than one peak exists " in {
    PeakFinder.peakOf(Array(1, 3, 4, 3, 5, 4, 7)) should be(4)
  }

  it should "find the first peak in an array when peak exists at the end " in {
    PeakFinder.peakOf(Array(1, 3, 2, 3, 5, 10, 7)) should be(10)
  }

  it should "find the first peak in an array with equal elements " in {
    PeakFinder.peakOf(Array(1, 1, 1, 1, 1, 1, 1)) should be(1)
  }

  it should "find no peak for a non existent one " in {
    PeakFinder.peakOf(Array(1, 11, 13, 14, 15, 16, 17)) should be(-1)
  }

  it should "find no peak for an array with less than 3 elements " in {
    PeakFinder.peakOf(Array(1, 11)) should be(-1)
  }

  it should "find no peak for an empty array" in {
    PeakFinder.peakOf(Array()) should be(-1)
  }

}
