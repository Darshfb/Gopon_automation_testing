package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends PageBase {

    private By loginBtn = By.xpath("//a[contains(@class,'login')]");
    private By registerButton = By.xpath("//a[contains(@class,'main-btn')]");
    private By userLoggedIn = By.xpath("//span[contains(@class, 'text')]");
    private By accountButton = By.xpath("//a[contains(@routerlink,'/account')]");

    public void openLoginPage() {
        click(loginBtn);
    }

    public String getUserName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(userLoggedIn));
        return getText(userLoggedIn);
    }

    public void openRegisterPage() {
        click(registerButton);
    }

    public Boolean checkLoginFailed() {
        return isElementAppear(loginBtn);
    }
    public void openMyAccountPage(){
        if(getUserName() != null){
            click(userLoggedIn);
            click(accountButton);
        }
    }
}
