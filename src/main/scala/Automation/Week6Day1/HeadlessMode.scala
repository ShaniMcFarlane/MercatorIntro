package Automation.Week6Day1

import org.openqa.selenium.chrome.{ChromeDriver, ChromeOptions}
import org.openqa.selenium.{By, WebDriver}

object HeadlessMode extends App {


  // Create chrome option
  val options = new ChromeOptions()
  // Add headless mode
  options.addArguments("--headless")


  val driver: WebDriver = new ChromeDriver(options)

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
