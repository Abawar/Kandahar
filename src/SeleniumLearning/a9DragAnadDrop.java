package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class a9DragAnadDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
	    
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();//
	    
	    driver.get("https://jqueryui.com/droppable/");
	    
	    Thread.sleep(4000);
	    
	    driver.switchTo().frame(0);
	    
	    Actions action = new Actions(driver);
	    
	    action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
	    
	    
// if the drag and drop boxes were in frame we have to use this method	    

	}

}
