import scala.annotation.tailrec
val arr = Array(3, 1, 2, 4, 3)

@tailrec
def foo(left: Array[Int], right: Array[Int], index: Int, res: Int): Int = {
  val leftSum = left.sum
  val rightSum = right.sum
  val diff = Math.abs(leftSum - rightSum)
  if(index == arr.length - 1) res
  else  foo(arr.splitAt(index + 1)._1, arr.splitAt(index + 1)._2, index +1, if(diff <= res) diff else res)
}

foo(arr.splitAt(1)._1, arr.splitAt(1)._2, 1, 1)


(1 to arr.length - 1)
  .map(arr.splitAt _)
  .map(split => Math.abs(split._1.sum - split._2.sum))
  .min

