package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
		    
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();

driver.findElement(By.id("txtUsername")).sendKeys("admin");
driver.findElement(By.id("txtPassword")).sendKeys("Admin12");
driver.findElement(By.id("btnLogin")).click();

//take a screen shot and store as file forma
    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

//now copy the screen shot.
    
    
FileUtils.copyFile(src,new File("C:/Users/Abdul/OneDrive/Desktop/Lyft Statments/HRM_Login1.png"));

driver.close();

//TakesScreenshot scrShot=((TakesScreenshot)driver);

//File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

//String fileWithPath = "\"C:\\Users\\Abdul\\OneDrive\\Desktop\\Lyft Statments\";
//File DestFile=new File(fileWithPath);
//FileUtils.copyURLToFile("shot", "\"C:\\Users\\Abdul\\OneDrive\\Desktop\\Lyft Statments\"");
	}

}
