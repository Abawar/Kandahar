package SeleniumExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Select select = new Select(driver.findElement(By.name("birthday_day")));
		select.selectByVisibleText("8");
		
	}

}
