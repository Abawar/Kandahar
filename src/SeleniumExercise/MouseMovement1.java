package SeleniumExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement1 {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		    
		    ChromeDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();//
		    
		    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		    
		    driver.findElement(By.name("txtUsername")).sendKeys("Admin");// User name
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");// Password
		    driver.findElement(By.name("Submit")).click();// login butt
		    
		    Actions action = new Actions(driver);
		    
		    action.moveToElement(driver.findElement(By.linkText("Admin"))).build().perform();
		    
		    Thread.sleep(5000);// pause
		    action.moveToElement(driver.findElement(By.linkText("User Management"))).build().perform();
		    
		    Thread.sleep(5000);
		    
		    driver.findElement(By.linkText("Users")).click();
		    
		    

	}

}
