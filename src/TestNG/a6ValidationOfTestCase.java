package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a6ValidationOfTestCase {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
	
	System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
	driver = new ChromeDriver();
	
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
  driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
  driver.manage().deleteAllCookies();
	
     driver.get("http://www.google.com");
	
}
   @Test()
   public void googleTitileTest(){
	   String title = driver.getTitle();
	System.out.println(title);
	
	Assert.assertEquals(title,"Google", "title is not matched");// assert will validate our test case ==> test case passed
	// Assert.assertEquals(title,"Google123", "title is not matched"); ==> test case is failed coz actual result didt meet expected result
}
   @Test
	public void googleLogoTest() {
	    boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	    Assert.assertTrue(b);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	
}
}