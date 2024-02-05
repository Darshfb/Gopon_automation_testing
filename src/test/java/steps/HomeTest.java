package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartAndCheckOutPage;
import pages.HomePage;
import pages.ItemDetailsPage;
import pages.Product;

public class HomeTest {
    HomePage homePage;
    Product product;
    ItemDetailsPage itemDetailsPage;
    CartAndCheckOutPage cartAndCheckOutPage;
    @When("Select item")
    public void select_item() {
        homePage = new HomePage();
        var x = homePage.getProducts();
        itemDetailsPage = new ItemDetailsPage();
        cartAndCheckOutPage = new CartAndCheckOutPage();
        String abx = x.get(2).getName();
        System.out.println("---> " + abx);
        System.out.println("-------> The product length " + x.size());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        var item = homePage.getProduct(p -> p.getName().equals(abx)); // page component object
//        item.addToCart();
        item.openItemDetails();
        itemDetailsPage.increaseQuantity();
        itemDetailsPage.AddItemToCart();
    }
    @Then("Add Item to cart")
    public void add_item_to_cart() {
        cartAndCheckOutPage.continueToPaymentScreen();
        System.out.println("ssss");
    }




}
