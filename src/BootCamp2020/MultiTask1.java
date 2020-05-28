package BootCamp2020;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTask1 {

	public static void main(String[] args) throws InterruptedException {
//Enter URL “http://testautomationpractice.blogspot.com/”and in the search button enter your name and click search button.
//Print out the total number of search results. Also click on every search result and open in a new window and in the end
//close them all with one command.
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		driver.get("http://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Bawar");
		driver.findElement(By.className("wikipedia-search-button")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='wikipedia-search-results']//a"));
		// I created this xpath and all search result come under ID //a.
		System.out.println("Total of search result is:"+ list.size());
		for(int i=0;i<list.size();i++)
			list.get(i).sendKeys(Keys.LEFT_CONTROL,Keys.ENTER);
		
		{
			driver.quit();
		}
			//System.out.println(list.get(i).getText()); here we can print all the search result names.
		
		
	}

}
