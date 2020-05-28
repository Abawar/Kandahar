package TestNG;

import org.testng.annotations.Test;

public class a4InvocationCountTestTNG {
	
	@Test(invocationCount=10)// will help to execute same test case 10 or more tims.and avoid us to write 10 time test cases
	public void sum() {
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}

}
