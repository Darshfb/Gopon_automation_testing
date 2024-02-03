package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;


public class UserLogin {
    // User Opens home page
    HomePage homePage;
    LoginPage loginPage;
    SoftAssert softAssert = new SoftAssert();

    @Given("User opens home page")
    public void User_opens_home_page() {
        homePage = new HomePage();
        loginPage = new LoginPage();
        homePage.openLoginPage();

    }

    @When("User fill email {string} and password {string} to can login")
    public void User_fill_email_and_password_to_can_login(String email, String password) {
        loginPage.userLogIn(email, password);

    }

    @Then("User should navigate to home page")
    public void User_should_navigate_to_home_page() {
//        String expectedName = "ABC DEF";
//        String actualName = homePage.getUserName();
//            Assert.assertEquals(actualName, expectedName, "\n There is an error in user data \n");

    }

    @Then("User can't log in")
    public void userCanTLogIn() {
        Boolean isLoggedIn = homePage.checkLoginFailed();
        Assert.assertTrue(isLoggedIn);
    }
}
