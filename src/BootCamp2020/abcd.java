package BootCamp2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class abcd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		
		driver.switchTo().frame("packageFrame");
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);

		driver.switchTo().frame("classFrame");
		Thread.sleep(3000);
		driver.findElement(By.className("navBarCell1Rev")).click();
		driver.switchTo().parentFrame();
		Thread.sleep(3000);

	}

}
