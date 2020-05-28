package JavaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawingAroundTheElement {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	   
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement loginBtn = driver.findElement(By.name("Submit"));
		
		// Drawing the boarder and screenshot.
		DrawingAroundTheElement.drawBorder(loginBtn, driver);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/Users/Abdul/OneDrive/Desktop/Screenshot/OHM.png"));
		
		
	}
	
	
	
	public static void drawBorder(WebElement element, WebDriver driver ) {// either WebDriver or ChromeDriver both are working 
		JavascriptExecutor js =((JavascriptExecutor)driver);
		//js.executeScript("argument[0].style.border='3px solid red'", element);
	   js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
}
