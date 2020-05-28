package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();//we created an object of ChromeDriver. which the ChromeDriver class alreay abalible in selenime liabrary.
		                                       //  we will be able to see only a blank chrome browser wiht no data. 
		driver.get("http://www.google.com"); // we oppned google main page.
         String title=driver.getTitle();
         
         System.out.println(title);
         
         if(title.equals("Google"))
         {
        	 System.out.println("correct title");
         }
         else
         {
        	 System.out.println("incorrectt title");
         }
         System.out.println(driver.getCurrentUrl());
         driver.quit();
	}
}




