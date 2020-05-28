package BootCamp2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFromOuterFrame1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

		driver.get("http://demo.automationtesting.in/Frames.html");
				
		driver.manage().window().maximize();
		
		driver.switchTo().frame("SingleFrame");
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Abdullah Bawar");
		Thread.sleep(5000);
		
		driver.close();

	}

}
