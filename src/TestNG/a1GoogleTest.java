package TestNG;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a1GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
		
	driver.get("http://www.google.com");
		
	}
	// 1 test case
	@Test
	public void googleTitileTest(){
		System.out.println(driver.getTitle());
	}
    // 2 test case
	@Test
	public void googleLogoTest() {
	    boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	}
	// 3 test case
	@Test
	public void gmail() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
