package SeleniumLearning;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b26BootstrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
        // https://v4-alpha.getbootstrap.com/components/dropdowns/
		// Bootstrap Dropdown: it does't has select tag in html dom. 
		
		
		 System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().pageLoadTimeout(4000,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			
	        
	        driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	        
	        driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();// click on the box
	        List <WebElement>  list = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label"));// list of drop down
	        
	       // deselect the two elements. 
	        
	       
          driver.findElement(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label")).click();
	        
//	       System.out.println(list.size());
	        
//	       for(int a = 0; a<14;a++)
//	       {
//	       System.out.println(list.get(a).getText());
	        
//	        if(list.get(a).getText().equals("C#")) {
//	        list.get(a).click();
//  	    break;
//	          }}
	        
	        
//	        if want to select all the box
	        
            System.out.println(list.size());
	        
	        for(int a = 0; a<14;a++)
	        {
	        System.out.println(list.get(a).getText());
	        
	        	list.get(a).click();
	        } 
	        driver.findElement(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li//a//label")).click();
	}

}
