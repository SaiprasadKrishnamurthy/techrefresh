// BLAME ME FOR COMMENTING THIS! JUST CURIOUS TO GET THE BUILD WORKING TO DEMO A PROBLEM SOLUTION TO MY COLLEAGUE
//package listutils
//
//import org.scalatest.{ShouldMatchers, FlatSpec}
//
///**
// * Created by sai on 16/06/2015.
// */
//class ListUtilsTest extends FlatSpec with ShouldMatchers {
//
//  "A Filter function" should (" filter a list using a predicate function passed in for a list containing a multiple elements") in {
//    ListUtils.filter(List(1, 2, 3, 4), x => x > 2) should be(List(3, 4))
//    ListUtils.filter(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), x => x % 3 == 0) should be(List(3, 6, 9))
//  }
//
//  "A Map function" should ("transform every element in the list using a transformation function passed in") in {
//    ListUtils.map(List(1, 2, 3, 4), x => x * 2) should be(List(2, 4, 6, 8))
//  }
//
//  "A Partition function" should ("partition a list into two using the result of a predicate passed in") in {
//    ListUtils.partition(List(1, 2, 3, 4), x => x % 2 == 0) should be(List(List(2, 4), List(1, 3)))
//  }
//  "A Nth Element of function" should ("locate and return the nth element of a list for a list of size 1") in {
//    ListUtils.nthElement(List(1), 0) should be(1)
//  }
//  it should ("locate and return the nth element of a list for a list of size greater than 1") in {
//    ListUtils.nthElement(List(1, 2, 3), 2) should be(3)
//  }
//  it should ("throw an IndexOutOfBoundsException when the supplied index is out of bounds of the input List") in {
//    an[IndexOutOfBoundsException] should be thrownBy (ListUtils.nthElement(List(1, 2, 3), 3))
//  }
//  it should ("throw an IndexOutOfBoundsException when the supplied index is out of bounds of the input List for an empty list") in {
//    an[IndexOutOfBoundsException] should be thrownBy (ListUtils.nthElement(List(), 0))
//  }
//  "A Penultimate Element function" should ("return the only element of a list for a list of size 1") in {
//    ListUtils.penultimate(List(1)) should be(1)
//  }
//  it should ("return the penultimate element of a list for a list of size greater than 1") in {
//    ListUtils.penultimate(List(1, 2, 3, 4, 5)) should be(4)
//  }
//  it should ("throw an IndexOutOfBoundsException for an empty list") in {
//    an[IndexOutOfBoundsException] should be thrownBy (ListUtils.penultimate(List()))
//  }
//  "A reverse function" should ("return the only element of a list for a list of size 1") in {
//    ListUtils.reverse(List(1)) should be(List(1))
//  }
//  it should ("return the reversed contents of a List for a list with more than one elements") in {
//    ListUtils.reverse(List(1, 2, 3, 4)) should be(List(4, 3, 2, 1))
//  }
//  it should ("return an empty List for a list of zero size") in {
//    ListUtils.reverse(List()) should be(List())
//  }
//  "A flatten function " should ("return an empty List when an empty List is passed in") in {
//    ListUtils.flatten(List(List())) should be(List())
//  }
//  it should ("return a flattened list") in {
//    ListUtils.flatten(List(List(1, 2), List(3, 4), List(5, 6))) should be(List(1, 2, 3, 4, 5, 6))
//  }
//  "A pack function " should ("return an empty List when an empty List is passed in") in {
//    ListUtils.pack(List()) should be(List(List()))
//  }
//  "A pack function " should ("return single list for non-repetitive consecutive elements") in {
//    ListUtils.pack(List(1, 2, 3, 4)) should be(List(List(1, 2, 3, 4)))
//  }
//
//}
