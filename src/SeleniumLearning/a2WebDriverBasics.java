package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class a2WebDriverBasics {

	public static void main(String[] args) throws InterruptedException {

     // launching the google.com
	// geckodriver is a class in selenium which will helpe us to launch the bfirfox broweser. 
	// also we have to download Firebug and FirePathe whenever we using Firefox
	
	//	System.setProperty("webdriver.gecko.driver", value)
	//	WebDriver driver = new FirefoxDriver();// FirefoxDriver is a class and {new FirefoxDriver();} is the class obj, WebDriver driver is interface 
		
    System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
    
    ChromeDriver driver = new ChromeDriver();
    
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    
   String title = driver.getTitle();// will helpe us with the applcation ,
   System.out.println(title);
  
   // Validation point ==> verify the title.
   
   if (title.equals("Google")) {
	   System.out.println("correct title");
   }
   else
   {
	   System.out.println("incorrect title");
   }
   
   System.out.println(driver.getCurrentUrl());
   
   System.out.println(driver.getPageSource());
    
    Thread.sleep(4000);
    
    driver.quit();
    
    
	}

}
