package lectures.part3fp

object TuplesAndMaps extends App{

  //tuples = finite ordered "lists"
  val aTuple = new Tuple2(2,"hello scala") //Tuple2[Int, String] = (Int, String)

  println(aTuple._1) //2
  println(aTuple.copy(_2 = "goodbye Java"))
  println(aTuple.swap)

  //Maps - keys -> values
  val aMap: Map [String,Int] = Map()

  val phonebook = Map(("Jim", 555), "Robert" -> 888).withDefaultValue(-1)
  //a -> b is sugar for (a, b)

  println(phonebook)

  //maps ops
  println(phonebook.contains("Jim"))
  println(phonebook("Jimmy"))
  println(phonebook("Jim"))

  //add a pairing
  val newPairing = "Mary" -> 677
  val newPhonebook = phonebook + newPairing
  println(newPhonebook)

  //functionals on maps
  //map, flatMap, filter
  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))

  //filterKeys
  println(phonebook.filterKeys(x => x.startsWith("J")))
  //mapValues
  println(phonebook.mapValues(number => "0202-" + number))


  //conversions to other collections
  println(phonebook.toList)
  println(List(("Daniel", 666)).toMap)
  val names = List("Bob", "Karl", "Ramon", "Billy")
  println(names.groupBy(name => name.charAt(0)))
}
