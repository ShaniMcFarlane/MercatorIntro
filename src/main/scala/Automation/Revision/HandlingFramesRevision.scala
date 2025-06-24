package Automation.Revision

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, NoSuchFrameException, WebDriver}

object HandlingFramesRevision extends App {

  val driver: WebDriver = new ChromeDriver()


  // TRY/CATCH/FINALLY

  try {
    driver.get("https://the-internet.herokuapp.com/nested_frames")

    // Nested frames -> moving from default frame to fame inside (middle)
    driver.switchTo().frame("frame-top")
    //    driver.switchTo().frame("frame-middle")
    driver.switchTo().frame(1) // frame not working when frame middle uncommented! NoSuchFrameException error

    driver.switchTo().defaultContent()

    val frameTop = driver.findElement(By.name("frame-top"))
    driver.switchTo().frame(frameTop)

  } catch {
    case e: NoSuchFrameException =>
      println("Caught NoSuchFrameException: " + e.getMessage)

  } finally {
    println("Quitting driver")
    driver.quit()
  }


}
