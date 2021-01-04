package webDriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
		driver=new FirefoxDriver();
		
	}
	@Test
	public void doLogin()
	{
		driver.get("https://www.gmail.com");
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
