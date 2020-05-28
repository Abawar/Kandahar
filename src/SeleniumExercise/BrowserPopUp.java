package SeleniumExercise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		    
		   ChromeDriver driver = new ChromeDriver();
		    
		   driver.get("http://www.popuptest.com/popuptest4.html");
		   
		   driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/b/font/b/a")).click();
		    
		   Thread.sleep(4000);
		   
		      Set <String> st  = driver.getWindowHandles();
	
		      Iterator<String> it = st.iterator();
		    		       
		       String win1 = it.next();
		      
		      System.out.println("first windo ID" + win1);
		      
		      System.out.println("first windo title" + driver.getTitle());
		      
		     String win2 = it.next();
		     
		     System.out.println("windo2 id is"+ win2);
		     
		     System.out.println("win2 title is" + driver.getTitle());
		     
		     driver.switchTo().window(win2);
		     driver.close();
		     
		     Thread.sleep(4000);
		     
		     driver.switchTo().window(win1);
		     driver.close();
		     
		  
		      
		      
		       
		       

	}

}
