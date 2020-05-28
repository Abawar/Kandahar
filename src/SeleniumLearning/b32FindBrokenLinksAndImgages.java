package SeleniumLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class b32FindBrokenLinksAndImgages {

	public static void main(String[] args) {
		// Links associtaed with a tage and image with img. 
		// each link has href attribute which refred by the spesifc link as property and developer redirecr theat link  for a new url.
		// need to check the href property is correct or not.
		
		//Links --> //ahref<https://www.google.com>
		//img --> //img<https://www.test.com>

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abdul\\OneDrive\\Desktop\\Selenium\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		//1
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		linkList.addAll(driver.findElements(By.tagName("img")));// all links and imgs are store in linkList Obj.
		System.out.println(linkList.size());// list of all links
		// there are links or img they may dont have href , but we here we just want check the links those r have href and check the href property is correct or not.now we create an active link list
		List<WebElement> activeLinks = new ArrayList<WebElement>();
		
		//2 iterate LinkList: execute all the links/imges doest have any href attribute.
		
		for(int a = 0; a<linkList.size();a++) {
			if(linkList.get(a).getAttribute("href")!=null) {
				activeLinks.add(linkList.get(a));
			}
		}
		System.out.println(activeLinks.size());// list of all active links
		
		//3 check the href url, with hhtpconnection api:
	}

}
