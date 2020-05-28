package BootCamp2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.get("http://newtours.demoaut.com/");
		
		 driver.findElement(By.name("userName")).sendKeys("mercury");
		 driver.findElement(By.name("password")).sendKeys("mercury");
		 driver.findElement(By.xpath("//*[@name='login']")).click();
	
		
	

	}

}
