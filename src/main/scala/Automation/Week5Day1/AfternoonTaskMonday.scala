package Automation.Week5Day1

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.chrome.ChromeDriver

object AfternoonTaskMonday extends App {

  var driver: WebDriver = new ChromeDriver()

  // TASK 1
  println("TASK 1 -> Css 🤖")

  // Navigate to https://www.selenium.dev/selenium/web/web-form.html
  driver.get("https://www.selenium.dev/selenium/web/web-form.html")
  println("1: Navigated to website = ✅")

  // Locate the Text input field using a CSS selector with ID
  val textInput: WebElement = driver.findElement(By.cssSelector("#my-text-id"))
  println("2: Text input field located = ✅")

  // Action: Enter text "testUser"
  textInput.sendKeys("testUser")
  println("Enter text = ✅")

  // Locate the password field using a CSS selector with an attribute
  val passwordField: WebElement = driver.findElement(By.cssSelector("input[type='password']"))
  println("3: Password field located = ✅")

  // Action: Enter password "mySecret"
  passwordField.sendKeys("mySecret")
  println("Password entered = ✅")

  // Locate the submit button using a CSS selector with class
  val submitButton: WebElement = driver.findElement(By.cssSelector(".btn.btn-outline-primary.mt-3"))
  println("4: Button located: ✅")

  // Action: Click the button
  submitButton.click()
  println("Button clicked + Form submitted = ✅")

  driver.quit()


  // TASK 2 --> XPath
  println("TASK 2 -> Xpath 🦾")

  // Open new driver / Start new session
  driver = new ChromeDriver()

  // Navigate to the login page - https://the-internet.herokuapp.com/login
  driver.get("https://the-internet.herokuapp.com/login")
  println("1: Navigated to webpage = ✅")


  // Locate and fill in the username input field using XPath by ID.
  val userInput: WebElement = driver.findElement(By.xpath("//input[@id='username']"))
  userInput.sendKeys("ShaniM")
  println("1: Located + filled user input field = ✅")

  // Locate and fill in the password input field using XPath by ID.
  val passwordInput: WebElement = driver.findElement(By.xpath("//input[@id='password']"))
  passwordInput.sendKeys("password123")
  println("2: Located and filled password field = ✅")

  // Locate and click the submit/login button using XPath by attribute.
  val loginButton: WebElement = driver.findElement(By.xpath("//button[@type='submit']"))
  loginButton.click()
  println("3: Login button clicked: ✅")

  // Capture and print the login result message using XPath.
  //  val resultMessage: WebElement = driver.findElement(By.xpath("//div[@id='flash']"))
  //  println(resultMessage.getText)
    println("4: Result message printed = ❌")

  driver.quit()

  // MVP
  println("MVP 🦿")

  driver = new ChromeDriver()
  driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html")
  println("1: Navigated to web URL = ✅")

  println("2:  ")
  val usernameText: WebElement = driver.findElement(By.name("username"))
  usernameText.sendKeys("Shani")
  println("Name = ✅")

  val passwordText: WebElement = driver.findElement(By.cssSelector("input[type='password']"))
  passwordText.sendKeys("password123")
  println("Password = ✅")

  val commentsText: WebElement = driver.findElement(By.xpath("//textarea[@name='comments']"))
  commentsText.sendKeys("This is a comment")
  println("Comment = ✅")

  println("3:  ")

  val checkbox: WebElement = driver.findElement(By.cssSelector("[value='cb1']"))
  checkbox.click()
  println("Checkbox = ✅")

  val clickSubmit: WebElement = driver.findElement(By.className("styled-click-button"))
  clickSubmit.click()
  println("Submit = ✅")

  val clickLink: WebElement = driver.findElement(By.partialLinkText("EvilTester"))
  clickLink.click()
  println("Link = ✅")

  driver.quit()

}
