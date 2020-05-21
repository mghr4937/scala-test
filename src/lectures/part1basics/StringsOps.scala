package lectures.part1basics

object StringsOps extends App {

  val str:String = "hello i am learning scala"

  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("hello"))

  //Scala specific: String interpolators

  //S-interpolators
  val name = "Rulo"
  val age = 22
  val greeting = s"Hello, my name is $name and I am $age years old"
  val greeting2 = s"Hello, my name is $name and I am ${age +1} years old"

  //F-interpolators
  val speed = 1.2f
  val myth = f"$name con eat $speed%2.2f panchos per minute"

  println(myth)

  //raw-interpolator
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")
}
