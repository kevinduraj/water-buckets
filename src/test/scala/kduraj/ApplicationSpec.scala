package kduraj

import org.specs2.mutable._

class ApplicationSpec extends Specification {

  "Right to Left 3,5,4 Bucket B" should {
    val bucket = new Buckets(3, 5, 4)
    bucket.right2Left()
    "have value 4" in { bucket.B == 4 }
    println
  }

  "Left to Right 3,5,4 Bucket B" should {
    val bucket = new Buckets(3, 5, 4)
    bucket.right2Left()
    "have value 4" in { bucket.B == 4 }
    println
  }

  "Right to Left 9,12,6 Bucket B" should {
    val bucket = new Buckets(9, 12, 6)
    bucket.right2Left()
    "have value 6" in { bucket.B == 6 }
    println
  }

  "Left to Right 9,12,6 Bucket B" should {
    val bucket = new Buckets(9, 12, 6)
    bucket.right2Left()
    "have value 6" in { bucket.B == 6 }
    println
  }
}
