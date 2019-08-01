package codersguru;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.codersguru.LoginPage;

public class LoginTest {


    @Before

    public void setUp() {
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");



    }

    @Test
    public void testProperLogin(){
        LoginPage loginPage = new LoginPage();

    }


}