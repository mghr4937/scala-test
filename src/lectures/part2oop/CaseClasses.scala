package lectures.part2oop

object CaseClasses extends  App{

  /* standard methods
    equals, hashCode, toString
   */

  case class Person(name: String, age: Int)

  //1. class parameters are fields
  val jim = new Person ("Jim", 34)
  println(jim.name)

  //2. sensible toString
  // println(instance) = println(instance.toString)  syntactic sugar
  println(jim.toString)

  //3. equals and hashCode implemented OOTB
  val jim2 = new Person("Jim", 34)

  println(jim == jim2)

  //4. Case classes have handy copy methods
  val jim3 = jim.copy(age = 45)
  println(jim3)

  //5. CCs have companion objects
  val thePerson = Person
  val mary = Person.apply("Mary", 23)

  //6. CCs are serializables
  //Akka

  //7. CCs have extraxtor patterns = can be use in pattern matching

  case object UnitedKingdom {
    def name: String = "The UK of GB and NI"
  }

  /*
  Expand myList - use case classes and case objects
   */
}
