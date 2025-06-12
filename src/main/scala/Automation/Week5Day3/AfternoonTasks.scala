package Automation.Week5Day3

import Automation.Week5Day3.HandlingDropdowLists.select
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.{By, JavascriptExecutor, WebDriver, WebElement}

object AfternoonTasks extends App {

  //  Automate a basic form interaction and navigation:
  //  1. Navigate to the site: https://testpages.herokuapp.com/styled/index.html
  //  • Once here, maximise the page.
  //  2. Handle Text Boxes:
  //  • Go to the "HTML Form Example" page.
  //  • Fill in the username and password fields.
  //  3. Handle Checkbox:
  //  • Locate a checkbox.
  //  • Select the checkbox located if not already selected.
  //  4. Handle Radio Buttons:
  //  • Select a radio option.
  //  5. Handle Dropdown/Select:
  //  • Choose an option from the dropdown.
  //  6. Handle Buttons:
  //  • Click the "Submit" button.
  //  7. Handle Links:
  //  • Click a link to return to the homepage.

  val driver: WebDriver = new ChromeDriver()
  driver.get("https://testpages.herokuapp.com/styled/index.html")

  //  driver.manage().window().maximize()

  driver.navigate().to("https://testpages.eviltester.com/styled/basic-html-form-test.html")

  driver.findElement(By.name("username")).sendKeys("Shani")
  println("Username entered")

  driver.findElement(By.name("password")).sendKeys("password123")
  println("Password entered")

  val checkbox2 = driver.findElement(By.cssSelector("[value='cb2']"))

  if (checkbox2.isDisplayed && checkbox2.isEnabled) {
    checkbox2.click()
    println("Checkbox 2 selected")
  } else {
    println("Checkbox 2 is not selected")
  }

  driver.findElement(By.cssSelector("[value='rd3']")).click()
  println("Radio button 3 selected")

  val dropdownSelection = driver.findElement(By.name("dropdown"))

  val select = new Select(dropdownSelection)

  select.selectByIndex(3)
  println("Dropdown option 4 selected")

  //  val dropdownItem4 = driver.findElement(By.cssSelector("[value='ms4']"))

  //  val button: WebElement =
  //  driver.findElement(By.cssSelector("input[value='submit']")).click()
  //  println("Submit button clicked")

  val jsExecutor = driver.asInstanceOf[JavascriptExecutor]

  val submitButton: WebElement = driver.findElement(By.cssSelector("input.styled-click-button[type='submit']"))

  if (submitButton.isDisplayed && submitButton.isEnabled) {
    jsExecutor.executeScript("arguments[0].scrollIntoView(true);", submitButton)
    submitButton.click()
    println(s"Submitted! - ✅")
  } else {
    println("Please try again later")
  }

  driver.findElement(By.linkText("Index")).click()
  println("Returned to index page")

//  driver.quit()

}
