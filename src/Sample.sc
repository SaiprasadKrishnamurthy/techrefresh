def balance(chars: List[Char])  = {


  def check(l: List[Char], balance: Int): Int = {
      if(l.isEmpty) balance
      else {
        val curr = l.head
        if(curr.equals('(')) check(l.tail, balance+1)
        else if(curr.equals(')')) check(l.tail, balance-1)
        else check(l.tail, balance)
      }
  }
  check(chars, 0) == 0
}

balance("()(()".toList)