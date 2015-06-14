import scala.collection.immutable.ListMap
import scala.collection.mutable.ListBuffer

val n = 10
val literalsMapping = ListMap(1000 -> "M", 900 -> "CM", 500 -> "D", 400 -> "CD",  100 -> "C", 90 -> "XC", 50 -> "L", 40 -> "XL", 10 -> "X", 9 -> "IX", 5 -> "V", 4 -> "IV", 1 -> "I"  )

def foo(n: Int) = {
  def compute(residue: Int, denominators: List[Int]): String = {
    if(denominators.isEmpty) ""
    else {
      literalsMapping.get(denominators.head).get * (residue / denominators.head) + compute(residue % denominators.head, denominators.tail)
    }
  }
  compute(n, literalsMapping.keys.toList)
}

foo(109)




