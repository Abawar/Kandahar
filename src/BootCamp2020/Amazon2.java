package BootCamp2020;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book");//"//div[contains(@id,'issDiv')]"));

		Thread.sleep(1000);
		List <WebElement> list= driver.findElements(By.cssSelector("//div[contains @id,'issDiv)]"));

		System.out.println("list of sugg"+ list.size());

		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText());
	}

	}
}
