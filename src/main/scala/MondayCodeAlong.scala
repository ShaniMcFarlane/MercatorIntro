object MondayCodeAlong extends App {
  // val = best practice
  val melons = 5 * 50
  val apples = 2 * 10
  val drinks = 6 * (100 * 1.20)
  //  val total = melons + apples + drinks

  // var - mutable (NOT best practice)
  var total: Double = 0
  total = total + apples
  println(total)
  total = total + melons
  println(total)
  total = total + drinks
  println(total)

  println(melons)
  println(apples)
  println(drinks)
  println(total)

  //  TYPES
  val wholeNumber: Int = 555
  val littleNumber: Short = 55 // Rare - use Int
  val bigNumber: Long = 5093258092309423L // Must use L at the end
  val littleDecimal: Float = 5.356789f // Must use f at the end - Rare
  val decimal: Double = 565656.987 // Most commonly used - larger memory space
  val text: String = "Hello World!"
  val trueFalse: Boolean = true // false
  val falseTrue: Boolean = false

  println(trueFalse == falseTrue)

  //  Operators
  val a: Int = 10
  val b: Int = 15
  val c: Int = 5

  val add: Int = a + b
  val sub: Int = a - c
  val div: Int = b / c
  val multi: Int = a / c
  val mod: Int = 10 % 5 // 0 = even / 1 = odd

  val even: Int = a % 2 // left with 0 -> must be even

  println(add)
  println(sub)
  println(div)
  println(multi)
  println(mod)

  println(even)

  //  Relational
  val equality: Boolean = a == a
  val inequality: Boolean = a != b
  val lessThan: Boolean = b < c
  val lessThanEqualTo: Boolean = c <= a
  val greaterThan: Boolean = b >= c
  val greaterThanEqualTo: Boolean = a >= c

  println(equality)
  println(inequality)
  println(lessThan)
  println(lessThanEqualTo)
  println(greaterThan)
  println(greaterThanEqualTo)

  //  Logical
  val and: Boolean = true && true // both sides MUST be true to return ture
  val or: Boolean = true || false // either side can be true to return true
  val not: Boolean = !false

  //  Methods
  def makeACupOfTea(sugar: Int, milk: Boolean): String = {
    s"Your tea is ready, it has $sugar spoons of sugar. Your milk selection is $milk!"
  }

  println(makeACupOfTea(5, milk = true)) // calling the method
  println(makeACupOfTea(19, milk = false))

  val vat: Double = 1.2

  def priceWithVat(price: Double): Double = {
    price * vat
  }

  println(priceWithVat(10.0))

  //  Classes (think of these as a type)
  //  set of instructions
  class Dog(val name: String, val age: Int, val likesTreats: Boolean) {
    def speak: String = "woof" // declared in advance --> same for every dog!
  }

  //  use VAL in parameters to make them accessible outside of class
  //  use class to make objects (e.g. Dog)
  //  Object of type dog
  val crumble: Dog = new Dog("Crumble", 2, true)
  //   how to access? --> use .function on object name
  println(crumble.speak)
  println(crumble.name)
  println(crumble.age)
  //  println(crumble.likesTreats)

  //  Afternoon Task
  //    --> Question 1
  val one: Boolean = 3 + 4 * 57 < 300
  println(one)

  val two: Boolean = 144 / 12 >= 12
  println(two)

  val three: Boolean = "Cat" < "Dog"
  println(three)
  //  compare strings lexicographically (like in a dictionary) c (67) comes before d (68) --> string comparisons are done character by character

  val four: Boolean = "Rabbit" < "Hamster"
  println(four)

  def five(num: Int): Boolean = {
    num % 2 != 0
  }

  println(five(17))

  val six: Boolean = 75 / 9 < 30 && 89 / 6 < 20
  println(six)

  //   --> Question 2
  val stringOne: String = "I love scala already"
  println("I love scala already")
  //  printLn prints the string to the terminal | the var just stores the string

  //   --> Question 3
  def squareMethod(num: Int): Int = {
    num * num
  }

  println(squareMethod(5))

  //  --> Question 4
  def oddNum(num: Int): Boolean = {
    num % 2 != 0
  }

  println(oddNum(5))

  //  --> Question 5
  class Book(val Title: String, val Author: String, val Year: Int, val Genre: String) {
    def isLong(pages: Int): Boolean = {
      pages >= 500
    }
  }

  val bookOne = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction")
  println(bookOne.isLong(180))

  //  Extension
  //  --> Question 1
  val lowToUpperCase: String = "hello world!".toUpperCase
  println(lowToUpperCase)

  //   --> Question 2
  val firstLetterUpperCase: String = "hello world!".capitalize
  println(firstLetterUpperCase)

  //  --> Question 3
  val sOne: String = "STRING"
  val sTwo: String = "string"

  println(sOne == sTwo) // Returns false --> ASCII numbers are different for lowercase and uppercase characters / Scala is case-sensitive

  // --> Question 4
  //  no, one is a string --> there is no simple conversion
  //  .toInt only works on strings that contain numerical values

  // --> Question 5
  //  val toString: String = (1).toString
  //  println(toString)
  //  cant convert 1.toString gives you "1"

  // --> Question 6
  val convertInt: Int = 1
  val converted = convertInt.toString
  println(converted)
  println(converted).getClass
  // Bit confused with this one?

  //  Research

  // --> Question 1
  //  val new: String = "Hello World!"
  //  println(new)
  //  illegal start of simple pattern --> Error --> new is a keyword so it cant be used as a variable name

  // --> Question 2
  val `new`: String = "Hello World!"
  println(new)
  // use backticks to help it compile
  // other words that cannot be used --> class, def, object, else, if, var, val

  // Question 3
  // Case Classes --> Simple data containers - Book/Dog/User ect
  // Classes --> Behavioural control - inheritance or mutability
  // need more explanation

}
