package lectures.part4pm

import excercises.{Cons, Empty, MyList}

object AllThePatterns extends App {


  //1- constants
  val x: Any = "scala"
  val constants = x match {
    case 1 => "a number"
    case "scala" => "THE scala"
    case true => "The truth"
    case AllThePatterns => "A singleton object"
  }

  //2- match anything
  //2.1 wildcards
  val matchingAnything = x match {
    case _ =>
  }

  //2.2 variable
  val matchAVariable = x match {
    case something => s"I've found $something"
  }

  //3- tuples
  val aTuple = (1, 2)
  val matchATuple = aTuple match {
    case (1, 1) =>
    case(something, 2) => s""s"I've found $something"
  }

  val nestedTuple = (1 , (2, 3))
  val matchANestedTuple = nestedTuple match{
    case (_, (2, v)) =>
  }
  //PM's can be nested

  //4- case classes -constructor patter
  //PM can be nested with case classes
  val aList: MyList[Int] = Cons(1, Cons(2, Empty))
  val matchList = aList match {
    case Empty =>
    case Cons(head, Cons(subhead, subtail)) =>
  }

  //5 - List patterns
  val standardList = List(1,2,3,42)
  val standarListMatching = standardList match {
    case List (1 , _, _ ,_) => //extractor advance
    case List(1, _*) => //a list with arbitrary length - advance
    case 1 :: List(_) => //infix pattern
    case List(1,2,3) :+ 42 => //infix pattern
  }

  //6 - type specifiers
  val unknown: Any = 2
  val unknownMatch = unknown match {
    case list: List[Int] => //explicit type specifier
    case _ =>
  }

  //7- name binding
  val nameBindingMatch = aList match {
    case noneEmptyList @ Cons(_ ,_) => //name binding => use the name later(here)
    case Cons(1, rest @ Cons(2,1)) => //name binding inside nested patterns
  }

  //8 - multipatterns
  val multipattern = aList match {
    case Empty | Cons(0,_) => //compound pattern (multi-pattern)
  }

  //9 - if guards
  val secondElementSpecial = aList match {
    case Cons(_, Cons(specialElement, _)) if specialElement % 2 == 0 =>
  }



}
