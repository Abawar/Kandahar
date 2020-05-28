package BootCamp2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitVsExplicitTimeOut {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		
		WebElement UserName= driver.findElement(By.name("userName"));
		WebElement Password= driver.findElement(By.name("password"));
		WebElement Login = driver.findElement(By.xpath("//*[@name='login']"));
	
		
		Senkeys(driver,UserName,10,"mercury");
		Senkeys(driver, Password,5,"mercury");
	    ClickOn(driver, Login,10);
	}
	public static void Senkeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);}
	
		public static void ClickOn(WebDriver driver, WebElement element, int timeout) {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
			element.click();}}
// Implicit wait we can give a specific wait time to the web driver for all element until he found it.
// Explicit wait we can customize waiting time for each element different waiting time. 



