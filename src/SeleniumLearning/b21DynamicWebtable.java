package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class b21DynamicWebtable {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://ui.freecrm.com/");
		
		
		driver.findElement(By.name("email")).sendKeys("Abdullah.bawar786@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Omarbawar12");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/a[3]")).click();
		Thread.sleep(3000);
		 
        //  below are each name xpath == tr means rwo and td means column .
		
//      //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2] ---> Hamid Khan
//      //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[2]/td[2] ---> Kachalo Khan
//      //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[2] ---> Omar Bawar --> by adding a new user Omar line Xpath chnaged -->   //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[2]
//      //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[4]/td[2] ---> Aziz Rahman Kandahar
//      //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[5]/td[2] ---> Abdullah Bawar
		
		//now we have methods call before xpath and after xpath.
		
		// Method -1
		
		String BeforeXpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String AfterXpath = "]/td[2]";
		
		for(int a = 1; a<=5;a++) {
			String Names = driver.findElement(By.xpath(BeforeXpath+a+AfterXpath)).getText();
			System.out.println(Names);
			
// my target is to select a specific name  Omar:   //*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[3]/td[1]
			
		if (Names.contains("Omar bawar")) {// changing the vale here we can mark the different name in the page 
				driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr["+a+"]/td[1]")).click();
		}}
	
	      // Method -2 	==> we have to use custome Xpath.
		

		
		driver.findElement(By.xpath("//*[contains(text(),'Karzay Marzay')]")).click();
		
		
	}}


