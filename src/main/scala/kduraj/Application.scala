package kduraj

/**
 * Algorithm for filling water into different size of buckets
 * until one bucket contains target amount of water
 * Written by: Kevin Duraj
 * October 24, 2015
 */

object Application extends App {

  println("Right to Left A=3,B=5,Target=4")
  println("------------------------------------")
  val bucket1 = new Buckets(3, 5, 4)
  bucket1.right2Left()
  println

  println("Left to Right A=3,B=5,Target=4")
  println("------------------------------------")
  val bucket2 = new Buckets(3, 5, 4)
  bucket2.right2Left()
  println

  println("Right to Left A=9,B=12,Target=6")
  println("------------------------------------")
  val bucket3 = new Buckets(9, 12, 6)
  bucket3.right2Left()
  println

  println("Left to Right A=9,B=12,Target=6")
  println("------------------------------------")
  val bucket = new Buckets(9, 12, 6)
  bucket.right2Left()
  println

}