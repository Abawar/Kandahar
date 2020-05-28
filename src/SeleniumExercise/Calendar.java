package SeleniumExercise;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		
        System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		//driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr[1]//td[1]"))
		
		
		
		String beforexp ="//table[@class='ui-datepicker-calendar']//tbody//tr[";
		String afterxp = "]//td[";
		
		boolean stp = true;
		for (int a = 1; a<=7; a++)
		{
			for (int b = 1; b <=7; b++)
			{

				String  days = driver.findElement(By.xpath(beforexp+a+afterxp+b+"]")).getText();
				System.out.println(days);
				
				if (days.equalsIgnoreCase("12"))
				{
					driver.findElement(By.xpath(beforexp+a+afterxp+b+"]")).click();	
				}
				stp = false;
				
			}
			stp = false;
		}
		
		
		}
}
		
		
		
	


