package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("email")).sendKeys("Abdullah.bawar@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("danabawar1");
		driver.findElement(By.xpath("//form[@id='login_form']/table/tbody/tr[2]/td[3]/label")).click();
		
		String title =driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Facebook"))
				{
                   System.out.println("Correct Title");
                   
				}
		else
		{
			System.out.println("Incorrect Title");
		}

		driver.quit();
		
		
	}

}
