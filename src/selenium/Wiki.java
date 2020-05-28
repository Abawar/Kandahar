package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wiki {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
			
		    ChromeDriver driver=new ChromeDriver();
		    
		    driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			driver.get("https://www.wikipedia.org/");
			
			driver.manage().window().maximize();
			
		
			driver.findElement(By.id("searchInput")).sendKeys("Abdullah");
			Thread.sleep(10000);
			
			driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click();
	}

}
