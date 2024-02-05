package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
        //npx allure-commandline serve -> Command to run allure report
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
    public void stopDriver(Scenario scenario) {
//            try {
//                String screenShotName = scenario.getName().replaceAll(" ", "_");
//                if(scenario.isFailed()){
//                    scenario.log("This is failure");
//                    TakesScreenshot ts = (TakesScreenshot) driver;
//                    byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//                    scenario.attach(screenshot, "image/png", screenShotName);
//                }
//        }catch (Exception e){
//                e.printStackTrace();
//            }
//        driver.quit();
    }
}
