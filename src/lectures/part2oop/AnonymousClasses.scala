package lectures.part2oop

object AnonymousClasses extends App{

  abstract class Animal {
    def eat: Unit
  }

  //anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("jajajajajaj")
  }
  /*
  equivalent with

  class AnonymousClasses$$anon$1 extends Animal{
  override def eat: Unit = println("jajajajajaj")
  }
  val funnyAnimal: Animal = new AnonymousClasses$$anon$1
   */

  println(funnyAnimal.getClass)

  class Person(name: String){
    def sayHi: Unit = println(s"Hi my name is $name")
  }


}
