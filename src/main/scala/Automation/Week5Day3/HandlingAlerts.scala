package Automation.Week5Day3

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object HandlingAlerts extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://the-internet.herokuapp.com/javascript_alerts")

  // Simple Alert
  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click()

  val alert = driver.switchTo().alert()

  println("Test simple alert passed " + alert.getText)

  alert.accept()

  println("Simple alert passed")

  // Confirmation Alert
  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click()

  driver.switchTo().alert().dismiss()

  println("Confirmation alert passed")

  // Prompt Alert
  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click()
  val alert3 = driver.switchTo().alert()
  println(alert3.getText)
  alert3.sendKeys("Hello World!")
  alert3.accept()

  driver.quit()

}
