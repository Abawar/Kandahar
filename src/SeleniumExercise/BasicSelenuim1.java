package SeleniumExercise;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelenuim1 {

	public static void main(String[] args) throws InterruptedException {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium/chromedriver.exe");
    
    ChromeDriver driver = new ChromeDriver();
    
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    
   String title = driver.getTitle();
   
   System.out.println(title);
   
   if(title.equals("google")) {
	   System.out.println("correct title");
   }
   else
   {
	   System.out.println("incorrect title");
   }
   
   System.out.println(driver.getCurrentUrl());
   
   System.out.println(driver.getPageSource());
   
   
   Thread.sleep(5000);
   driver.close();

	}

}
