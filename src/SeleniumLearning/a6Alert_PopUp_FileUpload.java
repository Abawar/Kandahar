package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class a6Alert_PopUp_FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//Abdul//OneDrive//Desktop//Selenium//chromedriver_win32/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        
        driver.get("https://html.com/input-type-file/");
        
        driver.findElement(By.id("fileupload")).sendKeys("C://Users//Abdul//OneDrive//Desktop//What is collection in Java.docx");
        
        // first we have to spy the Brwose , attcahed or upload elemnst tahn we have to put the file path in the send key method.
        
        // type="file" should be available for broeser/attached/upload file buttons in the html dom.
	}

}
