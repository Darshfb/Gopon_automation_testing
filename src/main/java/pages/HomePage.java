package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }




//    WebElement loginPage = driver.findElement();
    By loginPage = By.xpath("/html/body/app-root/app-layout/app-header/app-toolbar/nav/div/div/div[2]/div[2]/div/a[1]");
//    WebElement registerButton = driver.findElement(By.className("main-btn.sec.animate.d-none.d-md-block"));

    @FindBy(xpath = "//a[@class='login d-none d-md-block']")
    WebElement login;


    public void openLoginPage() {
        login.click();
    }

    public void openRegisterPage() {
        login.click();

//            driver.findElement(loginPage).click();
    }
}
