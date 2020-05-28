package BootCamp2020;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingOfActiveLinks1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		
		List <WebElement> linksList= driver.findElements(By.tagName("a"));//obj for finding all links in home page of FB.
	    linksList.addAll(driver.findElements(By.tagName("img")));// will count all links and im
	    System.out.println("Totle number of links including img is:"+linksList.size());
	    
	    List<WebElement> activeLinks=new ArrayList<WebElement>();
	    for(int i=0;i<linksList.size();i++){
	    
	    	if(linksList.get(i).getAttribute("href")!=null){
	    	
	    		activeLinks.add(linksList.get(i));
	    	}
	    }
	    		System.out.println("href"+activeLinks.size());
	    	}
	    

	//for (WebElement ele:linksList)
	
		//System.out.println(ele.getText());
	

}

