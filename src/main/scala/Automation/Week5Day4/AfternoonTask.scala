package Automation.Week5Day4

import Automation.Week5Day4.ExplicitWait.{driver, explicitWait}
import Automation.Week5Day4.HandlingJavascriptExecutor.driver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver}

import java.time.Duration

object AfternoonTask extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://cosmocode.io/automation-practice-webtable/")

  //  1. Navigate to the Practice Table URL: https //cosmocode.io/automation-practice-webtable/
  // 2. Static Table Handling
  // • Locate the table containing country data.
  // • Extract and print all country names from the first column.
  // • Use JavaScript Executor to highlight each row as it’s read.
  // 3. Implicit Wait • Set a global implicit wait of 10 seconds.
  // 4. Explicit Wait • Wait for a specific country row (e.g., "Germany") to be visible.
  // • Once visible, extract its capital and currency.

  val countries = driver.findElement(By.id("countries"))

  // My method will be to find all the "tr" ( rows) elements and get the second "td" (cell) element from each one

  val rows = countries.findElements(By.tagName("tr"))
  val js = driver.asInstanceOf[JavascriptExecutor]

  for (i <- 1 until rows.size()) {
    val cells = rows.get(i).findElements(By.tagName("td"))
    js.executeScript("arguments[0].style.backgroundColor ='red'", rows.get(i))
    println(cells.get(1).getText)
  }

  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))

  val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5))

  val jamaicaRow = explicitWait.until(
    ExpectedConditions.visibilityOfElementLocated(
      By.xpath("//table[@id='countries']//tr[td/strong[text()='Jamaica']]")
    )
  )

  val cells2 = jamaicaRow.findElements(By.tagName("td"))
  val capital = cells2.get(2).getText
  val currency = cells2.get(3).getText

  println("Country: Jamaica")
  println(s"Capital: $capital")
  println(s"Currency: $currency")


  driver.quit()

}
