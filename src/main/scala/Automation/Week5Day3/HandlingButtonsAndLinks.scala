package Automation.Week5Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object HandlingButtonsAndLinks extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  driver.manage().window().maximize()

  // Handling Buttons

  val button = driver.findElement(By.cssSelector("[type='submit']"))

  if (button.isEnabled) {
    println("Button text: " + button.getText)
    button.click()
  } else {
    println("Button is not enabled")
  }

  // Handling Links

  driver.get("https://www.selenium.dev/")

  val link = driver.findElement(By.linkText("Documentation"))

  val linkURL = link.getAttribute("href")
  println("url: " + linkURL)

  driver.quit()

}
