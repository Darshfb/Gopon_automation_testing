package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;

// Page component object
public class Product extends PageBase {
private final By name =By.xpath("//span[contains(@class, 'res-name center-name')]");
    public String getName(){
        return driver.findElement(name).getText();
    }

    public BigDecimal getPrice() {
        return new BigDecimal(
                driver.findElement(By.className("num.weight-500"))
                        .getText()
                        .replace("$", "")
        ).setScale(2, RoundingMode.UNNECESSARY); // Sanitation and formatting
    }
    private final By addToCartElement = By.xpath("//a[contains(@class,'main-btn sec animate toggle-cartside')]");
    private final By itemDetails = By.xpath("//a[contains(@href,'/item-details/')]");

    public void addToCart() {
        WebElement element = find(addToCartElement);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartElement));
        element.click();
    }

    public void openItemDetails(){
        WebElement element = find(itemDetails);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(itemDetails));
        element.click();
    }

}
