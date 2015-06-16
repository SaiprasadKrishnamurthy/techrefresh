def map(list: List[Int], function: Int => Int) = {
  def _map(input: List[Int], running: List[Int]): List[Int] = {
    println(input)
    if (input isEmpty) running
    else _map(input.tail, running :+ function(list.head))
  }
  _map(list, List())
}

map(List(1,2,3), x => x * 3)