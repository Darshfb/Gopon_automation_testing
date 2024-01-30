package pages;

import org.openqa.selenium.By;

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
