package SeleniumExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement sourse = driver.findElement(By.id("box3"));
		WebElement target = driver.findElement(By.id("box103"));
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(sourse, target).build().perform();
		//Thread.sleep(3000);
		
///////////////////////////////////////////////////////////////
		
		WebElement source1 = driver.findElement(By.id("box6"));
		WebElement target1 = driver.findElement(By.id("box106"));
		Thread.sleep(3000);
		Actions act1 = new Actions(driver);
		act1.dragAndDrop(source1, target1).build().perform();
		//Thread.holdsLock(3000);
		
///////////////////////////////////////////////////////////////
		
		WebElement source2 = driver.findElement(By.id("box1"));
		WebElement target2 = driver.findElement(By.id("box101"));
		Thread.sleep(3000);
		Actions act2 = new Actions(driver);
		act2.dragAndDrop(source2, target2).build().perform();
		//Thread.sleep(3000);
				
////////////////////////////////////////////////////////////////////
		
		WebElement source3 = driver.findElement(By.id("box4"));
		WebElement target3 = driver.findElement(By.id("box104"));
		Thread.sleep(5000);
		Actions act3 = new Actions(driver);
		act3.dragAndDrop(source3, target3).build().perform();
		Thread.sleep(3000);
		
		
		driver.close();
		
	}

}
