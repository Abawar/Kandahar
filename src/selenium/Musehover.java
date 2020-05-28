package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Musehover {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
Thread.sleep(2000);
		
		//Admine --> Usermanagement --> User
		
		
		//driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		//driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		
//Mouse Hover

WebElement Admin=driver.findElement(By.xpath("//*[@id=\\\"menu_admin_viewAdminModule\\\"]/b"));
WebElement UserManagement=driver.findElement(By.xpath("//*[@id=\\\"menu_admin_UserManagement\\\"]"));
WebElement Users=driver.findElement(By.xpath("//*[@id=\\\"menu_admin_viewSystemUsers\\\"]"));

Actions act=new Actions(driver);
act.moveToElement(Admin).moveToElement(UserManagement).moveToElement(Users).click().build().perform();


	}

}
