package Automation.Week5Day3

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select

import java.nio.channels.Selector

object HandlingDropdowLists extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select")

  driver.switchTo().frame("iframeResult")
  val dropdown = driver.findElement(By.name("cars"))

  val select = new Select(dropdown)

  select.selectByVisibleText("Opel")
  println("Selected visible text: " + select.getFirstSelectedOption.getText)

  select.selectByValue("volvo")
  println("Selected by value: " + select.getFirstSelectedOption.getText)

  select.selectByIndex(3)
  println("Selected index: " + select.getFirstSelectedOption.getText)


  driver.quit()

}
