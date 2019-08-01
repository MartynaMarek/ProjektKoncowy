package Zadanie1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrivateUser {

    WebDriver driver;
    @Given("^an open browser with https://tester.codersguru.pl/$")
    public void anOpenBrowserWithHttpsTesterCodersguruPl() {
        // Skonfiguruj sterownik przeglądarki
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/geckodriver");
// Uruchom nowy egzemplarz przeglądarki Firefox
        driver = new FirefoxDriver();
// Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
// Przejdź do tester.codersguru
        driver.get("http://www.tester.codersguru.com");}

}

    @When("^button 'Załóż konto' is clicked$")
    public void buttonZałóżKontoIsClicked() {
    }

    @And("^open the registration page$")
    public void openTheRegistrationPage() {
    }

    @And("^button'Prywatnie' is clicked$")
    public void buttonPrywatnieIsClicked() {

    }

    @And("^write down E-mail adress in 'E-mail' box$")
    public void writeDownEMailAdressInEMailBox() {

    }

    @And("^write down Imię in 'Imię' box$")
    public void writeDownImięInImięBox() {

    }

    @And("^write down Nazwisko in 'Nazwisko' box$")
    public void writeDownNazwiskoInNazwiskoBox() {

    }

    @And("^write down Hasło in 'Hasło' box$")
    public void writeDownHasłoInHasłoBox() {

    }

    @And("^write down Powtórz hasło in 'Powtórz hasło' box$")
    public void writeDownPowtórzHasłoInPowtórzHasłoBox() {

    }

    @And("^write down Miasto in 'Miasto' box$")
    public void writeDownMiastoInMiastoBox() {

    }

    @And("^write down Kod pocztowy in 'Kod pocztowy' box$")
    public void writeDownKodPocztowyInKodPocztowyBox() {

    }

    @And("^write down Ulica in 'Ulica' box$")
    public void writeDownUlicaInUlicaBox() {

    }

    @And("^write down Numer domu/lokalu in 'Numer domu/lokalu' box$")
    public void writeDownNumerDomuLokaluInNumerDomuLokaluBox() {

    }

    @And("^click checkbox 'Zapoznałem się z Regulaminem'$")
    public void clickCheckboxZapoznałemSięZRegulaminem() {

    }

    @And("^click 'Zarejestruj' button$")
    public void clickZarejestrujButton() {

    }

    @Then("^registered page is appeared$")
    public void registeredPageIsAppeared() {
    }
}
