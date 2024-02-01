package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
        WebElement element = find(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected String getText(By locator) {
        String text = find(locator).getText();
        System.out.println("Text: " + text);
        return text;
    }

    protected boolean isElementAppear(By locator){
        try {
            find(locator);
            return true;
        }catch (NoSuchElementException e){
            return false;
        }
    }

}
