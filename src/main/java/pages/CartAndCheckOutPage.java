package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CartAndCheckOutPage extends PageBase {
    private final By continueToCheckOutButton = By.xpath("/html/body/app-root/app-layout/app-cart-side/div/div[2]/div/div/div[2]/div[2]/div[2]/button");
    private final By paymentMethod = By.name("paymentMethods");
    private final By checkOutButton = By.xpath("/html/body/app-root/app-layout/app-main-content/app-cart/section/div/div/div[2]/div/div/div/form/button");

    public void continueToPaymentScreen()
    {
        find(continueToCheckOutButton).click();
    }

    public void selectCashPaymentMethodDropDownList() {
        Select options = new Select(find(paymentMethod));
        options.selectByValue("2: Object");
    }

    public void checkOut()
    {
        System.out.println("-------------> checkout");
        find(checkOutButton).click();
    }
}
