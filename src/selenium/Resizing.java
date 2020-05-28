package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizing {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http:jqueryui.com/resizable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement element=driver.findElement(By.xpath("//*[@id='resizable']/div[3]"));
		
		Thread.sleep(3000);

		Actions act=new Actions(driver);
		
		act.moveToElement(element).dragAndDropBy(element, 200, 150).build().perform();
	}

}
