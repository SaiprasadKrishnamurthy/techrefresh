package listutils

import org.scalatest.{ShouldMatchers, FlatSpec}

/**
 * Created by sai on 16/06/2015.
 */
class ListUtilsTest extends FlatSpec with ShouldMatchers {

  "A Filter function" should(" filter a list using a predicate function passed in for a list containing a multiple elements") in {
    ListUtils.filter(List(1,2,3,4), x => x>2) should be(List(3,4))
    ListUtils.filter(List(1,2,3,4,5,6,7,8,9,10), x => x%3 == 0) should be(List(3,6,9))
  }

  "A Map function" should ("transform every element in the list using a transformation function passed in") in {
    ListUtils.map(List(1,2,3,4), x => x * 2) should be (List(2,4,6,8))
  }

  "A Partition function" should ("partition a list into two using the result of a predicate passed in") in {
    ListUtils.partition(List(1,2,3,4), x => x %2 == 0) should be (List(List(2,4),List(1,3)))
  }


}
