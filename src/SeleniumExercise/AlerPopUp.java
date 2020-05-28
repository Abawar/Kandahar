package SeleniumExercise;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@type='submit'][@id='u_0_b']")).click();
	   driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if (text.equals("abdullah bawar")) {
			System.out.println("coorect msg");
		}
		else
		{
			System.out.println("incorect msg");
		}
		
		

	}

}
