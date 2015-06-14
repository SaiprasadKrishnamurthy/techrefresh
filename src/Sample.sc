import scala.collection.mutable.ListBuffer

def wrap(word: String, columnSize: Int): String = {
  word.split(" ").foldLeft(ListBuffer(""))((out, next) => {
    if ((out.last + " " + next).trim.length > columnSize) {
      out.append(next); out
    }
    else out.updated(out.size - 1, out.last + " " + next)
  }).mkString("|").trim
}

wrap("Hello Scala WordWrapper a quite a long input", 9)