package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handel_DropBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
 
 ChromeDriver driver=new ChromeDriver();
 
 driver.get("https://www.facebook.com/");
 
 Select month=new Select(driver.findElement(By.id("month")));
  month.selectByVisibleText("Apr");
 
 Select day=new Select(driver.findElement(By.name("birthday_day")));
 day.selectByValue("7");
 
 Select Year=new Select(driver.findElement(By.id("year")));
 Year.selectByVisibleText("1983");
 
 driver.findElement(By.name("//input[@type='radio'][@name='sex']")).click();
 
 //Select gender=new Select(driver.findElement(By.xpath("//label[text()='Male']")));////label[text()='Male']
 //gender.selectByValue("Male");
 
 driver.close();
 
 
 
 
	}

}
