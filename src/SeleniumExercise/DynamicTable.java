package SeleniumExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		    System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://ui.freecrm.com/");
			
			
			driver.findElement(By.name("email")).sendKeys("Abdullah.bawar786@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Omarbawar12");
			driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]")).click();
			Thread.sleep(3000);
			// //table[@class='ui celled sortable striped table custom-grid table-scroll']//tbody//tr[2]//td[2]
			//driver.findElement(By.xpath("//*[contains(text(),'Najeeb Jan')]")).click();
			
			//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[3]/td[2]")).click();
			
			WebElement Tab = driver.findElement(By.className("ui celled sortable striped table custom-grid table-scroll"));
			
			int row = driver.findElements(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']//tbody//tr[")).size();
			//int colum = driver.findElements(By.xpath("]//td[2]")).size();
			
			for (int a = 0; a<row; a++ )
			{
				String fullxp =driver.findElement(By.xpath("//table[@class='ui celled sortable striped table custom-grid table-scroll']//tbody//tr["+a+"]//td[2]")).getText();
				
				System.out.println(fullxp);
			}
			
			
			
			
			
			
			
			
	}

}
