package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class b10ImplicitWait {

	public static void main(String[] args) throws InterruptedException {


		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			// dynamic wait
			driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);// for page loading 
			driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);// for page elements
			
			// Static wait.
			Thread.sleep(3000);

	}

}
