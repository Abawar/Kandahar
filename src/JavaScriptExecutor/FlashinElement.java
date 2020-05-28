package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlashinElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	   
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement loginBtn = driver.findElement(By.name("Submit"));
		flash(loginBtn, driver);
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);	
		String bgcolor = element.getCssValue("backgroundColor");
				
				for(int a = 0; a<30;a++) {
					chnageColor("rgb(0,200,0)",element,driver);
					chnageColor(bgcolor, element,driver);
				}
	}

	public static void chnageColor(String color , WebElement element, WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
	}
	
	public static void changeColor (String color, WebElement element,  WebDriver driver) 
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
	}

}
