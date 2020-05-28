package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class b23CalanderHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ui.freecrm.com/");
		
		
		driver.findElement(By.name("email")).sendKeys("Abdullah.bawar786@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Omarbawar12");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[2]")).click();
		
		String date1 = "18-May-2020"; // Randomly i select this date.
		
		String dateArry[] = date1.split("-"); // date,split will splite the data by hiphen like (-) and it will gives us a String array.
        String day = dateArry[0];
        String month = dateArry[1];
        String year = dateArry[2];
        
        Select select1 = new Select(driver.findElement(By.xpath(""))); // Select method will help us for drop and down month and year in the calander
        
        //html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]
        
        String beforeXpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[";
        String afterXpath = "]/div[";
        
      // final int totalWeekDays = 7;
        for(int rowNum = 2; rowNum<=7;rowNum++) {
        	for(int colNumb = 1;colNumb<=7;colNumb++) {
        		String days = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNumb+"]")).getText();
        		System.out.println(days);
        	}
        }
        
	}

}
