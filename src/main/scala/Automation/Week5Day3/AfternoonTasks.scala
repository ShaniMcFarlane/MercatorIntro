package Automation.Week5Day3

import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.{By, WebDriver}

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



  driver.quit()

}
