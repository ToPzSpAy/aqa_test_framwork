package core;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

abstract public class BaseTest {
    public static final String BASE_URL = "https://myinsurance-ift.astondevs.ru";
    private static final int TIMEOUT = 10;
    protected static WebDriver driver;
    public static final Logger LOGGER = Logger.getLogger(BaseTest.class.getName());

    @BeforeAll
    public static void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
        BasePage.setDriver(driver);
    }

    @AfterAll
    public static void tearDown(){
        driver.close();
        driver.quit();
    }


}
