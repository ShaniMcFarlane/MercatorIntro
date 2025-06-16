package Automation.Week6Day1

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, NoSuchElementException, WebDriver}


object AfternoonTask extends App {


  val driver: WebDriver = new ChromeDriver()

  try {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html")

    driver.findElement(By.id("non-existent-id")).click()
  }
  catch {
    case e: NoSuchElementException =>
      println("Element not found " + e.getMessage) // + e.getMessage
      e.printStackTrace()

//    case e: Exception =>
//      println("Print any exception " ) // + e.getMessage
//      e.printStackTrace()
  }
  finally {
    if (driver != null) {
      driver.quit()
    }
  }


}
