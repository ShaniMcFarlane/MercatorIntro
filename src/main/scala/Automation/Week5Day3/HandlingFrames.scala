package Automation.Week5Day3

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingFrames extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://the-internet.herokuapp.com/nested_frames")

  driver.switchTo().frame("frame-top")
  driver.switchTo().frame("frame-middle")

  val middleText = driver.findElement(By.id("content")).getText
  println("Middle text: " + middleText)

  driver.quit()

}
