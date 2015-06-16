import scala.annotation.tailrec

val l = List(1,2,3)

1::l

@tailrec
def foo(ll: List[Int], acc: List[Int]): List[Int] = {
  if(ll.isEmpty) acc
  else foo(ll.tail, ll.head :: acc)
}

foo(l, List())