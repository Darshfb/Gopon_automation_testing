package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;

public class UpdateUserData {
HomePage homePage;

    @Then("User goes to my account page")
    public void user_goes_to_my_account_page() {
        homePage = new HomePage();
        homePage.openMyAccountPage();
    }
    @Then("User fill his new data and update his data")
    public void user_fill_his_new_data_and_update_his_data() {
        System.out.println("-> Hello world");
    }


}
