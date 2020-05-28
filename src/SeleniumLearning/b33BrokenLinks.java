package SeleniumLearning;

import java.io.IOException;
import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.protocol.HTTP;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b33BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		// now we validet the how many links are broken.
		for(int a = 0;a<links.size();a++) {
			
			// by using href attribute we can get get URL of required link.
			WebElement element =links.get(a);
			String url = element.getAttribute("href");
			
			// use URL class.
			URL link=new URL(url);
			// HTTPURL class.
			// create a connection using url objet link
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			Thread.sleep(3000);
			httpconn.connect();
			
			int respondeCode = httpconn.getResponseCode();// retun reposnse if its above 400: broken links
			if(respondeCode>=400) {
				System.out.println(url + "is a broken link");
			}
			else
			{
				System.out.println(url+ "is not broken link ");
			}
		}

	}

}
