package Automation.Week4Day4

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object ByID extends App {

  // Instantiating ChromeDriver for interacting with the browser
  val driver: WebDriver = new ChromeDriver()

  // Accessing the web URL for testing
  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")

  driver.manage().window().maximize()

  // Creating a variable to store email element
  val emailAddress: WebElement = driver.findElement(By.id("email"))

  // Typing into email input field --> use sendKeys
  emailAddress.sendKeys("test@gmail.com")

  println("Entered email address = Passed")

  val password: WebElement = driver.findElement(By.id("password"))
  password.sendKeys("password123")
  println("Entered password = Passed")

  val submit: WebElement = driver.findElement(By.id("login"))
  submit.click()
  println("Login button clicked = Passed")

  driver.quit()

}
