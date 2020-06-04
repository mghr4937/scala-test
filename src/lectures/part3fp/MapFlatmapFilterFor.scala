package lectures.part3fp

object MapFlatmapFilterFor extends App {

  //standard list library implementation
  val list = List(1, 2, 3)
  println(list)
  println(list.head)
  println(list.tail)

  //map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  //filter
  println(list.filter(_ % 2 == 0))

  //flatmap
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  /*
      print all combination between two list
   */
  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c', 'd')

  val combination = numbers.flatMap(n => chars.map(c => "" + c + n))
  println(combination)

  val colors = List("Black", "White")

  //"iterating"
  val combination2 = numbers.flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + " - " + color)))
  println(combination2)

  //foreach
  list.foreach(println)

  //for-comprehensions
  val forCombinations = for {
    n <- numbers if n % 2 == 0 //filter
    c <- chars
    color <- colors
  } yield "" + c + n + " - " + color

  println(forCombinations)

  for {
    n <- numbers
  } println(n)

  //syntax overload
  list.map { x=>
    x * 2
  }


//      1. MyList supports for comprehensions? YES

//      2. A small collection of at most One element - Maybe [+T]
//        - map, filter, flatmap



}
