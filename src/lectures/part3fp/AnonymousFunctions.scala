package lectures.part3fp

object AnonymousFunctions extends App {

  //anonymous functions (LAMBDA)
  val doubler = (x: Int) => x * 2

  //multiple params
  val adder = (a: Int, b:Int) => a + b

  //no params
  var justDoSomething = () => 3

  //careful
  println(justDoSomething)
  println(justDoSomething())

  //curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  //MOAR syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 //equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ //equivalent to (a,b) => a + b


  /*
   1. MyList replace all FunctionX calls with lambdas
   2. Rewrite the "special" adder as an anonymous function
   */


  //2.
  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(4))
}
