package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.PageBase;

import java.time.Duration;

public class TestBase {

    public static WebDriver driver;
    PageBase pageBase;

    @Before
    public void startDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.get("https://goponsitedev.softlinktest.com/home");
        pageBase = new PageBase();
        pageBase.setDriver(driver);

    }

    @After
    public void stopDriver() {
        driver.quit();
    }
}
