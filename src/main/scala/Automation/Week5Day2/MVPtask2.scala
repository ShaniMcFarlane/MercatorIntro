package Automation.Week5Day2

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object MVPtask2 extends App {

  //  Create a simple automation script that demonstrates usage of key WebDriver browser-level methods.
  //  1. Launch the browser using WebDriver.
  //  2. Navigate to the test URL.
  //  3. Navigate:
  //  ---> o to "https://example.com"
  //  ---> back
  //  ---> forward
  //  ---> refresh
  //  4. Using built in methods, maximise and minimise the browser window.
  //  5. Print part of the page source.
  //  6. Close current window.
  //  7. End the session.

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://demoqa.com/automation-practice-form")

  driver.navigate().to("https://example.com")
  driver.navigate().back()
  driver.navigate().forward()
  driver.navigate().refresh()

  driver.manage().window().maximize()
  driver.manage().window().minimize()

  println(driver.getPageSource.take(100))

  driver.close()
  driver.quit()

}
