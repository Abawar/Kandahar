package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe2 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
        
        driver.switchTo().frame("iframeResult");
        
        driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Bawar");
        
        driver.switchTo().parentFrame();
        
        
        Thread.sleep(5000);
        driver.close();
        
	}

}
