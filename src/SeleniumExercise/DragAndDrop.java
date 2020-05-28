package SeleniumExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(5000);
		
		Actions actio = new Actions(driver);
		
		actio.clickAndHold(driver.findElement(By.xpath("//div[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.id("droppable"))).build().perform();
				
		
		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
