package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

ChromeDriver driver=new ChromeDriver();

driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

driver.get("https://opensource-demo.orangehrmlive.com/");

driver.manage().window().maximize();

driver.findElement(By.id("txtUsername")).sendKeys("admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin12");
driver.findElement(By.id("btnLogin")).click();



File khan=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

FileUtils.copyFile(khan,new File("C:/Users/Abdul/OneDrive/Desktop/Lyft Statments/Screen Shot2.png"));

//FileUtils.copyFile(khan,new File("C:/Users/Abdul/OneDrive/Desktop/Lyft Statments/Screen Shot1.png"));

//File DestFile=new File("C:/Users/Abdul/OneDrive/Desktop/Lyft Statments/SCR");

//FileUtils.copyFilr(khan,new File(""));
//FileUtils.copyFile(src, DestFile);

System.out.println("Screen shot has bee taken");


	}

}
