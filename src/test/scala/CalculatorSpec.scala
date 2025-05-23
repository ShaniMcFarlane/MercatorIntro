import org.scalatest.flatspec.AnyFlatSpec

class CalculatorSpec extends AnyFlatSpec {

  val calc = new Calculator // make a new object of our class so we can access all the methods within it

  "add" should "add 2 Ints together" in {
    val input = calc.add(4,6)
    val expectedResult = 10 // 4 + 6
    assert(input == expectedResult) // assert(calc.add(4,6) == 3) // gives boolean value // this is short hand
  }

  "multiply" should "multiply 2 Int's together" in {
    val input = calc.multiply(2,5)
    val expectedResult = 10
    assert(input == expectedResult)
  }

  "subtract" should "subtract X by Y (x - y)" in {
    assert(calc.subtract(7,3) == 4)
  }

  "divide" should "divide X by Y (x / y)" in {
    assert(calc.divide(8,2) == 4)
  }

}
