package puzzlers.linkedlist

/**
  * Created by saikris on 22/11/2015.
  */
object LLPuzzles {

  def main(args: Array[String]) {
    val linkedList = new LL
    linkedList.insertAtHead(1)
    linkedList.insertAtHead(2)
    linkedList.insertAtHead(3)
    linkedList.insertAtHead(4)
    println(linkedList.allNodesFromHead.map(_.data))
    println(linkedList.reverse.map(_.data))
    println("Is even length: "+linkedList.isEvenLength)
    println("Is even lengthX (iterative): "+linkedList.isEvenLengthX)
    println("Is even lengthX (recursive): "+linkedList.isEvenLengthX)
  }
}
