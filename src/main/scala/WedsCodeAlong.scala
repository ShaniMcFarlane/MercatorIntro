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




}
