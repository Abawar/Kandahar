package SeleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b27BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(4000,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
        
        driver.get("https://v4-alpha.getbootstrap.com/components/dropdowns/");
        
        driver.findElement(By.xpath("//button[@type='button'][@id='dropdownMenuButton']")).click();
        
        List<WebElement> list = driver.findElements(By.xpath("//div[@class='dropdown-menu'][@aria-labelledby='dropdownMenuButton']//a"));
        System.out.println(list.size());
        
        for(int a = 0; a<list.size();a++)
        {
        	System.out.println(list.get(a).getText());
        	
        	if (list.get(a).getText().contains("Action"));
        	list.get(a).click();
        }
        
        // close the drop down button
       // Thread.sleep(5000);
      //  driver.findElement(By.xpath("//button[@type='button'][@id='dropdownMenuButton']")).click();
	}

}
