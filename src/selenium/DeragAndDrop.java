package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().window().maximize();
		
		WebElement source_element=driver.findElement(By.id("box6"));
		WebElement target_element=driver.findElement(By.id("box106"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		
		act.dragAndDrop(source_element, target_element).build().perform();
		
		
		WebElement source1_element=driver.findElement(By.id("box3"));
		WebElement target1_element=driver.findElement(By.id("box103"));
		
		Actions act1=new Actions(driver);
		Thread.sleep(3000);	
		act1.dragAndDrop(source1_element, target1_element).build().perform();
		
		WebElement source2_element=driver.findElement(By.id("box1"));
		WebElement target2_element=driver.findElement(By.id("box101"));
		
		Actions act2=new Actions(driver);
		Thread.sleep(3000);	
		act2.dragAndDrop(source2_element, target2_element).build().perform();
		
		
	}

}
