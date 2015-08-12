package arrayintersect

import org.scalatest.{ShouldMatchers, FlatSpec}

/**
 * Created by sai on 12/08/2015.
 */
class ArrayIntersectTest extends FlatSpec with ShouldMatchers {

  "An Array intersector " should " find the intersecting elements given a 2 non empty arrays " in {
    ArrayIntersect.intersectionOf(Array(1, 2, 3, 4, 5), Array(2, 4, 6, 7, 10)) should be(List(2, 4));
  }

  it should " find the intersecting elements given a 2 non empty arrays with no common elements " in {
    ArrayIntersect.intersectionOf(Array(1, 2, 3, 4, 5), Array(11, 12, 13, 45)) should be(List());
  }

  it should " find the intersecting elements given a 2 empty arrays " in {
    ArrayIntersect.intersectionOf(Array(), Array()) should be(List());
  }

  it should " find the intersecting elements given a 1 empty and 1 non empty arrays " in {
    ArrayIntersect.intersectionOf(Array(1, 2, 3, 4, 5), Array()) should be(List());
  }

  it should " find the intersecting elements given a few negative numbers in the array " in {
    ArrayIntersect.intersectionOf(Array(-5, -3, -1, 2, 4, 5), Array(-1)) should be(List(-1));
  }

  it should " find the intersecting elements given a few negative numbers in the array again! " in {
    ArrayIntersect.intersectionOf(Array(-1), Array(-9, -1, 2, 3, 4)) should be(List(-1));
  }
}
