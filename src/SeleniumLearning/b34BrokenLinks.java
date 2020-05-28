package SeleniumLearning;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b34BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(5000);
		
		//capture of links from the page
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		
		// number of links in the page
		System.out.println(Links.size());
		
		//now we validate the how many links are broken by starting for loop.
		
		for(int i =0;i<Links.size();i++) {
			// by using href attribute we can get get URL of required link.
			WebElement element = Links.get(i);
			String url = element.getAttribute("href");
			
			URL Link = new URL(url);
			
			// create connection using url obj link
			HttpURLConnection httpconn = (HttpURLConnection) Link.openConnection();
			Thread.sleep(2000);
			// establish coonection
			httpconn.connect();
			
			int responde = httpconn.getResponseCode();// retun reposnse if its above 400: broken links
			
			if(responde>=400)
			{
				System.out.println(url + " is boreken links");
			}
			else
			{
				System.out.println(url+ "is valid link");
			}
		}
			
		

	}

}
