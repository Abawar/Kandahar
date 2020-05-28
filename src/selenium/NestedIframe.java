package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			
			driver.get("http://demo.automationtesting.in/Frames.html");
			
			driver.manage().window().maximize();
			
			driver.switchTo().frame(0);
			
			driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
			
			//WebElement outerframe=driver.findElement(By.xpath("//*[@id="singleframe"]"));
			//

	}

}
