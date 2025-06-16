package Automation.Week5Day4

import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.chrome.ChromeDriver
import java.util
import scala.jdk.CollectionConverters.CollectionHasAsScala

object FridayCodeAlong extends App {

  // FOR comprehension
  /**
   * for (item <- collection)
   * for (every item in the collection) {
   * Do something to every item
   * }
   */

  // SCALA
  var fruits: List[String] = List("Apple", "Banana", "Cherry", "Melon")

  for (fruit <- fruits) {
    println(fruit)
  }

  // SELENIUM SCALA --> defaults to JS --> .asScala turns into scala
  /**
   * for (fruit <- fruits.asScala) {
   * println(fruit.getText)
   * }
   */

  // Example - Won't Run

  val driver = new ChromeDriver()
  driver.get("https://example.com")

  // Loop through list of elements

  // USE elementS -> S makes it a list
  val items: util.List[WebElement] = driver.findElements(By.id("i")) // Find element by ID -> this is the whole list

  for (item <- items.asScala) { // looping over each item in the itemS collection (Java list, has to be turned into scala or it's unusable)
    println(item.getText) // getting the text from each item and printing it out
  }

  // Click all buttons in a selection

  val buttons = driver.findElements(By.cssSelector(".my-buttons"))

  for (button <- buttons.asScala) {
    button.click()
  }

  // Finding a specific element (within a loop - collection of types)
  // Need an `if` in a for comp

  val links = driver.findElements(By.tagName("a")) // Finds all the links on the URL from L35

  // Find the `contact us` link
  for (link <- links.asScala) {
    if (link.getText.contains("contact")) { // if the link has text containing "contact"
      link.click() // click the link
    } else {
      println("no links containing `contact` were found")
    }
  }

  // Tables

  <table>
    <tr>
      <td>Apple</td> <td>Red</td>
    </tr>
    <tr>
      <td>Banana</td> <td>Yellow</td>
    </tr>
    <tr>
      <td>Kiwi</td> <td>Green</td>
    </tr>
  </table>

  // Looping through table rows
  val rows = driver.findElements(By.tagName("tr")) // Found a collection with tag `tr` (table rows)

  // row and index position
  for ((row, index) <- rows.asScala.zipWithIndex) {
    val cells = row.findElements(By.tagName("td")) // this is taking all the rows that have been found (row is from row on L86),
    // going inside those rows and pulling out every `td` tag

    // cell = List("Apple", "Red", "0", "Banana", ...ect)
    // map -> iterating through the list !
    // val makeString =
    cells.asScala.map(_.getText).mkString(", ".trim) // ""

  }

  // .zipWithIndex Method
  // Pairs each row with its index (starting from 0)
  // Row 0: Apple | Red
  // Row 1: Banana | Yellow
  // Row 2: Kiwi | Green

  // Does a value exist?

  val doesBananaExist = rows.asScala.exists{ row =>
    val cells = row.findElements(By.tagName("td")).asScala
    cells.exists(_.getText == "Banana")
  }

  assert(doesBananaExist, "Bananas exist")

}
