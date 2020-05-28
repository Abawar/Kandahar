package SeleniumExercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedPropertyFil17 {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prp = new Properties();
		
		FileInputStream file = new FileInputStream("C://Users//Abdul//eclipse-workspace//GreatSelenium//src//SeleniumExercise/hrmproject.properties");
		prp.load(file);
		
		String crm = prp.getProperty("Browser");
		String url = prp.getProperty("URL");
		if (crm.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium/chromedriver.exe");
			 driver = new ChromeDriver(); 
		}
		
		driver.get(url);
		
		driver.findElement(By.xpath(prp.getProperty("UserNameXP"))).sendKeys(prp.getProperty("UserName"));
		driver.findElement(By.xpath(prp.getProperty("PasswordXP"))).sendKeys(prp.getProperty("Password"));
		driver.findElement(By.xpath(prp.getProperty("Login"))).click();
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
