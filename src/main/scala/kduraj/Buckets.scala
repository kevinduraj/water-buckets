package kduraj

class Buckets(val maxA: Int, val maxB: Int, val target: Int) {

  var step = 0
  var bucketA = 0
  var bucketB = 0

  def fullA(): Buckets = {
    step += 1
    bucketA = maxA
    this
  }

  def fullB(): Buckets = {
    step += 1
    bucketB = maxB
    this
  }

  def emptyA(): Buckets = {
    step += 1
    bucketA = 0
    this
  }

  def emptyB(): Buckets = {
    step += 1
    bucketB = 0
    this
  }

  def fillA2B(): Buckets = {
    step += 1

    if ((bucketA + bucketB) > maxB) {
      bucketA = bucketA - (maxB - bucketB)
      bucketB += (maxB - bucketB)
    } else {
      bucketB = bucketA + bucketB
      bucketA = 0
    }
    this

  }

  def fillB2A(): Buckets = {
    step += 1
    if ((bucketB + bucketA) > maxA) {
      bucketB = bucketB - (maxA - bucketA)
      bucketA += (maxA - bucketA)
    } else {
      bucketA = bucketB
      bucketB = 0
    }
    this
  }

  def right2Left(): Unit = {

    printContent()

    do {
      fullB().printContent()
      fillB2A().printContent()
    } while (bucketA != maxA)

    // Keep empty bucket A and move from B to A until B=4

    do {
      emptyA().printContent()
      fillB2A().printContent()

      if (bucketB != target) {
        fullB().printContent()
        fillB2A().printContent()
      }

    } while (bucketB != target)

  }

  def left2Right(): Unit = {

    printContent()

    // Keep filling bucket A and move to B until A=1
    do {
      fullA().printContent()
      fillA2B().printContent()
    } while (bucketB != maxB)

    // Keep empty bucket B and move from A to B until B=4
    do {
      emptyB().printContent()
      fillA2B().printContent()

      if (bucketB != target) {
        fullA().printContent()
        fillA2B().printContent()
      }

    } while (bucketB != target)

  }

  def printContent(): Unit = {
    println("Step: " + step + "\t\tA = " + bucketA + "\t\tB = " + bucketB + "\t\t")
  }

}
