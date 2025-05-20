import javax.swing.InputMap

object TuesCollectionsCodeAlong extends App {

  //  Set
  val setOne: Set[Int] = Set(1, 2, 3, 4, 5, 5) // Not ordered, no duplicate numbers
  println("First Set: " + setOne)

  //  Sequence
  val seqOne: Seq[Int] = Seq(1, 2, 3, 4, 5, 5) // Ordered, allows repeat values
  println("First Seq: " + seqOne)

  //  Map
  val mapOne: Map[String, Int] = Map(
    "one" -> 1,
    "two" -> 2,
    "three" -> 3,
    "four" -> 4,
    "five" -> 5
  )
  println("Map one: " + mapOne)
  // Key -> value pairs --> 2 params
  // Keys must be unique -> no 2 keys can be the same, the duplicate will be removed

  //  Accessing Data
  val getSeqHead: Int = seqOne.head // Index 0 (first element)
  println("Seq Head: " + getSeqHead)

  val getSeqTail: Seq[Int] = seqOne.tail // Everything but the head
  println("Seq Tail: " + getSeqTail)

  val getSeqIndex: Int = seqOne(3) // Only works with ordered collections
  println("Seq Index: " + getSeqIndex)

  //  Set
  val getSetIndex = setOne(3) // Checks if (value) is in the set / can also use .contains(3) / gives boolean value
  println(getSetIndex)

  // Often filter for info
  val filterSet: Set[Int] = setOne.filter(_ < 3)
  println("Filter Set: " + filterSet)

  val filterNotSet: Set[Int] = setOne.filterNot(_ < 3)
  println("FilterNot Set: " + filterNotSet)

  val evenSet: Set[Int] = setOne.filter(_ % 2 == 0)
  //  val evenSet: Set[Int] = setOne.filter.not(_ % 2 != 0)
  println("Even Set: " + evenSet)

  //  Map
  val getMapValue: Int = mapOne("one") // Enter key to get value. Only works this way round
  println("Get Map Value: " + getMapValue)

  val getMapKey: String = mapOne.find(_._2 == 1).get._1 // Find the value that is equal to 1 and get the key that matches it
  println("Get Map Key: " + getMapKey)

  // Task
  // Seq of names
  val nameSeq: Seq[String] = Seq("Shani", "Bruna", "April", "Tayyab", "Connor")
  println("Name Sequence: " + nameSeq)

  //Colour Map
  val colourMap: Map[Int, String] = Map(
    1 -> "red",
    2 -> "yellow",
    3 -> "blue",
    4 -> "green"
  )
  // filter colour map
  val blue: Map[Int, String] = colourMap.filter(Num => Num._2 == "blue")

  //  map -> method for lowercase 'm'
  //  Used to iterate a collection(set, seq, map)

  def tripledSet(inputSet: Set[Int]): Set[Int] = inputSet.map {
    number => number * 3
    // _ * 3 - this is the same
  }
  println("Tripled Set:" + tripledSet(setOne))

  def tripledSeq(inputSeq: Seq[Int]): Seq[Int] = inputSeq.map {
    number => number * 3
    // _ * 3 - this is the same
  }
  println("Tripled Seq:" + tripledSeq(seqOne))

  def tripledMap(inputMap: Map[String, Int]): Map[String, Int] = inputMap.map {
    case (key, value) => (key, value * 3)
  }
  println("Tripled Map: " + tripledMap(mapOne))

  // Task 4,5,6
  def addOne(inputSeq: Seq[Int]): Seq[Int] = inputSeq.map {
    number => number + 1
  }
   println("Add one: " + addOne(seqOne))

  def letterR(inputSeq: Seq[String]): Seq[Boolean] = nameSeq.map {
    _.contains("r")
    // name => name.contains('r')
  }
  println("Letter R: " + letterR(nameSeq))

  def oddNum = setOne.filter {
    number => number % 2 != 0
    // can use filter not
    // can replace number with _ (this is a place-holder)
  }

  // Append / Prepend
  val newSeq: Seq[Int] = Seq(6,7,8,9)
  // Append to end
  val appenedListOne = seqOne :+ newSeq
  println("Append :+ " + appenedListOne)

  val appendListTwo = seqOne ++ newSeq
  println("Append ++ " + appendListTwo)

  // Prepend to beginning
  val prependOneList = newSeq ++ seqOne // order matters
  println("Prepended ++ " + prependOneList)

  val prependedListTwo = newSeq +: seqOne // switch +:
  println("Prepend +: " + prependedListTwo)

  val prependedValue = 9 +: seqOne
  println(prependedValue)


}
