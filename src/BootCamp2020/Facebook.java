package BootCamp2020;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][@name='firstname'][@class='inputtext _58mg _5dba _2ph-']")).sendKeys("fake");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][@name='lastname']")).sendKeys("ID");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("4342289066");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password'][@name='reg_passwd__']")).sendKeys("Omarbawar12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Apr");
		Thread.sleep(1000);
		driver.findElement(By.name("birthday_day")).sendKeys("8");
		Thread.sleep(1000);
		driver.findElement(By.id("year")).sendKeys("1983");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
