package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class RegisterPage extends PageBase {

    private By firstNameField = By.xpath("//input[contains(@formcontrolname, 'firstName')]");
    private By lastNameField = By.xpath("//input[contains(@formcontrolname, 'lastName')]");
    private By emailField = By.xpath("//input[contains(@formcontrolname, 'email')]");
    private By phoneNoField = By.id("phone");
    private By passwordField = By.id("password-field");
    private By confirmPasswordField = By.xpath("//*[@id='password-field-2']");
    private By agreeCheckBox = By.id("agree");
    private By registerBtn = By.xpath("//button[contains(@input,'submit')]");

    public void UserRegister(String firstName, String lastName, String email, String password, Integer phoneNumber) {
        sendKeys(firstNameField, firstName);
        sendKeys(lastNameField, lastName);
        sendKeys(emailField, email);
        sendKeys(passwordField, password);
        sendKeys(confirmPasswordField, password);
        click(agreeCheckBox);

        // To send Integer keys in textField that accepts only numbers
        Actions actions = new Actions(driver);
//        find(phoneNoField).clear();
        actions.moveToElement(find(phoneNoField)).click().sendKeys(phoneNumber.toString()).build().perform();
    }

    public void userClickOnRegisterBtn() {
        click(registerBtn);
    }
}
