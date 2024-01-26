package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;


import static tests.TestBase.driver;

public class UserLogin {
    HomePage homePage;

    // User Opens home page
    @Given("User opens home page")
    public void User_opens_home_page() {
        homePage = new HomePage(driver);

    }

    @When("User fill email {string} and password {string} to can login")
    public void User_fill_email_and_password_to_can_login(String email, String password) {
        homePage.openLoginPage();
        System.out.println(email + password);
    }

    @Then("User should navigate to home page")
    public void User_should_navigate_to_home_page() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
