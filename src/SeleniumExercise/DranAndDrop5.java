package SeleniumExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DranAndDrop5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium/chromedriver.exe");
	 
	 ChromeDriver driver = new ChromeDriver();
	 
	 driver.manage().deleteAllCookies();
	 driver.manage().window().maximize();
	 
	 driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	 
	 driver.get("https://jqueryui.com/droppable/");
	 
	 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	 
	 Actions act = new Actions(driver);
	 
	 act.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 Thread.sleep(5000);
	 driver.close();
	 
	 
	}

}
