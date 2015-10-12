package scratchpad

import java.util

/**
 * Created by sai on 28/09/2015.
 */
object BitsetFun {

  def main(args: Array[String]) {

    val docIds = 1 to 100 toList
    val bitset = new util.BitSet
    val b1 = new util.BitSet

    b1.set(0)
    docIds.foreach(id => if(id %2 == 0) bitset.set(id))

    println(b1)
  }

}
