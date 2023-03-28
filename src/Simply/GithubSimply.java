package Simply;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GithubSimply {
 @Test
 void setup()
 {
	 System.setProperty("webdriver.chrome.driver", "/home/active30/Downloads/chromedriver_linux64 (1)/chromedriver");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.selenium.dev/");
 }

}
