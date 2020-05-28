package SeleniumExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DROPandDRAGpractice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions hold = new Actions (driver);
		hold.clickAndHold(driver.findElement(By.id("box2"))).moveToElement(driver.findElement(By.id("box102"))).release().build().perform();
		hold.clickAndHold(driver.findElement(By.id("box1"))).moveToElement(driver.findElement(By.id("box101"))).release().build().perform();
		hold.clickAndHold(driver.findElement(By.id("box3"))).moveToElement(driver.findElement(By.id("box103"))).release().build().perform();
		hold.clickAndHold(driver.findElement(By.id("box4"))).moveToElement(driver.findElement(By.id("box104"))).release().build().perform();
		hold.clickAndHold(driver.findElement(By.id("box5"))).moveToElement(driver.findElement(By.id("box105"))).release().build().perform();
		hold.clickAndHold(driver.findElement(By.id("box6"))).moveToElement(driver.findElement(By.id("box106"))).release().build().perform();
		hold.clickAndHold(driver.findElement(By.id("box7"))).moveToElement(driver.findElement(By.id("box107"))).release().build().perform();
		Thread.sleep(2000);
		driver.close();
	}

}
