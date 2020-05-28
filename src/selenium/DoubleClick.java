package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https:api.jquery.com/dblclick");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.xpath("/html/body/div"));////*[@id="content"]/comment()     -----/html/body/div
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.doubleClick(ele).build().perform();
		Thread.sleep(2000);
		
		act.doubleClick(ele).perform();
		Thread.sleep(2000);
		
        act.doubleClick(ele).perform();
		Thread.sleep(2000);
		
			
		

	}

}
