package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/ChromeDriver.exe");
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
	driver.findElement(By.id("identifierId")).sendKeys("Abdullah.bawar26@gmail.com");
 
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
	}

}
