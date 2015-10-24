package kduraj

class Buckets {

  var step = 0
  val maxA = 3
  val maxB = 5

  var A = 0
  var B = 0

  def fullA(): Buckets = {
    step += 1
    A = 3
    this
  }

  def fullB(): Buckets = {
    step += 1
    B = 5
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
      A = A - (maxB-B)
      B += (maxB-B)
    } else {
      B = A + B
      A = 0
    }
    this

  }

  def fillB2A(): Buckets = {
    step += 1
    if ((B + A) > maxA) {
      B = B - (maxA-A)
      A += (maxA-A)
    } else {
      A = B
      B = 0
    }
    this
  }

  def printContent(): Unit = {
    println("Step: " + step + "\t\tA = " + A + "\t\tB = " + B + "\t\t")

  }
}
