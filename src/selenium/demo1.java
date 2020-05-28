package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

/*1) open web browser
 * 2) open URL https://www.google.com/
 * 3)
 * 
 * 
 */

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 open web browser
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver(); // launch the chrome browser 
		
		//driver.get("https://www.Google.com/");
		
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		//String title = driver.getTitle();
		 //System.out.println(title);
		
		//String title2 = driver.getTitle();
		//System.out.println(title2);
		
	//	System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		if(title.equals("Gogle"))
		{
			System.out.println("Correct Title");
		}
		
		else
		{
			System.out.println("In Correct Title");
		}
		 
		
		driver.close();
		driver.quit();
		
	}

}
