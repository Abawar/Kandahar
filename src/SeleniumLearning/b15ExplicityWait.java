package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class b15ExplicityWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);// wait for page loading.
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);// putting wait for all elements in page.
	                                                                    // we put a wait time for a spesfic elemnt
	   
	    
		driver.get("https://www.amazon.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ur xpath here")));
		
	
	}}
 
	

	


	 
	 
	 
	

