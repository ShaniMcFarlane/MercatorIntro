package Automation.Week5Day2

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object MVPtask1 extends App {

  //  Create a simple automation script that demonstrates usage of key WebDriver browser level methods.
  //  1. Launch the browser using WebDriver.
  //  2. Navigate to the test URL.
  //  3. Fetch and print:
  //  --> Page title
  //  --> Current URL
  //  4. Close current window.
  //  5. End the session

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://demoqa.com/browser-windows")

  val pageTitle = driver.getTitle
  println(pageTitle)

  val currentURL = driver.getCurrentUrl
  println(currentURL)

  driver.close()

}
