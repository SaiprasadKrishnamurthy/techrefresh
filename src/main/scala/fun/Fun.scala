package fun

import java.util.zip.Deflater

/**
 * Created by sai on 20/08/2015.
 */
object Fun extends App {
  /*  (1 to 7).foreach(i => (i to 7).map(j => (j to 7).foreach(k => {
    print(s"${Integer.parseInt("100001010110011000101".subSequence(0, i).toString, 2).toChar}${Integer.parseInt("100001010110011000101".subSequence(i, i + j).toString, 2).toChar}${Integer.parseInt("100001010110011000101".subSequence(j + k, "100001010110011000101".length).toString, 2).toChar}\r"); Thread.sleep(50)
  }
  )))
*/


  val x = """
            |
            |        _____               ____             ____       ____________            _____             ______   _____             _____     ______   _______
            |   _____\    \_         ____\_  \__      ____\_  \__    \           \          |\    \            \     \  \    \       _____\    \_  |\     \  \      \
            |  /     /|     |       /     /     \    /     /     \    \           \          \\    \            \    |  |    |      /     /|     |  \\     \  |     /|
            | /     / /____/|      /     /\      |  /     /\      |    |    /\     |          \\    \            |   |  |    |     /     / /____/|   \|     |/     //
            ||     | |_____|/     |     |  |     | |     |  |     |    |   |  |    |           \|    | ______    |    \_/   /|    |     | |____|/     |     |_____//
            ||     | |_________   |     |  |     | |     |  |     |    |    \/     |            |    |/      \   |\         \|    |     |  _____      |     |\     \
            ||\     \|\        \  |     | /     /| |     | /     /|   /           /|            /            |   | \         \__  |\     \|\    \    /     /|\|     |
            || \_____\|    |\__/| |\     \_____/ | |\     \_____/ |  /___________/ |           /_____/\_____/|    \ \_____/\    \ | \_____\|    |   /_____/ |/_____/|
            || |     /____/| | || | \_____\   | /  | \_____\   | /  |           | /           |      | |    ||     \ |    |/___/| | |     /____/|  |     | / |    | |
            | \|_____|     |\|_|/  \ |    |___|/    \ |    |___|/   |___________|/            |______|/|____|/      \|____|   | |  \|_____|    ||  |_____|/  |____|/
            |        |____/         \|____|          \|____|                                                              |___|/          |____|/
          """.trim()

  println("val map = "+x.toList.map(_.toInt).map(_.toHexString).mkString(""))


  println("val keys = "+x.toList.map(_.toInt).map(_.toHexString).map(_.length))
}
