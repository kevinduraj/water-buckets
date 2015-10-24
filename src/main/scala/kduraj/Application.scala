package kduraj

object Application extends App {

  val maxA = 3
  val maxB = 5
  val target = 4

  println("\nWater Buckets - Fill Right to Left")
  println("----------------------------------")
  val b1 = new Buckets(maxA, maxB, target)
  b1.right2Left()

  println("\nWater Buckets - Fill Left to Right")
  println("----------------------------------")
  val b2 = new Buckets(maxA, maxB, target)
  b2.left2Right()

}