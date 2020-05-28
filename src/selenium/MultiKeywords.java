package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiKeywords {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		//driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		//act.sendKeys(Keys.CONTROL+"a").build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();

	}

}
