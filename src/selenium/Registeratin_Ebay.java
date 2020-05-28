package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registeratin_Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		 
		 ChromeDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 driver.findElement(By.partialLinkText("Forgot account?")).click();

	}

}
