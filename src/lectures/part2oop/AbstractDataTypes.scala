package lectures.part2oop

object AbstractDataTypes extends App{

  //abstract
  abstract class Animal {
    val creatureType: String = "Wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat: Unit = println("crunch crunch")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "Fresh meat"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "Croc"

    override def eat: Unit = println("ñomñomñom")
    override def eat(animal: Animal): Unit = println(s"I'm a croc and i'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  //traits vs abstract classes
  // 1 -  traits do not have constrcuctor parameters
  // 2 -  multiple traits may be inherited by the same class
  // 3 -  traits = behavior / abstract = type of things
}
