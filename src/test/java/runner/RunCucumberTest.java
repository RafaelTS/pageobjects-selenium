package runner;

import org.junit.Before;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunCucumberTest {
    private static WebDriver driver = new ChromeDriver();

    @Before
    public void inializaDriver(){
    }

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "features"
            ,glue={"stepDefinition"}
    )
    public class LoginPage {
    }
}
