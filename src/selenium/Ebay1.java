package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay1 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//String title= driver.getTitle();
		//System.out.println(title);
		//driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a")).click();
		//driver.findElement(By.name("firstname")).sendKeys("Abdullah");
		driver.findElement(By.name("firstname")).sendKeys("Abdullah");
		driver.findElement(By.xpath("//*[@id=\"u_0_o\"]")).sendKeys("Bawar");
		driver.findElement(By.name("reg_email__")).sendKeys("4342273066");
		driver.findElement(By.linkText("Forgot account?")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}
	

}
