package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
				    
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
					
					
		driver.navigate().to("https://www.walmart.com/");
		Thread.sleep(2000);
					
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.walmart.com/");
		Thread.sleep(2000);
					
		driver.navigate().to("https://www.google.com");
		Thread.sleep(2000);

		//driver.navigate().forward();
		//driver.navigate().refresh();

	}

}
