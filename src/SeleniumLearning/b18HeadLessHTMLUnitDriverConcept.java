package SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class b18HeadLessHTMLUnitDriverConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/Abdul/OneDrive/Desktop/Selenium/chromedriver_win32/chromedriver.exe");
        
		// this option is also working.
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("window-size=1400,800");
//		option.addArguments("headless");
				
		
//		ChromeDriver driver=new ChromeDriver();
		
		 HtmlUnitDriver driver = new HtmlUnitDriver();// will get our result without launching the browser.
         // htmlUnitdriver is not available after Selenuim 3.x version. 
         // to use this concept we have to download HtmlUnitDriver jar file 
		
	     // advantage of HtmlUnitdriver.
		
         //1 testing is happening behind the scene --- no browser launched.
         //2 Very fats -- execution of test cases -- very fats performance of the script.
         //3 not suitable for Action class -- user actions --> mouse movement , double click, drag and drop.
         // its called ghost driver --> headless browser 
		
		//Headless browsers in the market
		
        //1 HtmlUnit Driver -- Java
		//2 PhantomJS  -- Java Script

		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
       driver.get("https://opensource-demo.orangehrmlive.com/");
       
       System.out.println(driver.getTitle());
       
       driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       driver.findElement(By.id("txtPassword")).sendKeys("admin123");
       driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
       
       Thread.sleep(3000);
       
       String title = driver.getTitle();
       
       System.out.println(title);
	}

}
