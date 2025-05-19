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
  println(crumble.likesTreats)

}
