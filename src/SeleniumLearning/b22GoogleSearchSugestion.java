package SeleniumLearning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b22GoogleSearchSugestion {

	public static void main(String[] args) throws InterruptedException {


		
        System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.xpath("//input[@name='q']\"")).sendKeys("book");
		List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		
		System.out.println(list.size());// printing number of the suggestion box
		
		for(int i=0;i<list.size();i++) {   
			
			System.out.println(list.get(i).getText());
			
			if (list.get(i).getText().contains("booking"))
			{
				//System.out.println("booking suggestion : Booking");
				list.get(i).click();
			}
			
		}
		

	}

}
