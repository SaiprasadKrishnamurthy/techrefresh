package stringcompression

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

/**
  * Created by saikrishnamurthy on 04/11/2015.
  */
class StringCompressionTest extends FlatSpec with ShouldMatchers {

  "stringCompressor" should "compress string with repeating sequences" in {
    val uncompressed = "AADDBBBBCEEEAAAAA"
    val compressed = "A2D2B4CE2A5"
    StringCompression.compress(compressed) should be (compressed)
  }

  it should "not compress string with non repeating sequences" in {
    val uncompressed = "ABCDEFGH"
    val compressed = "ABCDEFGH"
    StringCompression.compress(compressed) should be (compressed)
  }

  it should "not compress string with unit length" in {
    val uncompressed = "A"
    val compressed = "A"
    StringCompression.compress(compressed) should be (compressed)
  }

}
