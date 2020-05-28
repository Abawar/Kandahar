package SeleniumLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class a5AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {


		//AlertPopUp or Pop up.
		// JAVA Script AlertPopUp or pop up we cant run with locators .
		// Alarts cant be spay .
		
		System.setProperty("webdriver.chrome.driver","C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click(); // here clicking go bot
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert(); 
		System.out.println(alert.getText());  
		
		String text = alert.getText(); // for validation of alert msg.
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("coorect msg");
		}
		else
		{
			System.out.println("incorrcet msg");
		}
		
		alert.accept();// accept the alert whatever we get.
		//alert.dismiss(); // if we have cancel option in alert want cancel use this method 

	}}

//24- by this method we can move from original windo to the pop windo{ Alrat is a class and we assign driver.switchTo().alert(); az refrence var} 
//25- this is provide us the alret text
