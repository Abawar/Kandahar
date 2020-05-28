package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Walmartdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//title
		//url
		//correct

		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.walmart.com/");
		String title =driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		
		if(title.equals("Walmart"))
		{
			System.out.println("Correct Titile");
		}
		else
		{
			System.out.println("In Correct title");
		}
	}
	

}
