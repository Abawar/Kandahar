package SeleniumExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop9 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source_element=driver.findElement(By.id("box6"));
		WebElement target_element=driver.findElement(By.id("box106"));
		
		Actions act=new Actions(driver);
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	Actions action = new Actions(driver);
		
		//action.clickAndHold(driver.findElement(By.id("box6"))).moveToElement(driver.findElement(By.id("box106"))).build().perform();

	}

}
