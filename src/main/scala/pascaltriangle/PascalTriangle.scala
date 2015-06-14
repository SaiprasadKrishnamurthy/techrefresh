package pascaltriangle

/**
 * Created by sai on 14/06/2015.
 */
object PascalTriangle {

  def main(args: Array[String]) {

    def pascal(c: Int, r: Int): Int = {
        if(c == 0 || r == c) 1 else pascal(c, r - 1) + pascal(c - 1, r - 1)
    }
  }
}
