package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RegisterPage extends PageBase {

    By firstNameField = By.xpath("//input[contains(@formcontrolname, 'firstName')]");
    By lastNameField = By.xpath("//input[contains(@formcontrolname, 'lastName')]");
    By emailField = By.xpath("//input[contains(@formcontrolname, 'email')]");
    By phoneNoField = By.id("phone");
    By passwordField = By.id("password-field");
    By confirmPasswordField = By.xpath("//*[@id='password-field-2']");
//    By confirmPasswordField = By.id("//*[@id='password-field-2']");

    By agreeCheckBox = By.id("agree");
    By registerBtn = By.xpath("//button[contains(@input,'submit')]");

    public void UserRegister(String firstName, String lastName, String email, String password, Integer phoneNumber) {
//        sendKeys(phoneNoField, '123');
        sendKeys(firstNameField, firstName);
        sendKeys(lastNameField, lastName);
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
        sendKeys(confirmPasswordField, password);
        click(agreeCheckBox);

        // To send Integer keys in textField that accepts only numbers
        Actions actions = new Actions(driver);
        actions.moveToElement(find(phoneNoField)).click().sendKeys(phoneNumber.toString()).build().perform();

    }

    public void userClickOnRegisterBtn() {
//        click(registerBtn);
    }
}
