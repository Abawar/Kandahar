package SeleniumExercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisableIsEnableIsSlect {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("http://sunilpatro1985.blogspot.com/p/demo_7.html");
		driver.manage().window().maximize(); 
		
		boolean bo1 = driver.findElement(By.id("next")).isDisplayed();
		System.out.println(bo1);
		
		boolean b2 = driver.findElement(By.id("next")).isEnabled();
		System.out.println(b2);
		
		//driver.findElement(By.id("transcheck1")).click();
		Thread.sleep(2000);
		boolean b3 = driver.findElement(By.id("next")).isEnabled();
		System.out.println(b3);
		
		boolean b4 =driver.findElement(By.id("transcheck1")).isSelected();
		System.out.println(b4);
	}

}
