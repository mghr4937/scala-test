package lectures.part2oop

object OOBasics extends App {

  val person = new Person("Juan", 55)

  println(person.age)
  person.greet("Ramiro")
  person.greet

  val author = new Writer("Charles", "Castro", 1980)
  val impostor = new Writer("Charles", "Castro", 1980)
  val novel = new Novel("Chimbones", 1998, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  println(novel.isWrittenBy(impostor))

  val counter = new Counter()
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(7)


  //constructor
  class Person(name: String, val age: Int = 0) {
    //body

    //method
    def greet(name: String): Unit = println(s"${this.name}, says: HI, $name")

    //overloading
    def greet(): Unit = println(s"Hi, I am $name")

    //multiple contructors
    def this(name: String) = this(name, 0)

    def this() = this("John Doe")
  }

  //class parameter are NOT FIELDS (val or var to make a field)

  class Writer(name: String, surname: String, val year: Int) {
    def fullName: String = name + " " + surname

  }

  class Novel(name: String, year: Int, author: Writer) {
    def authorAge = year - author.year

    def isWrittenBy(author: Writer) = author == this.author

    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }


  class Counter(val n: Int = 0) {
    def count = n

    def inc = {
      println("incrementing")
      new Counter(count + 1)
    } //immutability
    def desc = {
      println("decrementing")
      new Counter(count - 1)
    }

    def inc(n: Int): Counter = {
      if (n <= 0) this
      else inc.inc(n - 1)
    }

    def desc(n: Int): Counter = {
      if (n <= 0) this
      else inc.inc(n - 1)
    }

    def print = println(count)
  }

}