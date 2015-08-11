
def foo(target: Int, arr: Array[Int], arrLength: Int): Int = {

  def walk(currIndex: Int, collected: Set[Int]): Int = {
    if(currIndex == arr.length) -1
    else if(collected.size == target) currIndex
    else walk(currIndex + 1, if(arr(currIndex) <= target) collected + arr(currIndex) else collected)
  }
  walk(0, Set())
}

foo(5, Array(3,1,4,2,3,5,4), 7)