package SeleniumExercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggestion {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://www.google.com");
			
			driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> list =	driver.findElements(By.xpath("//ul[@role='listbox']// li/descendant::div[@class='sbl1']"));
         System.out.println(list.size());
         
         
	}

}
