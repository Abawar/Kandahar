package SeleniumLearning;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;



public class b14TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	   // driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	   
		
		//driver.get("https://www.amazon.com/");
		
		//Take screen shot and store as a file format.
		
	   // File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// file need import from Java.io
		//FileUtils.copyFile(src,new File("C:/Users/Abdul/OneDrive/Desktop/for learning/Screenshot.png"));
		
		//File Bawar =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(Bawar, new File("C:/Users/Abdul/OneDrive/Desktop/Screenshot/AmazonScreenshot.png"));
		
	
		
		driver.get("https://www.vec.virginia.gov/");
		File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File("C:/Users/Abdul/OneDrive/Desktop/Screenshot/GoogleScreenshot.png"));
		
	
		
		Thread.sleep(3000);
		driver.close();
		
		
		
// we can create tow obj of the ChromeDriver class and run to different screen shot for different screenshots location. 		
	
// getScreenShot method==> can help us to take the shot.
		

	}

}
