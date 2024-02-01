package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import pages.HomePage;
import pages.PageBase;

import java.time.Duration;

public class TestBase {

    public static WebDriver driver;
    PageBase pageBase;

    @Before
    public void startDriver() {
        /*
        Chrome Headless ->
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        or -headless
         driver = new ChromeDriver(options);
        Firefox Headless ->
        FirefoxOptions options1 = new FirefoxOptions();
        options1.addArguments("-headless");
        driver = new FirefoxDriver(options1);
         */
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
