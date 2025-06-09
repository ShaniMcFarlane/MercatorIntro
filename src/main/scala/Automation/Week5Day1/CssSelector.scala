package Automation.Week5Day1

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver, WebElement}

object CssSelector extends App {

  // Instantiating ChromeDriver for interacting with the browser
  val driver: WebDriver = new ChromeDriver()

  // Accessing the web URL for testing
  driver.get("https://proleed.academy/exercises/selenium/selenium-element-id-locators-practice-form.php")

  driver.manage().window().maximize()

  // CSS SELECTORS -> Week 5 Tasks

  // Creating a variable to store email element
  //  val emailAddress: WebElement = driver.findElement(By.id("email"))
  //  Using CSS selector
  val emailAddress: WebElement = driver.findElement(By.cssSelector("#email"))

  emailAddress.sendKeys("test@gmail.com")
  println("Entered email address = Passed")

  // Using XML Path
  val emailAddress2: WebElement = driver.findElement(By.xpath("//*[@id=\"email\"]"))

  // Typing into email input field --> use sendKeys
  emailAddress2.sendKeys("test@gmail.com")
  println("Entered email address 2 = Passed")

  // DIFFERENT WEBSITE
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  //Using nested elements (parents > children -> follow the path in inspect tool)
  val passwordTwo: WebElement = driver.findElement(By.cssSelector("body > main > div > form > div > div:nth-child(1) > label:nth-child(2) > input"))
  //  div:nth-child(1) - (1) because this is the first div tag in the nest
  //  label:nth-child(2) - (2) because this is the 2nd label tag in the nest
  passwordTwo.sendKeys("TestPasswordTwo")
  println("PasswordTwo entered - passed")

//  val password: WebElement = driver.findElement(By.id("password"))
//  password.sendKeys("password123")
//  println("Entered password = Passed")
//
//  val submit: WebElement = driver.findElement(By.id("login"))
//  submit.click()
//  println("Login button clicked = Passed")

  driver.quit()

  // AFTERNOON TASK

}
