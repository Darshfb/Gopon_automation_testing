package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends PageBase{
    private By emailField = By.xpath("//input[contains(@type,'email')]");
    private By passwordField = By.id("password-field");
    private By loginBtn = By.xpath("//button[contains(@class,'main-btn')]");

    public void userLogIn(String email, String password){
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
        click(loginBtn);
    }


}
