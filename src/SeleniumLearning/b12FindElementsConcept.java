package SeleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b12FindElementsConcept {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
// targets:
		
		// get the count of links in the page.
		// get the text of each link in th apge 
		
		//driver.findElements(By.tagName("a")); ==> we have this method by tag name,  now we creating list class with obj refrence.
	
		List <WebElement> linklist = driver.findElements(By.tagName("a")); // List class is from JAVA and WebElemen class form selenium
               
		// size of links.
		
		System.out.println(linklist.size());
		
		for( int i = 0; i<linklist.size(); i++) {
			String linktext =linklist.get(i).getText();
			
			System.out.println(linktext);
			
		}
		
	}

}
