package Automation.Revision

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

import scala.jdk.CollectionConverters.CollectionHasAsScala

object HandlingWindowsRevision extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://the-internet.herokuapp.com/windows")
  driver.manage().window().maximize()

  val parentWindow = driver.getWindowHandle
  println("Parent window: " + parentWindow)

  driver.findElement(By.linkText("Click Here")).click()

  val allWindows: List[String] = driver.getWindowHandles.asScala.toList
  println(allWindows)

  val it = allWindows.iterator

  while (it.hasNext) {
    val handle = it.next()

    if (handle != parentWindow) {
      driver.switchTo().window(handle)
      println("Title of page: " + driver.getTitle)
      driver.close()
    }
  }

  driver.switchTo().window(parentWindow)

  driver.quit()

}
