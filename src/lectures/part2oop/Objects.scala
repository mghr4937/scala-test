package lectures.part2oop

object Objects extends App {

  object Person { //type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2;

    def canFly: Boolean = false;

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")
  }

  class Person(val name: String) {
    //instance-level functionality
  }

  //pattern COMPANIONS (object + class)

  println(Person.N_EYES)
  println((Person.canFly))

  //Scala objects = SINGLETON INSTANCE
  val person = Person
  val person2 = Person

  println(person == person2)

  val mary = new Person("Mary")
  val jon = new Person("Jon")

  println(mary == jon)

  val bobbie = Person.apply(mary, jon)
  val bobbie2 = Person(mary, jon)

  //Scala Applications = Sacala object with def main(args: Array[String]) : Unit


}
