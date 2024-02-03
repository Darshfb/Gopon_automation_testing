package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.HomePage;
import pages.UserAccountPage;

public class UpdateUserData {
HomePage homePage;
UserAccountPage userAccountPage;

    @Then("User goes to my account page")
    public void user_goes_to_my_account_page() {
        homePage = new HomePage();
        homePage.openMyAccountPage();
        userAccountPage = new UserAccountPage();
        userAccountPage.updateUserAccountData(
                "firstName",
                "lastName",
                "mostafatesterabc1@gmail.com",
                "50505051",
                "1/25/1993",
                "Cairo Egypt",
                "15"
        );

    }
    @Then("User fill his new data and update his data")
    public void user_fill_his_new_data_and_update_his_data()
    {
        System.out.println("-> Hello world");
    }


}
