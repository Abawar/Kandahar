package SeleniumExercise;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
       driver.get("https://www.walmart.com/");
       
   //    List <WebElement> Links = driver.findElements(By.tagName("a"));
       
     //  System.out.println(Links.size());
       
      // for( int a = 0; a<Links.size(); a++) {
    	//   String st = Links.get(a).getText();
    	   
    	 //  System.out.println(st);
       
       
       List<WebElement> tagList = driver.findElements(By.tagName("input"));
       
       System.out.println(tagList.size());
       
       for(int b = 0;b<tagList.size();b++) {
    	   
    	String Str = tagList.get(b).getText();
    	
    	System.out.println(Str);
       }
	}

}
