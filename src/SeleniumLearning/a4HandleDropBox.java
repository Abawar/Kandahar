package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class a4HandleDropBox {

	public static void main(String[] args) {

// for hendlein dropbox we have create obj of select class.

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
        driver.get("https://www.facebook.com/");

		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jun");
		
	}

}
