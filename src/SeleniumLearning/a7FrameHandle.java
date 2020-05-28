package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a7FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		    System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		    
		    ChromeDriver driver = new ChromeDriver();
		    
		    driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		    
		    Thread.sleep(5000);
		    
		    driver.switchTo().frame("packageListFrame");// this is a method for entring to the frsm and frams alsoways finding by thier name.
		    driver.findElement(By.linkText("org.openqa.selenium")).click();// elemnt inside of the method 
		    driver.switchTo().defaultContent();// exit from frame 
		    
		    Thread.sleep(5000);
		    
		    driver.switchTo().frame("packageFrame");
		    driver.findElement(By.linkText("Alert")).click();
	        driver.switchTo().defaultContent();
	        
	        driver.switchTo().frame("classFrame");
	        driver.findElement(By.xpath("//div[@class='topNav']//a[contains(text(),'Deprecated')]")).click();
	        
		    Thread.sleep(5000);
		    driver.quit();
		    
		    
		    
		

	}

}

// Frame is alos an webelemnt in application or wibside. and frame may have sub frames and sub elemnst,
// handleing fram, we have to switch from page to the frame by cmond driver.Switchtofram/ frames index start from 0.