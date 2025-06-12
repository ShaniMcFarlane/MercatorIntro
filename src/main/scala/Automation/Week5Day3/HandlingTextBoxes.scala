package Automation.Week5Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object HandlingTextBoxes extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  val text = driver.findElement(By.id("my-text-id"))

  text.sendKeys("Hello world")
  println("Value has been entered")

  val text1 = text.getAttribute("value")
  println("Value: " + text1)

  text.clear()
  println("Value has been cleared")

  driver.quit()

}
