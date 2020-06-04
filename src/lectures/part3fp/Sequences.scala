package lectures.part3fp

object Sequences extends App {

  //seq
  val aSequence = Seq(1, 20, 13, 4, 8, 15)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(7, 5, 6))
  println(aSequence.sorted)

  //Ranges
  val aRange: Seq[Int] = 1 until 10 //to, until
  aRange.foreach(println)

  (1 to 10).foreach(x => println("Hello " + x))

  val aList = List(1, 2, 3)
  val prepended = 42 +: aList :+ 89
  println(prepended)

  val apples5 = List.fill(5)("Apple")
  println(apples5)

  println(aList.mkString("-*-"))

  //arrays
  val numbers = Array(1, 2, 3, 4)
  val threeElements = Array.ofDim[Int](3) //have default values, like 0 or null
  println(threeElements)
  threeElements.foreach(println)

  //mutation
  numbers(2) = 0 //syntax sugar for numbers.update(2)
  println(numbers.mkString(" "))

  //arrays and seq
  val numberSeq: Seq[Int] = numbers //implicit conversion
  println(numberSeq)

  //vectors

}
