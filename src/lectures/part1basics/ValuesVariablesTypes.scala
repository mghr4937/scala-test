package lectures.part1basics

object ValuesVariablesTypes extends App {
  //VAL
  val x: Int = 42 // inmutable
  println(x)

  val y = 8
  println(y)  //compiler can infer types

  val aString: String = "hshshshshshh"

  //VAR
  var a = 3242
  a = 3
  a += 3
  println(a)
}
