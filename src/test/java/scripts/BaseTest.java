package scripts;

import driver.DriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

    static WebDriver driver;
    static Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeMethod
    @Parameters({"browser"})
    public void setupTest(@Optional("chrome") String browser) {
        logger.info("Setting up WebDriver...");
        DriverFactory driverFactory = new DriverFactory();
        driverFactory.setDriver("chrome");
        driver = driverFactory.getDriver();
        driver.get("https://wallet.moonstake.io");
        logger.info("Navigated to test site: https://wallet.moonstake.io");
    }
    public WebDriver getDriver() {
        return driver;
    }
}
