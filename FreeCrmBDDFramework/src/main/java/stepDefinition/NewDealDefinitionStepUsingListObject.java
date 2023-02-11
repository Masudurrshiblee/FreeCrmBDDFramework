package stepDefinition;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NewDealStepDefinition {
    WebDriver driver;

    @Given("^User is already on login page$")
    public void user_is_already_on_login_page() {
        // To get the login page we have to write code as follows
        System.setProperty("webdriver.chrome.driver", "/Users/mrshi/IdeaProjects/Learn_Selenium_With_Mahmudul/BrowserDriver/chromedriver/chromedriver_win32 (3)/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("www.freecrm.com");
    }


    @When("^title of login page is free CRM$")
    public void title_of_login_page_is_free_CRM() {
        // Now check the title of login page
        String title= driver.getTitle();
        // To print title
        System.out.println(title);
        // To do verification
        Assert.assertEquals("#1 Free CRM for any Business:Online Customer relationship softwatre","title");

    }

    @Then("^user enters username and password$")

    public void user_enters_username_and_password(DataTable dealData) {
        List<List<String>> dealDataValue = dealData.raw();

        // Two write username and password use code as follows
        driver.findElement(By.name("username")).sendKeys(dealDataValue.get(0).get(0)); // This will represent the value from 0th row and 0th column
        // driver.findElement(By.name("username")).sendKeys("username");
        driver.findElement(By.name("password")).sendKeys(dealDataValue.get(0).get(1));  // This will represent 0th row and 1st column
        //driver.findElement(By.name("password")).sendKeys("password");

    }
}
