package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot3 {

	public static void main(String[] args) throws IOException {
		
// Screen Shot Practise.
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
// will delet all cookies before it run the browser.
		driver.manage().deleteAllCookies();
			
// will delet all cookies before it run the browser.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
// we clled the browser to open Facebook home page .		
		driver.get("https://www.facebook.com/"); 
		
// it will magzimize the windo.
		driver.manage().window().maximize();
		
// these three lines will help us to find the elemnst in FB home page baseon what web developer designed.		
		driver.findElement(By.id("email")).sendKeys("Abdullah.bawar26@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Omarbawar12");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
// Now below cmmonds will help us to take screen shot of FB home page.
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.file);
		
//Now below cmmond will help us to to copy the screen shot and past it in our desire location . 
//but before we copy we need to copy the locatore path. Shift+right click copy as path.
		FileUtils.copyFile(src,new File("C:/Users/Abdul/OneDrive/Desktop/Lyft Statments/facebook Login.png"));
		
		driver.close();

	}

}
