package Automation.Week5Day4

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

object HandlingStaticTables extends App {

  val driver: WebDriver = new ChromeDriver()

  driver.get("https://www.w3schools.com/html/html_tables.asp")


  driver.quit()

}
