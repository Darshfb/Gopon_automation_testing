package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartAndCheckOutPage;

public class OrderCheckOutTest {

    CartAndCheckOutPage cartAndCheckOutPage;
    @Then("Select cash payment method")
    public void selectCashPaymentMethod()
    {
        cartAndCheckOutPage = new CartAndCheckOutPage();
        cartAndCheckOutPage.selectCashPaymentMethodDropDownList();

    }

    @And("Press checkout")
    public void pressCheckout()
    {
        cartAndCheckOutPage.checkOut();
        System.out.println("-----------> H H H H H H");

    }
}
