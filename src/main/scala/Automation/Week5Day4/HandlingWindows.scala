package Automation.Week5Day4

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

import scala.jdk.CollectionConverters.CollectionHasAsScala

object HandlingWindows extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://the-internet.herokuapp.com/windows")
  driver.manage().window().maximize()

  val parentWindow = driver.getWindowHandle
  println("Handle for parent window: " + parentWindow)

  driver.findElement(By.linkText("Click Here")).click()

  // Getting all the list of ALL window handles (ID's)
  val allWindows:List[String] = driver.getWindowHandles.asScala.toList

  // Iterating through all the window handles
  val it = allWindows.iterator

  // Starting to iterate through the list
  while (it.hasNext) {
    // While the list can move to .next --> it will keep switching
    val handle = it.next()

    // If the handle is NOT the parent window...
    if (handle != parentWindow) {
      // ...SWITCH to the new window
      driver.switchTo().window(handle)
      println("The current window: " + handle)
      println("Page Title: " + driver.getTitle)
      // as long as the handle is not the parent window, it will keep switching
      // In this case there is only one switch. It doesn't go back to the parent. It stops at the end of the list
    }
  }



  driver.quit()

}
