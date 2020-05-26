package lectures.part2oop

import lectures.part2oop.Generics.Animal

object Generics extends App {

  class MyList[A]{
    //use the type A
    def add[B >: A](element: B): MyList[B] = ???
    /*
    A = Cat
    B = Animal
     */
  }

  val listOfIntegers = new MyList[Int]
  val listOfString = new MyList[String]

  class MyMap[Key, Value]

  //generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfInetegers = MyList.empty[Int]


  //variance problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //1. yes List[Cat] exteneds List [Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
//  animalList.add(new Dog) ==> we return a list of Animal

  //2. No = INVARIANCE
  class InvariantList[A]
  val invariantList: InvariantList[Animal] = new InvariantList[Animal]

  //3. Hell, no! CONTRAVARIANCE
  class ContravariantList[-A]
  val contravariantList: ContravariantList[Cat] = new ContravariantList[Animal]

  //bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  //val car = new Cage(new Car)



}


