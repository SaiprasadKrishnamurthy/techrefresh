import scala.annotation.tailrec

val x = List(5, 5, 0, 1, 3, 5, 5)
val element = 5
def matching(n: Int) = n == element
def notMatching(n: Int) = n != element


val split = x.splitAt(3)
val l = (split._1, split._2.tail)

l._1.count(matching)
l._2.count(matching)

l._1.count(notMatching)
l._2.count(notMatching)


@tailrec
def foo(currIndex: Int, leftMatches: Int, rightMatches: Int, leftMismatches: Int, rightMismatches: Int): Int = {
  if (currIndex == x.size - 1) -1
  else if (leftMatches == rightMatches && leftMismatches == rightMismatches) currIndex
  else {
    val split = x.splitAt(currIndex)
    val l = (split._1, split._2.tail)
    foo(currIndex + 1, l._1.count(matching), l._2.count(matching), l._1.count(notMatching), l._2.count(notMatching))
  }

}





