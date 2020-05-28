package TestNG;

import org.testng.annotations.Test;

public class a3DependsOnMethodesFeature {
	
// we can write tesNG cases without befor and after methods as below.
	
	@Test
	public void loginTest() {
		System.out.println("Login test");
		
		//int i = 9/0; // here i made this to make fail the logon TC and will get the report 1 fail and 1 skip. 
	}
	@Test(dependsOnMethods="loginTest")// (dependsOnMethods="loginTest") means : our homaPage taset case depond to login test TC, if login TC got fail then home page TC will not executed
	public void homePageTest() {
		System.out.println("Home Page Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchTest() {
		System.out.println("Search box Test");
	}
	@Test(dependsOnMethods="loginTest")
	public void logOut() {
		System.out.println("Logout Test");
	}
	
}
