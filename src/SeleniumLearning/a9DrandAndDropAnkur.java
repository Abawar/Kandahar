package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class a9DrandAndDropAnkur {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement Sourse = driver.findElement(By.id("box3"));
		WebElement Target = driver.findElement(By.id("box103"));
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(Sourse, Target).build().perform();
		
		
// if the drag and drop boxs were not in frame we have to use this method 
         
	}

}
