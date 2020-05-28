package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class a8MouseMovement {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		    
		    ChromeDriver driver = new ChromeDriver();
		    
		    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		    
		    driver.findElement(By.name("txtUsername")).sendKeys("Admin");// User name
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");// Password
		    driver.findElement(By.name("Submit")).click();// login butt
		    
		    Thread.sleep(5000);// Pause for 5 sec
		    
		    Actions action = new Actions(driver);// is a class 
		    		
		    action.moveToElement(driver.findElement(By.linkText("Admin"))).build().perform();// mouse moved to Admin
		    
		    Thread.sleep(5000);// pause
		    action.moveToElement(driver.findElement(By.linkText("User Management"))).build().perform();// mouse moved to management
		    
		    Thread.sleep(4000);// pause
		    driver.findElement(By.linkText("Users")).click();// click on users
		    

	}

}
