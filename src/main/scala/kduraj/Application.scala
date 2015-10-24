package kduraj

object Application extends App {

  val maxA = 9
  val maxB = 12
  val target = 6

  println("\nWater Buckets - Fill Right to Left")
  println("----------------------------------")
  right2Left()

  println("\nWater Buckets - Fill Left to Right")
  println("----------------------------------")
  left2Right()

  def right2Left(): Unit = {

    val rightBucket = new Buckets(maxA, maxB)

    rightBucket.printContent()

    do {
      rightBucket.fullB().printContent()
      rightBucket.fillB2A().printContent()
    } while (rightBucket.A != maxA)

    // Keep empty bucket A and move from B to A until B=4

    do {
      rightBucket.emptyA().printContent()
      rightBucket.fillB2A().printContent()

      if (rightBucket.B != target) {
        rightBucket.fullB().printContent()
        rightBucket.fillB2A().printContent()
      }

    } while (rightBucket.B != target)

  }

  def left2Right(): Unit = {

    val leftBucket = new Buckets(maxA, maxB)

    leftBucket.printContent()

    // Keep filling bucket A and move to B until A=1
    do {
      leftBucket.fullA().printContent()
      leftBucket.fillA2B().printContent()
    } while (leftBucket.B != maxB)

    // Keep empty bucket B and move from A to B until B=4
    do {
      leftBucket.emptyB().printContent()
      leftBucket.fillA2B().printContent()

      if (leftBucket.B != target) {
        leftBucket.fullA().printContent()
        leftBucket.fillA2B().printContent()
      }

    } while (leftBucket.B != target)

  }

}