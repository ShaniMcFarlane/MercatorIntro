package Automation.Revision

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object HandlingStaticTablesRevision extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.w3schools.com/html/html_tables.asp")
  driver.manage().window().maximize()

  val rows = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[position() > 1]"))

  for (i <- 0 until rows.size()) {
    val cols = rows.get(i).findElements(By.tagName("td"))

    val rowText = cols.toArray.map(_.asInstanceOf[org.openqa.selenium.WebElement].getText).mkString(" | ")

    println("Row " + (i + 1) + ": " + rowText)
  }

  driver.quit()

}
