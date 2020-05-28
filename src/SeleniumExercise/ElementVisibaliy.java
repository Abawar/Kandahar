package SeleniumExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibaliy {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("http://sunilpatro1985.blogspot.com/p/demo_7.html");
		
		// isDisplayed method:
		boolean b1 = driver.findElement(By.id("next")).isDisplayed();
		System.out.println(b1);// true 
		
       // isEnable method()
		boolean b2 = driver.findElement(By.id("next")).isEnabled();
		System.out.println(b2);// false
		
		//
		driver.findElement(By.id("transcheck1")).click();
		boolean b3 = driver.findElement(By.id("next")).isEnabled();
		System.out.println(b3);// true
		
		
	}

}
