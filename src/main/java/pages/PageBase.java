package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    // Create constructor to use it in other pages

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    protected static void clickButton(WebElement button) {
        button.click();
    }

    protected static void sendTextElement(WebElement text, String value) {
        text.sendKeys(value);
    }


}
