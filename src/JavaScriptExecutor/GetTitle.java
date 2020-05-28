package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(50000,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	   
		
		driver.get("https://www.vec.virginia.gov/");
		
		System.out.println("print the title troug selenuim:---> " + driver.getTitle());// through Selenuim
		
		// through JS executor
		String title = GetTitle.getTitleByJS(driver);
		
            System.out.println("print the title trough JSexecutor:--->" + title);
            
            driver.close();
	}
	
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver); 
		String title = js.executeScript("return document.title;").toString();
		return title;

	}
}
