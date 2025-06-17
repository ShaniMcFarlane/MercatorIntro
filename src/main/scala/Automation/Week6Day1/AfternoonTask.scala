package Automation.Week6Day1


import Automation.Week6Day1.HeadlessMode.options
import Automation.Week6Day1.ScreenCapture.{srcTimestamp, timeStamp}
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, NoSuchElementException, OutputType, TakesScreenshot, WebDriver}

import java.io.File
import java.text.SimpleDateFormat
import java.time.Duration
import java.util.Date


object AfternoonTask extends App {

  // MVP: Automate the following scenario
  // Headless Login with Screenshot Capture and exception handling.

  //  1. Use ChromeDriver with `--headless=new option`
  val options = new ChromeOptions()
  options.addArguments("--headless=new")

  //  2. Navigate to the login URL -https: //the-internet.herokuapp.com/login
  val driver: WebDriver = new ChromeDriver()
  driver.get("https://the-internet.herokuapp.com/login")

  //  a. Username: tomsmith
  val username = driver.findElement(By.id("username"))
  username.sendKeys("tomsmith")
  println("Username entered")

  //  b. Password: SuperSecretPassword!
  val password = driver.findElement(By.id("password"))
  password.sendKeys("SuperSecretPassword!")
  println("Password entered")

  //  3. Submit the login form.
  val submit = driver.findElement(By.xpath("//*[@id=\"login\"]/button"))
  submit.click()

  //  4. Wait for the result message (success or failure).
  val explicitWait = new WebDriverWait(driver, Duration.ofSeconds(20))

  //  val resultMessage = driver.findElement(By.id("flash"))
  val resultMessage = explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#flash")))
  println(resultMessage.getText)

  //  5. Take a screenshot [Wrap key steps in a utility function that takes a screenshot].

  def takeScreenshot(driver: WebDriver, status: String): Unit = {
    val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
    val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
    //  6. Save as screenshots/YYYY-MM-DD-success-<timestamp>.png or screenshots/YYYY-MMDD-failure-<timestamp>.png
    FileHandler.copy(srcTimestamp, new File(s"/Users/shani.mcfarlane/Documents/Screenshots/TestResult_$timeStamp-$status.png"))
    println("Screenshot saved")
  }

  //  takeScreenshot(driver, "success")

  //  7. Use try / catch / finally: a. catch Selenium exceptions (e.g., NoSuchElementException, TimeoutException)
  try {
    takeScreenshot(driver, "success")
  } catch {
    case e: Exception =>
      takeScreenshot(driver, "failure")
      println("Failed " + e.getMessage)
  }
  //  8. Finally, call driver.quit().
  driver.quit()


}
