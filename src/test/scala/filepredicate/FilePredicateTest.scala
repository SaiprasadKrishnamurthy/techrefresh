package filepredicate

import java.io.File
import java.nio.file.Paths

import org.scalatest.{FlatSpec, ShouldMatchers}

/**
  * Created by saikris on 08/11/2015.
  */
class FilePredicateTest extends FlatSpec with ShouldMatchers {

  "filePredicate" should "recursively list the files for always true predicate" in {
    val rootDir = Paths.get(System.getProperty("user.dir"), "src", "test", "resources").toFile
    println(rootDir)
    val filesOnly  = (f: File) => f.isFile
    FilePredicate.find(filesOnly, rootDir).size should be(2)
  }

}
