package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Slectore_FB {

	public static void main(String[] args) {
		
		// CSS Selector.
		
// 1) Tag and ID, 2) Tag and Class, 3) Tag and attribute, 4) Tag , Class and attribute.
	
			
        System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	   //driver.findElement(By.cssSelector("input#email")).sendKeys("AbdullahBawar");  Tag and ID
	  //driver.findElement(By.cssSelector("input.inputtext")).sendKeys("Abdullah Bawar"); Tag and Class
     //driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("Abdullah Bawar"); Tag and Attribute.
	//driver.findElement(By.cssSelector("input.inputtext[name=\"email\"]")).sendKeys("Abdullah Bawar"); Tag, Class and attribute. 
   //driver.findElement(By.cssSelector("input.inputtext[name=\"pass\"]")).sendKeys("Abdullah Bawar"); Tag, Class and attribute.
		
		//String title = driver.getTitle();
		//System.out.println(title);
		 
		String title=driver.getTitle();
		System.out.println(title);
		
		
		{
			
		}
	}

}
