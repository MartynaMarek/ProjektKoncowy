package Zadanie1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

public class PrivateUserTest {
    @RunWith(Cucumber.class)
    @CucumberOptions(features = "src/test/java/Zadanie1/",
            plugin = {"pretty", "html:out"})
    public class PrivateUserTest {
    }
}
