package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// jan
		
		System.setProperty("webdriver.chrome.driver","C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
        
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		String text=alert.getText();
		
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("Correct MSG");
		}
		else
		{
			System.out.println("Incorect MSG");
		}
		
		driver.findElement(By.name("name")).sendKeys("arg0");
	}

}
