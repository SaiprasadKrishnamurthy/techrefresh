package stringsplitter

import scala.collection.mutable.ListBuffer

/**
  * Created by saikris on 08/11/2015.
  */
object StringSplitter {
  def split(input: Array[String]) = {
    def rec(start: Int, len: Int, acc: ListBuffer[String], res: String): Unit = {
      if ((start + len) <= input.length) {
        var res = ""
        for (i <- start until start + len) {
          res += input(i)
        }
        if (!acc.contains(res))
          acc += res
        rec(start, len + 1, acc, res)
        rec(start + 1, 1, acc, res)
      }
    }

    val b = ListBuffer[String]()
    rec(0, 1, b, "")
    b.toArray
  }

}
