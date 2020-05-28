package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
         
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://translate.google.com/#view=home&op=translate&sl=en&tl=fa&text=inner");
		driver.manage().window().maximize();
		
		//WebElement profile = driver.findElement(By.id("btnMenuProfile"));
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/Users/Abdul/OneDrive/Desktop/Screenshot/google.png"));
	}

}
