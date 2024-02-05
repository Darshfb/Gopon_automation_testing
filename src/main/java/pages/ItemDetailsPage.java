package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ItemDetailsPage extends PageBase{

    private final By increaseIcon = By.xpath("//button[contains(@class,'quantity-plus d-icon-plus')]");
    private final By addToCartButton = By.xpath("//a[contains(@class,'main-btn sec animate small toggle-cartside')]");

    public void increaseQuantity(){
        Actions actions = new Actions(driver);
        WebElement element = find(increaseIcon);
        actions.doubleClick(element).perform();
    }
    public void AddItemToCart(){
        find(addToCartButton).click();
    }


}
