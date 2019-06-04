package TestIntegration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void testGoogleTitle() throws InterruptedException {
	  
	  String path="config/chromedriver.exe";
	  
	  System.setProperty("webdriver.chrome.driver", path);
	  WebDriver driver = new ChromeDriver();
	  //Set to high time out as it wasn't working in jenkin run
	  //driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	  driver.get("http://www.google.co.in");
	  String title = driver.getTitle();
	  System.out.println(title);
	  System.out.println("Launched from Jenkins war file - To Test");
	  Thread.sleep(5000);
	  Assert.assertEquals(title, "Google");
	  driver.close();
  }
}

