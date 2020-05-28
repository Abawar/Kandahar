package SeleniumLearning;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class b16BrowserWindowPopUp {

	public static void main(String[] args) throws InterruptedException {
	
// Window Pop Up ==> whenever we want switch from one window to another we have to find window ID. by window ID we can move from parent window to the child.
// to get the windows id we have a  method Windohandler in selenuim.
// (for loop) we using in array and arrayList coz the value there are start from index 0 1 2 3 ...
// Iterator we use for the values those r not store base on numeric like 0 1 2 3 ... and Set obj is not storing the values base on 0 1 2 3 so this is y we r using Iterator.
		
		// 1- alert --- javaScript pop up -->Alert API(accept, dismiss)
		// 2- File Upload Pop Up --> Browse/attached,Upload button. --> it has to have: type ="file" use snedKys(file path)
		// 3- Browser Window Pop up --> use ( windowhandle API - getWindowHandles();
		
	   System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
	    
	   ChromeDriver driver = new ChromeDriver();
	    
	   driver.get("http://www.popuptest.com/popuptest4.html");
	    
	   driver.findElement(By.xpath("//a[contains(text(),'Mouseover PopUp')]")).click();// after clicking we got two windows, parent and child
	   Thread.sleep(5000);
	    
	   // get windows ID: ---> driver.getWindowHandles()
	    
	   Set<String> handler = driver.getWindowHandles();// Set obj is Java class , Set is not store the values base on indexes from 0 1 2... so we can't use for loop now we can use iterator here.
	   
	   Iterator <String> t =  handler.iterator();// Iterator is Java class . we we use itreor method it returns Itretor class (we have to put in Itertor claas) to  and we use to get the Set class values which they r not store base on index to start from 0 1 2 3.
	    
	   String parentWindoValue = t.next();
	   
	   System.out.println("parent windo ID"+ parentWindoValue);
	   
	   String childWindoId = t.next();
	   
	   System.out.println("Child windo"+childWindoId);
	   
	   driver.switchTo().window(childWindoId);
	   Thread.sleep(5000);
	   
	   System.out.println("child windo pop up titl"+ driver.getTitle());
	   driver.close();
	   
	   driver.switchTo().window(parentWindoValue);
	   Thread.sleep(5000);
	   
	   System.out.println("Parent windo title"+ driver.getTitle());
	    
	   driver.close(); 
// 
	    
	}}
	    

