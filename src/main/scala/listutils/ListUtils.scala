package listutils

import scala.annotation.tailrec

/**
 * Created by sai on 16/06/2015.
 */
object ListUtils {

  def nthElement(input: List[Int], n: Int): Int = {

    def compute(list: List[Int], counter: Int): Int = {
      if (list.isEmpty) throw new IndexOutOfBoundsException
      else if (counter == n) list.head
      else compute(list.tail, counter + 1)
    }

    compute(input, 0)
  }


  def map(list: List[Int], function: Int => Int) = {
    def _map(input: List[Int], running: List[Int]): List[Int] = {
      if (input isEmpty) running
      else _map(input.tail, running :+ function(input.head))
    }
    _map(list, List())
  }


  def filter(list: List[Int], predicate: Int => Boolean) = {
    def _filter(input: List[Int], running: List[Int]): List[Int] = {
      if (input isEmpty) running
      else if (predicate(input.head) == true) _filter(input.tail, running :+ input.head)
      else _filter(input.tail, running)
    }
    _filter(list, List())
  }

  def partition(ints: List[Int], function: Int => Boolean) = {
    def _partition(input: List[Int], trueList: List[Int], falseList: List[Int]): List[List[Int]] = {
      if (input isEmpty) List(trueList, falseList)
      else if (function(input.head)) _partition(input.tail, trueList :+ input.head, falseList)
      else _partition(input.tail, trueList, falseList :+ input.head)

    }
    _partition(ints, List[Int](), List[Int]())
  }

}
