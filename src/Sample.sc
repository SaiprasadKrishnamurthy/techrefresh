import scala.annotation.tailrec

@tailrec
def peak(elements: Array[Int], start: Int, end: Int): Int = {
  val mid = (start + end) / 2
  if(start >= end) -1
  else if(elements(mid) >= elements(mid - 1) && elements(mid) >= elements(mid + 1)) elements(mid)
  else if (elements(mid) < elements(mid - 1)) peak(elements, start, mid)
  else peak(elements, mid, end)
}
println(peak(Array(1, 3, 4, 3, 5, 6, 7), 0, 7))

