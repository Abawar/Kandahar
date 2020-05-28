package SeleniumExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop4 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
			
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			
			Actions act1 = new Actions(driver);
			
			act1.clickAndHold(driver.findElement(By.id("box1")));
			Thread.sleep(5000);
			act1.moveToElement(driver.findElement(By.id("box103"))).build().perform();
			Thread.sleep(5000);

	}

}
