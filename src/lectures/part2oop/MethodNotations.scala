package lectures.part2oop

import scala.language.postfixOps

object MethodNotations extends App {


  class Person(val name: String, favouriteMovie: String, var age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie

    def hangOutWith(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"

    def +(nickname: String): Person = new Person(s"$name ($nickname)", favouriteMovie)

    def unary_! : String = s"$name what the heck!?"

    def unary_+ : Person = new Person(name, favouriteMovie, age + 1)

    def isAlive: Boolean = true

    def learns(item: String): String = s"${this.name} learning ${item}"

    def learnsScala = this learns "Scala"

    def apply(): String = s"Hi, my name is $name and I like $favouriteMovie"

    def apply(times: Int): String = s"$name watched $favouriteMovie $times times"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))

  //infix notation = operator notation (method with 1 parameter)
  //syntactic sugar
  println(mary likes "Inception") //equivalent

  //"operators" in scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)


  //ALL OPERATORS ARE METHODS
  //  println(mary + tom)
  //  println(mary.+(tom))

  //PREFIX NOTATIONS
  val x = -1 //equivalent with 1.unary_-
  val y = 1.unary_-

  println(!mary)
  println(mary.unary_!)

  //postfix notation
  println(mary.isAlive)
  println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())

  //1
  println((mary + "La Chama").apply())
  //2
  println((+mary).age)
  //3
  println(mary learns "Java")
  println(mary learnsScala)
  //4
  println(mary.apply(3))


}
