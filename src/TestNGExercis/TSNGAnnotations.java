package TestNGExercis;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TSNGAnnotations {
	
	
	@BeforeSuite
	public void setUp(){
	
		System.out.println("Set Up and set the property");
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launch the browser");
	}
	@BeforeClass
	public void enterURL() {
		System.out.println("Enter the URL");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Check login");
	}
	@Test
	public void testUsernameBox() {
		System.out.println("Username test");
	}
	@Test
	public void testPosswordBox() {
		System.out.println("Test password box");
	}
	@AfterMethod
	public void logOut() {
		System.out.println("Log out th application");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close the browser");
	}
	@AfterTest
	public void deleteAllcookes() {
		System.out.println("Delete all the cookies");
	}
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate test Report");
	}
}
