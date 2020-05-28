package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.Facebook.com");
		
		String title="Facebook";
		driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook"))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("incorrect title");
		}
		driver.quit();
	}

}
