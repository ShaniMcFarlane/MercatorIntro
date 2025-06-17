package Automation.Week6Day1

import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.{By, OutputType, TakesScreenshot, WebDriver}

import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

object ScreenCapture extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.selenium.dev/selenium/web/web-form.html")

  // Full Screenshot
  val srcFull: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcFull, new File("/Users/shani.mcfarlane/Documents/Screenshots/TestResults.png"))

  // Screenshot with date/timestamp
  val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
  val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
  FileHandler.copy(srcTimestamp, new File(s"/Users/shani.mcfarlane/Documents/Screenshots/TestResult_$timeStamp.png"))

  // Locate the element by its name (update if needed)
  val element = driver.findElement(By.name("my-disabled"))
  // Capture only that element
  val srcElement: File = element.getScreenshotAs(OutputType.FILE)
  // Save the screenshot of the element
  FileHandler.copy(srcElement, new File("/Users/shani.mcfarlane/Documents/Screenshots/TestResult_Specific.png"))


  driver.quit()


}
