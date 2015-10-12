package async

import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.util.{Failure, Success}

/**
 * Created by sai on 25/08/2015.
 */
object FutureFun extends App {

  val firstOccurrence: Future[Int] = Future {
    val source = scala.io.Source.fromFile("myText.txt")
    source.toSeq.indexOfSlice("myKeyword")
  }
  firstOccurrence onSuccess {
    case idx => println("The keyword first appears at position: " + idx)
  }
  firstOccurrence onFailure {
    case t => println("Could not process file: " + t.getMessage)
  }

  Await.ready(firstOccurrence, Duration.Inf)
}
