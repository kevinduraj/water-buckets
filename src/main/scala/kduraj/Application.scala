package kduraj

object Application extends App {

<<<<<<< HEAD
  println("\nWater Buckets - Fill Right to Left")
  println("----------------------------------")
  right2Left()
=======
  //println("\nWater Buckets - Fill Right to Left")
  //println("----------------------------------")
  //right2Left()
>>>>>>> 6a86de1b9ba39bb100f6c31b45f62a141efce627
  println("\nWater Buckets - Fill Left to Right")
  println("----------------------------------")
  left2Right()


<<<<<<< HEAD

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
=======
  def left2Right(): Unit = {

    val b = new Buckets()

    /*0*/ b.printContent()

    /*1*/ b.fullA().printContent()
    /*2*/ b.fillA2B().printContent()

    /*3*/ b.fullA().printContent()
    /*4*/ b.fillA2B().printContent()

    /*5*/ b.emptyB().printContent()
    /*6*/ b.fillA2B().printContent()

    /*7*/ b.fullA().printContent()
    /*8*/ b.fillA2B().printContent()

  }


  def right2Left(): Unit = {

    val buckets = new Buckets()

    /*0*/ buckets.printContent()

    /*1*/ buckets.fullB().printContent()
    /*2*/ buckets.fillB2A().printContent()

    /*3*/ buckets.emptyA().printContent()
    /*5*/ buckets.fillB2A().printContent()

    /*6*/ buckets.fullB().printContent()
    /*7*/ buckets.fillB2A().printContent()
>>>>>>> 6a86de1b9ba39bb100f6c31b45f62a141efce627

  }

}