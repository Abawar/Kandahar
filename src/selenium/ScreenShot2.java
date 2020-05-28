package selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
			
		    ChromeDriver driver=new ChromeDriver();
		    
		    driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			driver.get("https://www.wikipedia.org/");
			
			driver.manage().window().maximize();
			
	}
           public static void takeScreenshot(String fileName) {
        	   
        	   //1) take screenshot and store is as file format.
        	  
        //	File file=  (TakesScreenshot)driver).takeScreenshot(OutputType.FILE);
	
}
}
