package filepredicate

import java.io.File

/**
  * Created by saikris on 08/11/2015.
  */
object FilePredicate {
  def find(filePredicate: (File) => Boolean, rootDir: File): List[File] = {
    def walk(f: File): Array[File] = {
      val these = if (f.isDirectory) f.listFiles else Array[File]()
      these ++ these.filter(filePredicate).flatMap(walk)
    }
    walk(rootDir).toList
  }
}
