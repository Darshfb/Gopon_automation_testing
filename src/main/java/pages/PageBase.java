package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class PageBase {
    public static WebDriver driver;

    public void setDriver(WebDriver driver) {
        PageBase.driver = driver;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    protected void sendKeys(By locator, String text) {
        Actions actions = new Actions(driver);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.moveToElement(find(locator)).doubleClick().click().sendKeys(text).build().perform();

    }

    protected String getText(By locator) {
        return find(locator).getText();
    }

    protected boolean isElementAppear(By locator) {
        try {
            find(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
