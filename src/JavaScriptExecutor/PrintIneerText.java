package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintIneerText {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	   
		
		driver.get("https://www.vec.virginia.gov/");
		System.out.println(getPageInnerText(driver)); // called the main method and put it in syso .
		
           
	}

	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
		
		}
	}


	

