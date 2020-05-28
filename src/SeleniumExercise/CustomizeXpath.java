package SeleniumExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("gb_70")).click();
		
		
		//    name="70987_gb_"
		//    name ="gb_689"
		
		//input["ends-with(@name='gb_')"][kljkhgfghjkl]
		
		

	}

}
