package Automation.Revision

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object HandlingFramesRevision extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://the-internet.herokuapp.com/nested_frames")

  // Nested frames -> moving from default frame to fame inside (middle)
  driver.switchTo().frame("frame-top")
  driver.switchTo().frame("frame-middle")
  driver.switchTo().frame(1)

  driver.switchTo().defaultContent()

  val frameTop = driver.findElement(By.name("frame-top"))
  driver.switchTo().frame(frameTop)

  driver.quit()

}
