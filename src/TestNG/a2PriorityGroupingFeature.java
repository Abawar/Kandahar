package TestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class a2PriorityGroupingFeature {
	
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
	@Test(priority=5, groups="Elements test")
	public void googleTitileTest(){
		System.out.println(driver.getTitle());
	}
    // 2 test case
	@Test(priority=3, groups="Logo")
	public void googleLogoTest() {
	    boolean b = driver.findElement(By.xpath("//*[@id=\"hplogo\"]")).isDisplayed();
	}
	// 3 test case
	@Test(priority=4, groups="Elemenst test")
	public void gmail() {
		boolean b = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	@Test(priority=1, groups="search test")
	public void search() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("book");
		 Thread.sleep(5000);
	}
	@Test(priority=2,groups="Elements test")
	public void linkList() {
		List <WebElement> list = driver.findElements(By.tagName("a"));
		int a = list.size();
		
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
