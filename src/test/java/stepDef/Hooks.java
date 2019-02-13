package stepDef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import utilities.ConfigFileReader;
import utilities.Log;

    public class Hooks {

        public static WebDriver myDriver;
        public static ConfigFileReader cfr = new ConfigFileReader();

        @Before
        public void beforeTest(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\personal\\FinalFacebookProject\\chromedriver.exe");

            myDriver = new ChromeDriver();
            myDriver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
            Log.startTestCase("Scenario");

        }

        @After
        public void afterTest(){
            Log.endTestCase("Scenario");
            myDriver.quit();

        }
    }

