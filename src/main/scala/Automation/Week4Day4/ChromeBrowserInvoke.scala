package Automation.Week4Day4

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object ChromeBrowserInvoke extends App {

  val driver: WebDriver = new ChromeDriver() // Instantiate driver

  println("Invoking chrome browser")

  driver.get("https://www.google.com") // Driver gets URL

  println("Title of page: " + driver.getTitle)

  driver.quit() // Or .close

}
