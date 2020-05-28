package TestNG;

import org.testng.annotations.Test;

public class a5ExpectedEceptionsTNG {
	
	
	
	@Test(expectedExceptions=NumberFormatException.class)// without this feature our test case get fail and wen we use this feature our test case passed 
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}

}
