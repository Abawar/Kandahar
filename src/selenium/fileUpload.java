package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			driver.get("https://html.com/input-type-file/");
			
			driver.manage().window().maximize();
			
			List <WebElement> Links=driver.findElements(By.tagName("a"));// a is the link tag name in HTML.
			
			System.out.println(Links.size());
			
			for(WebElement e:Links)
			{
				System.out.println(e.getText());
			}
			driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\Abdul\\OneDrive\\Desktop\\Abdullah Bawar Resume.doc");// file path.

	}

}
