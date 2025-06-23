package Automation.Revision

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

object HandlingAlertsRevision extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://the-internet.herokuapp.com/javascript_alerts")

  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click()

  val alert = driver.switchTo().alert()

  alert.accept()

  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click()

  println(alert.getText)
  alert.dismiss()

  driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click()
  alert.sendKeys("ShaniM")
  alert.accept()

  val result = driver.findElement(By.id("result"))
  println(result.getText)



  driver.quit()

}
