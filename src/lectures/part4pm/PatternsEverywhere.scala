package lectures.part4pm

object PatternsEverywhere extends App{

  try{
    //code
    catch{
      case e: RuntimeException => "runtime"
      case e: NullPointerException => "null"
      case _ => "something else"
    }
  }

  //catches are actually matches
  //generator are also based on pattern matching


  //multiple value definitions based on PM
  val tuple = (1,2,3)
  val (a,b,c) = tuple
  println(b)

  val list = List (1,2,3)
  val head :: tail = list
  println(head)
  println(tail)
}
