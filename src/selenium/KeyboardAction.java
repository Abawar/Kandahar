package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://the-internet.herokuapp.com/key_presses");
		
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		
		Actions act1=new Actions(driver);
		act1.sendKeys(Keys.DELETE).build().perform();
		
		Actions act2=new Actions(driver);
		act2.sendKeys(Keys.SPACE).build().perform();
		

	}

}
