package BootCamp2020;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class google_autosuestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("book");
		List<WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
        System.out.println("Totle numbe of suggestions in search boz:::===>"+list.size());
        
        Thread.sleep(3000);
        for(int a = 0; a<list.size();a++) {
        	System.out.println(list.get(a).getText());
       
        	
        	if(list.get(a).getText().contains("booking")) {
        		list.get(a).click();
        		
        	}
        }
        
       
        
        
        
        
	}

}
