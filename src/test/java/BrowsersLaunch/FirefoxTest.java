package BrowsersLaunch;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {

        public static void main(String[] args) {
            System.setProperty("webdriver.gecko.driver", "/Users/hasnake/Driver/geckodriver");
            WebDriver driver=new FirefoxDriver();
            driver.get("http://komonews.com/watch");
            //Assert.assertTrue("title should start with Selenium simplified",driver.getTitle().startsWith("Selenium Simplified"));
//            driver.close();
//            driver.quit();
        }
    }

    /*
Exception in thread "main" java.lang.IllegalStateException:
The path to the driver executable must be set by the webdriver.gecko.driver system property; for more information, see https://github.com/mozilla/geckodriver.
*/
