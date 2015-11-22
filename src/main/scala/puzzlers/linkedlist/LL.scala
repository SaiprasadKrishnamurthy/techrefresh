package puzzlers.linkedlist

import scala.annotation.tailrec

/**
  * A simple LinkedList representation.
  * Created by saikris on 22/11/2015.
  */

class LN(val data: Int) {
  var next: LN = _
}

class LL {
  var head: LN = _

  def insertAtHead(data: Int) = {
    val node = new LN(data)
    if (head == null) {
      head = node
    }
    else {
      node.next = head
      head = node
    }
  }

  def allNodesFromHead = {
    @tailrec
    def walk(node: LN, res: List[LN]): List[LN] = {
      if (node == null) res
      else walk(node.next, res :+ node)
    }
    walk(head, List())
  }

  def reverse = {
    @tailrec
    def walk(node: LN, res: List[LN]): List[LN] = {
      if (node == null) res
      else walk(node.next, res.+:(node))
    }
    walk(head, List())
  }

  def isEvenLength = {
    @tailrec
    def walk(node: LN, length: Int): Boolean = {
      if (node == null) length % 2 == 0
      else walk(node.next, length + 1)
    }
    walk(head, 0)
  }

  def isEvenLengthX = {
    var temp = head
    while(temp != null && temp.next != null) {
      temp = temp.next.next
    }
    temp == null
  }

  def isEvenLengthXRecursive = {
    @tailrec
    def walk(curr: LN): Boolean = {
      if(curr == null || curr.next == null) curr != null
      else walk(curr.next.next)
    }
    walk(head)
  }

  def mergeTwoInAscendingOrder(list1: LL, list2: LL) = {

    def merge(node1: LN, node2: LN) = {

    }
  }
}
