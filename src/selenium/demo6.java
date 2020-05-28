package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium\\chromedriver_win32/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
     
        driver.manage().window().maximize();
        //driver.manage().deleteAllCookies();
        
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
        
        String act_title= driver.getTitle();
        String exp_title= "OrangeHRM";
        
        if( act_title.equals(exp_title))
        	System.out.println("Test passed");
        else
        {
        	System.out.println("Test field");
        }
        
        Thread.sleep(5000);
        driver.close();
	}

}
