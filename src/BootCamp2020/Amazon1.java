package BootCamp2020;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazon1 {

	public static void main(String[] args) throws InterruptedException {
		
//Set Up:
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium\\chromedriver_win32/chromedriver.exe");
ChromeDriver driver =new ChromeDriver();

driver.manage().timeouts().pageLoadTimeout(3000,TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver.manage().window().maximize();

//Part 1 ●	Log In.
driver.get("https://www.amazon.com/");
driver.findElement(By.linkText("Sign in")).click();// Log In

//Prt 2 ●	Browse the products and use the shopping cart to check out.
driver.navigate();
Thread.sleep(3000);
driver.get("https://www.amazon.com/");
driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();

//Part 3 ●	Search Items and verify items.

driver.navigate();
Thread.sleep(3000);
driver.get("https://www.amazon.com/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();

//Part 4  ●	Verify autosuggestion.
driver.navigate();
Thread.sleep(3000);
driver.get("https://www.amazon.com/");
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("book");
Thread.sleep(1000);
List <WebElement> list= driver.findElements(By.xpath("//div[contains(@id,'issDiv')]"));

System.out.println("list of suggestiond are:"+ list.size());

for(int i=0;i<list.size();i++)
{
	System.out.println(list.get(i).getText());
}
//Part 5 ●	Navigate to the products.
driver.get("https://www.amazon.com/");
driver.findElement(By.xpath("//img[@class='product-image']")).click();
Thread.sleep(1000);

driver.navigate().to("https://www.amazon.com/");
driver.findElement(By.xpath("//img[@class='product-image']")).click();
Thread.sleep(1000);

driver.navigate().to("https://www.amazon.com/");

Thread.sleep(3000);
driver.close();
	}}


