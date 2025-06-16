package Automation.Week6Day1

import Automation.Week6Day1.ScreenCapture.driver
import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.io.FileHandler
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, OutputType, TakesScreenshot, WebDriver}

import java.io.File
import java.text.SimpleDateFormat
import java.time.Duration
import java.util.Date
import scala.collection.convert.ImplicitConversions.`iterable AsScalaIterable`


object AfternoonTaskExtension extends App {

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://the-internet.herokuapp.com/tables")

  //  1. Navigate to the URL and locate Table 1.
  val table1 = driver.findElement(By.id("table1"))

  //  2. Trigger sorting.
  val lastNameCol = driver.findElement(By.xpath("//*[@id=\"table1\"]/thead/tr/th[1]/span"))
  lastNameCol.click()

  //  3. Capture the column values after each click.
  val rows = table1.findElements(By.tagName("td"))

    val lastNames = rows.map { row =>
      val lastNameCell = row.findElement(By.tagName("td"))
      lastNameCell.getText
  }

  println(lastNames)

//  val timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date())
//  val srcTimestamp: File = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
//  FileHandler.copy(srcTimestamp, new File(s"/Users/shani.mcfarlane/Documents/Screenshots/TestResult_$timeStamp.png"))

  //  4. Verify ascending and descending order.


  //  driver.quit()


}
