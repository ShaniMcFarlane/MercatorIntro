package Automation.Week5Day3

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingFrames extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://the-internet.herokuapp.com/nested_frames")

  // Nested frames -> moving from default frame to fame inside (middle)
  driver.switchTo().frame("frame-top")
  driver.switchTo().frame("frame-middle")

  val middleText = driver.findElement(By.id("content")).getText
  println("Middle text: " + middleText)

  // Going back to main page (main frame) -> default
  driver.switchTo().defaultContent()

  // Moving to frame 2 (index 1) -> not nested. frame 2 on main level
  driver.switchTo().frame(1)

  val bottomText = driver.findElement(By.tagName("body")).getText
  println("Bottom text: " + bottomText)

  driver.switchTo().defaultContent()

  val frameTop = driver.findElement(By.name("frame-top"))
  driver.switchTo().frame(frameTop)

  driver.switchTo().frame("frame-left")
  val leftText = driver.findElement(By.tagName("body")).getText
  println("Left text: " + leftText)

  driver.quit()

}
