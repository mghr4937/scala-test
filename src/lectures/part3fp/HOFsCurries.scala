package lectures.part3fp

object HOFsCurries extends App {

  val superFunction: (Int, (String, (Int => Boolean)) => Int) => (Int => Int) = null
  //higher order functions HOF
  // map, flatMap, filer in My list (have a function as a parameter)

  //function that applies a function n timer over value x
  //nTimes(f, n, x)
  //nTimes(f, n, 3) = f(f(f(x)) = nTimes(f, 2, f(x))
  def nTimes(f: Int => Int, n: Int, x: Int): Int =
    if (n <= 0) x
    else nTimes(f, n - 1, f(x))

  val plusOne = (x: Int) => x + 1

  println(nTimes(plusOne, 10, 1))

  //ntb(f,n) = f(f(f...(x)))
  //increment10 = ntb(plusOne, 10) = x => plusOne(plusOne...(x))
  def nTimesBetter(f: Int => Int, n: Int): (Int => Int) =
    if (n <= 0) (x: Int) => x
    else (x:Int) => nTimesBetter(f, n-1)(f(x))


  val plus10 = nTimesBetter(plusOne, 10)
  println(plus10(1))

  //curried functions
  val superAdder: Int => (Int => Int) = (x: Int) => (y: Int) => x + y
  val add3 = superAdder(3) //y => 3 + y
  println(add3(10))
  println(superAdder(3)(10))

  //functions with multiple parameter lists
  def curriedFormatter(c: String)(x:Double):String = c.format(x)

  val standardFormat: (Double => String) = curriedFormatter("%4.2f")
  val preciseFormat: (Double => String) = curriedFormatter("%10.8f")

  println(standardFormat(Math.PI))
  println(preciseFormat(Math.PI))

  /*

   */

}
