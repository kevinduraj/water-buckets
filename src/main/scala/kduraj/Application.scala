package kduraj

object Application extends App {

  //println("\nWater Buckets - Fill Right to Left")
  //println("----------------------------------")
  //right2Left()
  println("\nWater Buckets - Fill Left to Right")
  println("----------------------------------")
  left2Right()


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

  }

}