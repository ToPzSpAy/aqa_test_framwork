package test;


import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;


public class SomeTest extends BaseTest {

    private MainPage mainPage;

    @Test
    public void openPage(){
        mainPage = new MainPage();
        driver.get(BASE_URL);
        String curUrl = mainPage.getHealth();
        Assertions.assertEquals(curUrl, "https://myinsurance-ift.astondevs.ru/info/health");
    }

}