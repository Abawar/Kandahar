package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b20ElementsVisibillityTest {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("http://sunilpatro1985.blogspot.com/p/demo_7.html");
		driver.manage().window().maximize();
		
		//1 isDisplayed() method : applicable for all elemnst in the page (want make sure is the target element displaying in the page or not)
		// and its retun a boolean and we have to put boolean.
		boolean b1 = driver.findElement(By.id("next")).isDisplayed();
		System.out.println(b1);// true
		
		//2 isEnabale method: 
		boolean b2 = driver.findElement(By.id("next")).isEnabled();// false , coz we did't mark the check box. 
		System.out.println(b2);//false
	
		// make the submit Btn enable by checking the box: Click on the checkbox, to enable the 'submit' button in 4 seconds
		driver.findElement(By.id("transcheck1")).click();// it make the submit Btn enable.
		boolean b3 = driver.findElement(By.id("next")).isEnabled();// true , coz we did't mark the check box. 
		System.out.println(b3);//true
		
		//3 isSelected () method: only applicable for check box , drop down,radio button.
		boolean b4 = driver.findElement(By.id("transcheck1")).isSelected();//  
		System.out.println(b4);
		
		// de-select the check box:
		driver.findElement(By.id("transcheck1")).click();
		boolean b5 = driver.findElement(By.id("transcheck1")).isSelected();//  
		System.out.println(b5);
		
		// 571 317 8193
		
		
		
		

	}

}
