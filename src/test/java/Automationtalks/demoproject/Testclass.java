package Automationtalks.demoproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass {
	public static WebDriver driver;
	
	@BeforeMethod
public void launchdriver()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().fullscreen();	
	}
	
	@Test
public void Test1() {
	driver.navigate().to("https://automationtalks.com/");
	System.out.println("Test1 title is "+driver.getTitle());	
}
	@Test
public void Test2()
{
	driver.navigate().to("https://automationtalks.com/");
	System.out.println("Test2 title is "+driver.getTitle());	
	}
	@Test

public void Test3()
{

	driver.navigate().to("https://automationtalks.com/");
	System.out.println("Test3 title is "+driver.getTitle());
	}
	
	@AfterMethod
	public void quit() {
		
		driver.quit();
		
	}
}

