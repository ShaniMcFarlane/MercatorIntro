package Automation.Revision

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, WebDriver}

object HandlingDropdowListsRevision extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select")

  // Switching to frame
  driver.switchTo().frame("iframeResult")

  val dropdown = driver.findElement(By.name("cars"))

  val select = new Select(dropdown)

  select.selectByVisibleText("Opal")

  driver.quit()

}
