package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_Web_Elements2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		List <WebElement> Links=driver.findElements(By.tagName("a"));
		
	System.out.println(Links.size());
	
	for(WebElement e:Links) // if we want to know the links name we have to use this cmmond.
	{
		System.out.println(e.getText());
	}
		
		

	}

}
