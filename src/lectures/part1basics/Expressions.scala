package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2 //expression
  println(x)

  println(2 + 6 * 88)
  //+ - * / & | << >> >>> (right shift with zero expression)

  var aVariable = 2
  aVariable += 55 // -= *= /=
  println(aVariable)

  //Instructions (Do something) Vs Expressions (give the VALUE)

  //IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 //IF expression
  println(aConditionValue)
  println(if(aCondition) 88 else 55)

  var i = 0
  val aWhile = while(i < 10){   //never write this again
    println(i)
    i +=1
  }
  //EVERYTHING in scala is an expression

  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  //side effects: println(), whiles, reassigning

  //Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z < 1) "hello" else "goodbye" //value of the code block, last line
  }
  println(aCodeBlock)

  val someValue = { //Boolean
    2 < 3
  }

  val otherValue = {
    if (someValue) 269 else 222
    "opa"
  }
  println(otherValue)

}
