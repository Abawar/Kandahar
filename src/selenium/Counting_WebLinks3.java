package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Counting_WebLinks3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		
		List <WebElement> linksList = driver.findElementsByTagName("a");
		linksList.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Number of All Links in FB Home Page is :"+ linksList.size());
		
		for (WebElement ele:linksList)
		{
			System.out.println(ele.getText());
		}

	}

}
