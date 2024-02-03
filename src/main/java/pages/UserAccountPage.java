package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UserAccountPage extends PageBase {
    private By firstNameField = By.xpath("//input[contains(@formcontrolname, 'firstName')]");
    private By lastNameField = By.xpath("//input[contains(@formcontrolname, 'lastName')]");
    private By emailField = By.xpath("//input[contains(@formcontrolname, 'email')]");
    private By phoneNoField = By.id("phone");
    private By birthDateField = By.name("date");
    private By areaField = By.xpath("//*[@id='edit-account']/form/div/div[6]/div/select");
    private By addressField = By.xpath("//input[contains(@formcontrolname, 'address')]");
    private By saveButton = By.xpath("//button[contains(@type, 'button')]");


    public void selectAreaDropDownList(String areaValue) {
        Select options = new Select(find(areaField));
        options.selectByValue(areaValue);
    }

    public void updateUserAccountData(String firstName, String lastName, String email, String phone, String birthdate, String address, String areaValue) {
//        sendKeys(firstNameField, firstName);
        sendKeys(firstNameField, firstName);
        sendKeys(lastNameField, lastName);
        sendKeys(emailField, email);
        // To send Integer keys in textField that accepts only numbers
        Actions actions = new Actions(driver);
        actions.moveToElement(find(phoneNoField)).doubleClick().sendKeys(phone).build().perform();
        sendKeys(birthDateField, birthdate);
        selectAreaDropDownList(areaValue);
        sendKeys(addressField, address);
        click(saveButton);
    }

}
