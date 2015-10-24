package kduraj

object Application extends App {

  println("\nWater Buckets - Fill Right to Left")
  println("----------------------------------")
  right2Left()
  println("\nWater Buckets - Fill Left to Right")
  println("----------------------------------")
  left2Right()



  def right2Left(): Unit = {

    val buckets = new Buckets()

    buckets.printContent()

    buckets.fullB().printContent()
    buckets.fillB2A().printContent()

    // Keep empty bucket A and move from B to A until B=4
    do {
      buckets.emptyA().printContent()
      buckets.fillB2A().printContent()
      buckets.fullB().printContent()
      buckets.fillB2A().printContent()

    } while (buckets.B != 4)
  }

  def left2Right(): Unit = {

    val b = new Buckets()

    b.printContent()

    // Keep filling bucket A and move to B until A=1
    do {
      b.fullA().printContent()
      b.fillA2B().printContent()
    } while (b.A != 1)

    // Keep empty bucket B and move from A to B until B=4
    do {
      b.emptyB().printContent()
      b.fillA2B().printContent()
      b.fullA().printContent()
      b.fillA2B().printContent()

    } while (b.B != 4)

  }

}