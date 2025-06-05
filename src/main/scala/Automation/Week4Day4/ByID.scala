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

  // AFTERNOON TASK

  val driver2: WebDriver = new ChromeDriver()
  driver2.get("https://www.selenium.dev/selenium/web/web-form.html")

  // By ID
  val nameId: WebElement = driver2.findElement(By.id("my-text-id"))
  nameId.sendKeys("Shani")
  println("Name entered using ID = Passed")

  // By Name
  val passwordName: WebElement = driver2.findElement(By.name("my-password"))
  passwordName.sendKeys("password123")
  println("Password entered using Name = Passed")

  // By Class Name
  val textBox = driver2.findElements(By.className("form-control"))
  textBox.get(2).sendKeys("This is a test comment")
  println("Text entered = Passed")

  // By Tag Name
  val inputElements = driver2.findElements(By.tagName("input"))
  println(s"There are ${inputElements.size} <input> elements on the page")

  // By Link Text
  val clickLink: WebElement = driver2.findElement(By.linkText("Return to index"))
  clickLink.click()
  println("Link clicked = Passed")

  // By Partial Link Text
  //  val webFormLink: WebElement = driver2.findElement(By.partialLinkText("web-form"))
  //  webFormLink.click()
  driver2.navigate().back()
  println("Back to web form page = Passed")

  val returnLink: WebElement = driver2.findElement(By.partialLinkText("Return"))
  returnLink.click()
  println("Return to index page = Passed")

  driver2.quit()

}
