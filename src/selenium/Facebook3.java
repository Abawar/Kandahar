package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook3 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
			
	ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		
	    String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook - Log In or Sign Up"))
		{
			System.out.println("coorect titile");
		}
		else
		{
			System.out.println("incorrect titile");
		}

	driver.quit();
	}

}
