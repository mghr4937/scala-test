package lectures.part2oop

object Exceptions extends App {

  val x: String = null
  //println(x.length) will crash with NPE

  //throwing and catching exceptions
  //  val aWeirdValue = throw new NullPointerException

  //throwable classes extend the Throwable class
  //Exception(program ex. NPE) and Error(JVM error ex. Stack over fLow) are the major Throwable subtypes

  //how to catch Exceptions
  def getInt(withException: Boolean): Int =
    if (withException) throw new RuntimeException("No Int for you")
    else 42

  val potentialFail = try {
    //coda that might fail
    getInt(true)
  } catch {
    case e: RuntimeException => println("Cought a Runtime exception")
  } finally {
    //code that will get executed NO MATTER WHAT
    //does not influence the return type of this expression
    //use for side effects
    println("finally")
  }

  //3. how to define toyr own exceptions
  class MyException extends Exception

  val ex = new MyException

  //throw ex

  //crash with OutOfMemoryError OOM
  //val array = Array.ofDim(Int.MaxValue)

  //crash with SOError
  def infinite: Int = 1 + infinite

  //val noLimit = infinite

  //PocketCalculator
  // add(x,y) subtract(x,y) miltiply(x,y) divide(x,y)
  /*
   throw OverflowException if add(x,y) exceeds int.MAX_VALUE
   throw UnderflowException if subtract(x,y) exceeds int.MIN_VALUE
   MathCalculationException for division by 0
   */
  class OverflowException extends RuntimeException

  class UnderflowException extends RuntimeException

  class MathCalculationException extends RuntimeException("Division by 0")

  object PocketCalculator {
    def add(x: Int, y: Int) = {
      val result = x + y

      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0) throw new UnderflowException
      else result
    }

    def subtract(x: Int, y: Int) = {
      val result = x - y

      if (x > 0 && y < 0 && result < 0) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def multiply(x: Int, y: Int) = {
      val result = x * y

      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y < 0 && result < 0) throw new OverflowException
      else if (x > 0 && y < 0 && result > 0) throw new UnderflowException
      else if (x > 0 && y > 0 && result < 0) throw new UnderflowException
      else result
    }

    def devide(x: Int, y: Int) = {
      if (y == 0) throw new MathCalculationException
      else x / y
    }


  }

  //println(PocketCalculator.add(Int.MaxValue, 10))
//  println(PocketCalculator.subtract(Int.MinValue, 100))
//  println(PocketCalculator.multiply(Int.MinValue, 100))
  println(PocketCalculator.devide(4 , 0 ))

}
