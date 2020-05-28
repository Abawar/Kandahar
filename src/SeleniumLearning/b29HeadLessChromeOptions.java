package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class b29HeadLessChromeOptions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
        
//		HtmlUnitDriver driver = new HtmlUnitDriver();// i dont kow its y not working.
		
		//3 chrome head less, --> two options.
		// first option.
		ChromeOptions option = new ChromeOptions();
		option.addArguments("window-size=1400,800");// we have to customize window size like this.
		option.addArguments("headless");
		
		//4 option add to the below ChromeDriver();
		ChromeDriver driver=new ChromeDriver(option);

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
	    driver.get("https://ui.freecrm.com/");
		
	    //1 login page title.
	    String st = driver.getTitle();
	    System.out.println(st);
		
		driver.findElement(By.name("email")).sendKeys("Abdullah.bawar786@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Omarbawar12");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
        
		//2 Home page title.
		System.out.println(driver.getTitle());
	}

}
