//import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class chrometest {
 public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","/Users/hasnake/Driver/chromedriver");
  WebDriver driver = new ChromeDriver();
  driver.get("http://komonews.com/watch");
  driver.close();
  driver.quit();
 }
}


/*
Illegal state Exception
The path to the driver executable must be set by the webdriver.chrome.driver system property; for more information
needs system.setProperty("webdriver.chrome.driver","path")
*/

