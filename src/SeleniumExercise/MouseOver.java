package SeleniumExercise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        
        driver.get("http://www.popuptest.com/popuptest4.html");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Mouseover PopUp')]")).click();
		
	    Set <String> handel = driver.getWindowHandles();
	   
	    Iterator <String> it = handel.iterator();
	  
	    String st = it.next();
	  
	    System.out.println("Parent ID"+st);
	  
	    String st1 = it.next();
	  
	    System.out.println("child windo id"+ st1);
	  
	    driver.switchTo().window(st);
	    Thread.sleep(4000);
	  
	    System.out.println("child windo id title"+ driver.getTitle());
	    Thread.sleep(4000);
	    driver.close();
		
		
		
		
		
		
	
		
		

	}

}
