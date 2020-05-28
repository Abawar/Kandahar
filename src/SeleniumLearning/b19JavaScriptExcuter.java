package SeleniumLearning;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b19JavaScriptExcuter {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    
	    driver.manage().timeouts().pageLoadTimeout(5000,TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
	   
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.name("Submit")).click();
		
// till here we login succefully, now i want commend out login button and want to highlight the login button.
// for highlighting we have to use JavaScriptexcuter out of main method as below.

		// JavaScriptexcuter is a class and we have to cast our driver to JavaScriptexcuter

	WebElement loginBtn = driver.findElement(By.name("Submit"));
///		flash(loginBtn, driver);
		
		// boarder and taking screenshot 
		drowBorder(loginBtn, driver);// called the boarder method
		File Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Screenshot, new File("C:/Users/Abdul/OneDrive/Desktop/Screenshot/GoogleScreenshot.png"));
		
		//Generate Alert
		//generateAlart(driver,"There is an issue with loagin Button in login page");
		
		//click on any element by using JS executer
		clickElementByJS(loginBtn,driver);
		
		// refresh the browser.
		  // 1 by selenuim method
		driver.navigate().refresh();
		
		  //2 by JS executer.
		refreshBrowserByJS(driver);
		
		// get the title by JS
		System.out.println(getTitleByJS(driver));
		
		// get the page text.
		System.out.println(getPageInnerText(driver));
		
		//scroll page down.
		 scrollPageDown(driver);
		 
		 //
		 
		 WebElement forgotPwdLink = driver.findElement(By.xpath(""));
		 scrollIntoView(forgotPwdLink,driver);
			
		
		
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		
	}
	
	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);	
		String bgcolor = element.getCssValue("backgroundColor");
				
				for(int a = 0; a<30;a++) {
					chnageColor("rgb(0,200,0)",element,driver);
					chnageColor(bgcolor, element,driver);
				}
	}

	public static void chnageColor(String color , WebElement element, WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try {
			Thread.sleep(20);
			
		}catch (InterruptedException e) {
			
	}
	}
	public static void drowBorder(WebElement element, WebDriver driver ) {// either WebDriver or ChromeDriver both are working 
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	
	public static void generateAlart(WebDriver driver, String message) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("alert('"+message+"')");
	}
	
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js =((JavascriptExecutor)driver);
		js.executeScript("argument[0].click();",element);
	}
	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver); 
		js.executeScript("history.go(0)");
	}
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver); 
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0,docuemnt.body.scrollHeight)");
	}
	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argument[0].scrollInToView(turn);",element);
	}
	}
