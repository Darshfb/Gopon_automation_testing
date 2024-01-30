package steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;

public class UserRegister {
    HomePage homePage;
    RegisterPage registerPage;

    @When("User navigate to register page")
    public void user_navigate_to_register_page() {
        homePage = new HomePage();
        registerPage = new RegisterPage();
        homePage.openRegisterPage();

    }

//    @Then("User fill his data {string}, {string}, {string}, password {string} and phone {int}")
//    public void user_fill_his_data_password_and_phone(String firstName, String lastName, String email, String password, Integer phoneNo) {
//        registerPage.UserRegister(firstName, lastName, email, phoneNo, password);
//    }

    @Then("Click on register")
    public void click_on_register() {
        registerPage.userClickOnRegisterBtn();
    }

    @Then("Navigate to home page")
    public void navigate_to_home_page() {


    }

    @Then("User fill his data fName {string}, lName {string}, email {string}, password {string} and phone {int}")
    public void userFillHisDataFNameLNameEmailPasswordAndPhone(String firstName, String lastName, String email, String phoneNo, int password) {
        registerPage.UserRegister(firstName, lastName, email, phoneNo, password);
    }
}
