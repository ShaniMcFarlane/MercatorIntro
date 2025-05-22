object WedsCodeAlong extends App {

  val weather: String = "cold"

  //  IF/ELSE
  if (weather == "rainy") {
    println("Bring an umbrella")
  } else if (weather == "sunny") { // you can include as many else/if as needed
    println("Bring your sunnies")
  } else if (weather == "cold") {
    println("Bring a jumper")
  } else { // catch for anything not define in the else/ifs
    println("You're staying inside all day")
  }

  // Pattern Matching
  weather match {
    case "rainy" => println("Bring an umbrella")
    case "sunny" => println("Bring your sunnies")
    case "cold" => println("Bring a jumper")
    case _ => println("You're staying inside all day")
  }

  val season: String = "winter"
  //  How we approach when we have multiple options
  if (weather == "cold" || season == "winter") {
    println("Take a coat")
  } else {
    println("Bring a light jacket")
  }

  // Pattern matching with multiple conditions
  (weather, season) match {
    case (weather, season) if weather == "cold" || season == "winter" => println("Take a coat")
    case _ => println("Bring a light jacket")
  }

  //  INTs
  val age: Int = 18

  if (age < 0) {
    println("Enter a valid age")
  } else if (age >= 18) {
    println(s"You're an adult because you are $age years old")
  } else {
    println(s"You're a child because you are $age years old")
  }

  age match {
    case age if age < 0 => println("Enter a valid age")
    case age if age < 18 => println("You're a child")
    case age if age >= 18 => println("You're an adult")
  }

  //   Task 2

  val ageRating: Int = 88

  ageRating match {
    case age if age >= 18 => println("You can see '18' rated films")
    case age if age >= 15 => println("You can see '15' rated films")
    case age if age >= 12 => println("You can see '12A' rated films")
    case age if age >= 8 => println("You can see 'PG' rated films")
    case age if age >= 4 => println("You can see 'U' rated films")
    case _ => println("enter a valid age")
    // WRONG ??
  }

  // Options (getOrElse)
  val name: Option[String] = Some("Shani")
  val emptyName: Option[String] = None
  println(name)
  println(emptyName)

  def getName(name: Option[String]): String = name.getOrElse("User did not enter name")

  println(getName(name))
  println(getName(emptyName))

  // Try/Catch

  try {
    // All logic - eg if else/pattern match/method/val ect
    val number = "123".toInt // Change input to Int from String
    println(s"The number is $number")
  } catch {
    case error: NumberFormatException => println(s"$error is not a valid input") // error seen as e
  }

  // Afternoon Task
  //  1)
  //  A)
  val watermelons: Int = 4
  println("A: " + watermelons)

  //  B/C)
  if (watermelons > 5) {
    println(s"B: John has $watermelons, this is too many watermelons to carry!")
  } else if (watermelons <= 5 && watermelons >= 4) {
    println(s"B: John has $watermelons watermelons, he needs one bag!")
  } else if (watermelons <= 3 && watermelons >= 1) {
    println(s"B: John doesn't need a bag, hes only got $watermelons watermelons")
  } else {
    println("B: Please enter a valid number of watermelons!")
  }


  //  D
  val johnsBag: Boolean = false
  println("D: " + johnsBag)


  // E
  if (watermelons > 5 || watermelons == 5 && johnsBag == false) {
    println(s"E: John cant carry $watermelons watermelons, they're too heavy!")
  } else if (watermelons == 5 && johnsBag == true) {
    println(s"E: John has $watermelons watermelons, he only needs one bag")
  } else if (watermelons <= 3 && watermelons >= 1) {
    println(s"E: John has $watermelons watermelons, so he doesnt need a bag")
  } else if (watermelons <= 0) {
    println("E: Johns not buying watermelons today")
  } else {
    println("E: Does john have a bag?")
  }

  // Probably a much shorter way to do this lol

  // 2)

  try {
    val miles = "twenty".toInt

    def milesPaid(miles: Int): Double = {
      miles * 0.45
    }

    println(s"You are owed ${milesPaid(miles)}")
  } catch {
    case e: NumberFormatException => println(s"$e is not a valid input")
  }

  //  Extension
  //  1) -> Can be found on stack overflow/google/scala docs/geeks for geeks
  //  https://www.geeksforgeeks.org/operators-precedence-in-scala/
  //  ORDER OF PRECEDENCE --> from google ai
  //  Operators starting with *, /, % (multiplication, division, modulo)
  //  Operators starting with +, - (addition, subtraction)
  //  Operators starting with :, =, ! (colon, equals, not)
  //  Operators starting with <, >, = (less than, greater than, equals)
  //  Operators starting with &, ^, | (and, exclusive or, or)
  //  Operators starting with any letter, $, or _ (this includes the logical && and || operators)
  //  Using parentheses () to group expressions can override the default precedence

  //  If the left hand side of an && statement is FALSE, the whole statement is false and the right hand side will not be executed
  //  If the left hand side of || statement is TRUE, the right hand side won't execute because the whole statement is true
  //  NOT (!) is first / AND (&&) second /OR (||) last

  //  2) true
  val calc2 = (true || false && false)
  println("2: " + calc2)

  //  3) false
  val calc3 = ((true || false) && false)
  println("3: " + calc3)

  //  4) true ?
  val calc4 = (1 < 4 && 7 != 10 || 9 + 10 == 21)
  println("4: " + calc4)


}
