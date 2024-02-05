package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.function.Predicate;

public class HomePage extends PageBase {

    private final By loginBtn = By.xpath("//a[contains(@class,'login')]");
    private final By registerButton = By.xpath("//a[contains(@class,'main-btn')]");
    private final By userLoggedIn = By.xpath("//span[contains(@class, 'text')]");
    private final By accountButton = By.xpath("//a[contains(@routerlink,'/account')]");

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

    public void openMyAccountPage() {
        if (getUserName() != null) {
            click(userLoggedIn);
            click(accountButton);
        }
    }

    private final By item = By.xpath("//a[contains(@href,'/item-details/')]");

    public List<Product> getProducts() {
        return driver.findElements(item).stream()
                .map(e -> new Product()).toList();
    }

    public Product getProduct(Predicate<Product> condition) {
        List<Product> list = getProducts();
        return list
                .stream()
                .filter(condition) // Filter by product name or price
                .findFirst()
                .orElseThrow();
    }
}
