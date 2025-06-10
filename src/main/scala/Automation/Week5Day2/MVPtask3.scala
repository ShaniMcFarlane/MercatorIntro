package Automation.Week5Day2

import org.openqa.selenium.{By, WebDriver}
import org.openqa.selenium.chrome.ChromeDriver

object MVPtask3 extends App {

  //  Create a simple automation script that locates elements on a test page and uses
  //  Web Element conditional methods to verify their states before interacting.
  //  1. Launch the browser using WebDriver.
  //  2. Navigate to the test URL.
  //  3. Locate these elements:
  //  ---> First Name input field
  //  ---> Submit button
  //  ---> Hobbies checkbox
  //  4. Use conditional methods to:
  //  ---> Check if the First Name input is displayed and enabled before typing a name.
  //  ---> Check if the Hobbies checkbox is selected; if not, select it.
  //  ---> Check if the Submit button is displayed and enabled before clicking it.
  //  5. Print meaningful messages for each condition check and action taken.
  //  6. Close the browser at the end.

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://demoqa.com/automation-practice-form")

  val firstName = driver.findElement(By.cssSelector("#firstName"))
  val submitButton = driver.findElement(By.id("submit"))
  val hobbiesCheckbox = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"))
  // *[@id="hobbies-checkbox-1"]

  if (firstName.isDisplayed && firstName.isEnabled) {
    firstName.sendKeys("Shani")
    println("First Name has been entered")
  } else {
    println("Input is not displayed or enabled")
  }

  if (!hobbiesCheckbox.isSelected) {
    hobbiesCheckbox.click()
    println("Checkbox has been selected")
  } else {
    println("Select a checkbox")
  }

  if (submitButton.isDisplayed && submitButton.isEnabled) {
    submitButton.submit()
    // .click() not working!
    println("Submit button has been clicked")
  } else {
    println("Submit button has not been clicked")
  }

//  Thread.sleep(3000)

  driver.quit()

}
