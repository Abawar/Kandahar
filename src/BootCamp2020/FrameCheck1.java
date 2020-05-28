package BootCamp2020;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 


public class FrameCheck1 {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html");
		
driver.manage().window().maximize();
		
driver.switchTo().frame("packageListFrame");
List <WebElement> Links1=driver.findElements(By.tagName("a"));
System.out.println("Number of Packages are:" +Links1.size());
		
driver.switchTo().defaultContent();
		
driver.switchTo().frame("packageFrame");
List <WebElement> Links2=driver.findElements(By.tagName("a"));
System.out.println("Number of classes are:"+ Links2.size());
		
driver.switchTo().defaultContent();
		
driver.switchTo().frame("classFrame");
List <WebElement> Links3=driver.findElements(By.tagName("a"));
System.out.println("Number of classes are:"+ Links3.size());
		
driver.findElement(By.xpath("//a[text()='Tree']")).click();
List <WebElement> Links4=driver.findElements(By.xpath("//div[@class='header']//li//a"));
List <WebElement> Links5=driver.findElements(By.xpath("//span[@class='typeNameLink']"));
System.out.println("Number of links"+ Links4.size()+Links5.size());}}


