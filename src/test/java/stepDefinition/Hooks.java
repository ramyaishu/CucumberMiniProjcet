package stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Hooks
{
    WebDriver driver;
    ConfigFile configFile;
   @Before
    public WebDriver beforeHooks() throws IOException {
        driver=BaseClass.init();
        configFile= new ConfigFile();
        driver.get(configFile.url());
        System.out.println("Test Started");
        return driver;
    }
   @After
    public void tearDown()
    {

        System.out.println("Test Ended");
        driver.quit();
    }
}
