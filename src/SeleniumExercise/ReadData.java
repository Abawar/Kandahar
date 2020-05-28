package SeleniumExercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		Properties pro = new Properties();
		
		FileInputStream fil = new FileInputStream("C://Users//Abdul//eclipse-workspace//GreatSelenium//src//SeleniumExercise//test.properties");
        
		pro.load(fil);
		
	    String url = pro.getProperty("URL");
	    System.out.println(url);
		
		
	    String browser =pro.getProperty("browser");
		
		if(browser.equals(browser)) {
			   System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
	   		    
	   		   ChromeDriver driver = new ChromeDriver();
	   		   
	   		   
	   		   driver.get(url);
	   		   
	   		   driver.findElement(By.xpath(pro.getProperty("userNameXP"))).sendKeys(pro.getProperty("userName"));
	   		   
	   		   driver.findElement(By.id(pro.getProperty("posswordXP"))).sendKeys(pro.getProperty("password"));
	   		   driver.findElement(By.xpath(pro.getProperty("loginXP"))).click();
	   		   
	   		   driver.manage().window().maximize();
	   		   Thread.sleep(5000);
	   		   //driver.close();
	   		   
	   		   List<WebElement> LinksList = driver.findElements(By.tagName("a"));
	   		   Thread.sleep(3000);
	   		   System.out.println(LinksList.size());
	   		   int r =LinksList.size();
	   		   
	   		   for(int a = 0; a<r;a++)
	   		   {
	   			   System.out.println(a);
	   		   }
	   		
		}
	}

}
