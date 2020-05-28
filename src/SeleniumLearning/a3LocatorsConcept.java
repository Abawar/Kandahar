package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3LocatorsConcept {

	public static void main(String[] args) {
         
		//tagname[@attribute= 'attribute value'] ==> creating customize Xpath.
		
		// we have 8 locators:
		// 1- Xpath. ===> means the address of the element, not recommend to use for links type element in HTML dom .
		     // we have to type of Xpath, Absolute Xpath which comes with hiricky address of element and 2nd type is relative xpath which give us exact address of the elemnst.
		   
		// 2- Id. ==> some time Id attributer is not avalible we have to use Xpath 
		// 3- name, 
		// 4- Linktext: ==> we can use for link type elements (sign in, logout ...) Xpath is not not recommend for links type elements. and (a) is the tag name for all lnik type elemnst
		// 5- PartialLikntext: use for long link text links, but it is not good to use 
        // 6- CSS selector:
		      // customize CSS selector, if id was available #{id attribute value}, if class was available .{class attribute vale}
		
		// 7- class Name: not recommended. 
		// 8- Tag name
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2Fn%2Ferror%3Fstatuscode%3D500");
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Omar");
		driver.findElement(By.id("firstname")).sendKeys("Omar");
		driver.findElement(By.name("firstname")).sendKeys("Omar");
		driver.findElement(By.linkText("User Agreement")).click();
		
		
		
		//    //a[contains(text(),('Linktext')]  ==> use for customizing xpath for link.
		

	}

}
