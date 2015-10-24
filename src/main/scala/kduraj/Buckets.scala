package kduraj

class Buckets(val maxA: Int, val maxB: Int, val target: Int) {

  var step = 0
  var A = 0
  var B = 0

  def fullA(): Buckets = {
    step += 1
    A = maxA
    this
  }

  def fullB(): Buckets = {
    step += 1
    B = maxB
    this
  }

  def emptyA(): Buckets = {
    step += 1
    A = 0
    this
  }

  def emptyB(): Buckets = {
    step += 1
    B = 0
    this
  }

  def fillA2B(): Buckets = {
    step += 1

    if ((A + B) > maxB) {
      A = A - (maxB - B)
      B += (maxB - B)
    } else {
      B = A + B
      A = 0
    }
    this

  }

  def fillB2A(): Buckets = {
    step += 1
    if ((B + A) > maxA) {
      B = B - (maxA - A)
      A += (maxA - A)
    } else {
      A = B
      B = 0
    }
    this
  }

  def right2Left(): Unit = {

    printContent()

    do {
      fullB().printContent()
      fillB2A().printContent()
    } while (A != maxA)

    // Keep empty bucket A and move from B to A until B=4

    do {
      emptyA().printContent()
      fillB2A().printContent()

      if (B != target) {
        fullB().printContent()
        fillB2A().printContent()
      }

    } while (B != target)

  }

  def left2Right(): Unit = {

    printContent()

    // Keep filling bucket A and move to B until A=1
    do {
      fullA().printContent()
      fillA2B().printContent()
    } while (B != maxB)

    // Keep empty bucket B and move from A to B until B=4
    do {
      emptyB().printContent()
      fillA2B().printContent()

      if (B != target) {
        fullA().printContent()
        fillA2B().printContent()
      }

    } while (B != target)

  }

  def printContent(): Unit = {
    println("Step: " + step + "\t\tA = " + A + "\t\tB = " + B + "\t\t")
  }

}
