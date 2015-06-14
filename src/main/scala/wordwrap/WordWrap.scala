package wordwrap

import scala.collection.mutable.ListBuffer

/**
 * Created by sai on 13/06/2015.
 */
class WordWrap {

  // Mutable ListBuffer version to avoid frequent adds to immutable Lists for long words.
  def wrap(word: String, columnSize: Int): String = {
    word.split(" ").foldLeft(ListBuffer(""))((out, next) => {
      if ((out.last + " " + next).trim.length > columnSize) {
        out.append(next); out
      }
      else out.updated(out.size - 1, out.last + " " + next)
    }).mkString("\n").trim
  }

}
