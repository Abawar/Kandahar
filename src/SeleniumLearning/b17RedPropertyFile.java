package SeleniumLearning;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b17RedPropertyFile {
	
	static ChromeDriver driver;

	public static void main(String[] args) throws IOException {
		
		
// first we have create the Java class (properties) obj.
		
		Properties prop = new Properties();
		
// now we have create FileInputStream class obj and import from Java and then copy the location of config.proprty location and pest it in Obj to read the config.property file data.
		
		FileInputStream ip = new FileInputStream("C:/Users/Abdul/eclipse-workspace/GreatSelenium/src/SeleniumLearning/config.properties");// this is also Java class 
        
// now we want load file data : we can load by obj of Properties below method.
		
		prop.load(ip);
		
// now we can read the data in config.properties.
		
		System.out.println(prop.getProperty("name"));// we have put the key here as we wrretin in the file , miss spleeing, upper and lower case senstive.
		System.out.println(prop.getProperty("age"));// we can disable the key by # file properties.
		
// we can get the property as below too.
		
	     String url = prop.getProperty("URL");
	           System.out.println(url);
	          
	   String browser =  prop.getProperty("browser"); 
	   
	           System.out.println(browser);
	           
// Condition.
	           
	           if(browser.equals("chrome")) {
	        	   System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
	   		    
	   		   ChromeDriver driver = new ChromeDriver();// launch chrome
	   		    
	   		    driver.manage().window().maximize();
	   		    
	   		// now we get the url in the browser;	   		    
	   		    
	   		    driver.get(url);
	           }

		
	}

}
