package lectures.part2oop

object Inheritance extends App {

  //Single class Inheritance
  class Animal {
    val creatureType = "Wild"
    def eat = println("Ñom ñom ñom")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("prrrprr prrrprr")
    }
  }

  val cat = new Cat
  cat.crunch

  //  constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)
  class Adult2(name: String, age: Int, idCard: String) extends Person(name)

  //overriding
  class Dog( override val creatureType: String = "Domestic") extends Animal {
//    override val creatureType: String = "Domestic"
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }

//  class Dog2(dogType: String) extends Animal{
//    override val creatureType: String = dogType
//  }
  val dog = new Dog
  dog.eat
  println(dog.creatureType)

  //type substitution
  val unkAnimal: Animal = new Dog("K9")
  unkAnimal.eat

  //overRridign vs overLoading

  //preventing overrides
  // "final" on member, will prevent to be ovverides
  // "final" on the entire class
  // "sealed" allow extend classes in this file, prevent extension in other files
}
