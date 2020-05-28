package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class b24CalendarHandleJS {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().pageLoadTimeout(4000,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
	        
	        driver.get("https://www.spicejet.com/"); // open Spicejet 
	        
	        WebElement date = driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_view_date1\"]"));
	        String dateVal = "05-28-2020";
	        
	        selectDateByJS(driver,date,dateVal);
	        

	}
 
	        public static void selectDateByJS(WebDriver driver, WebElement element,String dateVal){
	        	JavascriptExecutor js = ((JavascriptExecutor) driver);
	        	js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element);
	        }
}
