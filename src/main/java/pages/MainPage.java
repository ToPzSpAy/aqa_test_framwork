package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;


import static core.BaseTest.BASE_URL;


public class MainPage extends BasePage {
    Actions actions = new Actions(driver);

    @FindBy(xpath = "//button[@class='btn--aFO8s secondary--ITtaf']")
    private WebElement authButton;
    //NavBar Insurance
    //Авто
    @FindBy(xpath = "//div[@data-testid='dropDownList'][1]")
    private WebElement auto;

    @FindBy(xpath = "//div[@data-testid='dropDownList'][1]/div/a[1]")
    private WebElement autoKasko;

    @FindBy(xpath = "//div[@data-testid='dropDownList'][1]/div/a[2]")
    private WebElement autoOsago;

    //Имущество
    @FindBy(xpath = "//div[@data-testid='dropDownList'][2]")
    private WebElement estate;

    @FindBy(xpath = "//div[@data-testid='dropDownList'][2]/div/a[1]")
    private WebElement estateApartment;

    @FindBy(xpath = "//button[@class='btn--aFO8s primary--SF0lt'][@data-testid='button']")
    ////button[@class='btn--aFO8s primary--SF0lt']
    private WebElement oformEstateApartment;

    @FindBy(xpath = "//div[@data-testid='dropDownList'][2]/div/a[2]")
    private WebElement estateHouse;

    //Здоровье
    @FindBy(xpath = "//div[@data-testid='dropDownList'][3]")
    private WebElement health;

    @FindBy(xpath = "//div[@data-testid='dropDownList'][3]/div/a[1]")
    private WebElement healthDMS;
    @FindBy(xpath = "//div[@data-testid='dropDownList'][3]/div/a[2]")
    private WebElement healthLifeInsurance;
    //Отдых
    @FindBy(xpath = "//div[@data-testid='dropDownList'][4]")
    private WebElement rest;
    @FindBy(xpath = "//div[@data-testid='dropDownList'][4]/div/a[1]")
    private WebElement restTravelInsurance;
    @FindBy(xpath = "//div[@id='userName']")
    private WebElement dropMenuList;
    @FindBy(xpath = "//button[@data-testid='button'][text()='Личный кабинет']")
    private WebElement profileButton;
    @FindBy(xpath = "//div[@class='wrapperNotification--DIRza']/button//*[name()='svg']")
    private WebElement bellButton;
    @FindBy(xpath = "//div[text()='Посмотреть всё']")
    private WebElement viewAllNotificationsButton;
    @FindBy(xpath = "//button[@class = 'buttonSpecial--Rqgpf']")
    private WebElement insuranceEventButton;
    @FindBy(xpath = "//a[@href='/']")
    private WebElement logOutButton;
    @FindBy(xpath = "//button[@class = 'btn--aFO8s link--Ayvd_']")
    private WebElement officesButton;
    @FindBy(xpath = "//a[@href='/account/payments']")
    private WebElement paymentsButton;


    public MainPage() {
        driver.get(BASE_URL);
        PageFactory.initElements(driver, this); //инициализируем данный класс
    }


    public void openSideBar() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        dropMenuList.click();
    }

    public void openOfficesPage(){
        officesButton.click();
    }

    public String getAuthPageURL() {
        authButton.click();
        return driver.getCurrentUrl();
    }

    public String getAuto() {
        auto.click();
        return driver.getCurrentUrl();
    }

    public String getAutoKasko() {
        actions.moveToElement(auto).build().perform();
        autoKasko.click();
        return driver.getCurrentUrl();
    }

    public String getAutoOsago() {
        actions.moveToElement(auto).build().perform();
        autoOsago.click();
        return driver.getCurrentUrl();
    }

    public String getEstate() {
        estate.click();
        return driver.getCurrentUrl();
    }

    public String getEstateApartment() {
        actions.moveToElement(estate).build().perform();
        estateApartment.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return driver.getCurrentUrl();
    }

    public String getEstateHouse() {
        actions.moveToElement(estate).build().perform();
        estateHouse.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return driver.getCurrentUrl();
    }

    public String getHealth() {
        health.click();
        return driver.getCurrentUrl();
    }

    public String getHealthDMS() {
        actions.moveToElement(health).build().perform();
        healthDMS.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        return driver.getCurrentUrl();
    }

    public String getHealthLifeInsurance() {
        actions.moveToElement(health).build().perform();
        healthLifeInsurance.click();
        return driver.getCurrentUrl();
    }

    public String getRest() {
        rest.click();
        return driver.getCurrentUrl();
    }

    public String getRestTravelInsurance() {
        actions.moveToElement(rest).build().perform();
        restTravelInsurance.click();
        return driver.getCurrentUrl();
    }

    public String getInsuranceEventInfo(){
        insuranceEventButton.click();
        return driver.getCurrentUrl();
    }

    public void openNotificationModalWindow(){
        bellButton.click();
    }

    public void openViewAllNotifications(){
        viewAllNotificationsButton.click();
    }

    public void openPaymentsPage(){
        dropMenuList.click();
        paymentsButton.click();
    }

    public void logOut(){
        openSideBar();
        logOutButton.click();
    }
}
