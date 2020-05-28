package SeleniumLearning;

public class B25CustomExpath {

	public static void main(String[] args) {
		
//1-   //tagname[@attribute='attibuteValue'] --> //input[name='username']  use for elements have id,name,class...
		
//2-   //tagname[@attribute='attibuteValue'and @2attribute='2attributeValue'] ==> if we want make more strong custom xpath
		
//3-   //a[text()='any text available in the ele or link'] ==> //a[text()='Features'] --> we use this method for links and elements dos't has id,name,class.
		
//4-   //a[contains(text(),'any text available in the ele or link'] ==> //a[contains(text(),'Features'] --> 3-4 both r the same only their different structure 
		
//5-   //div[@attribute='value']//button[@attribute='value' and @attribute='value'...]
		
//6-   // a[text()='value']//parent::td[@attribute='value']//preceding-sibling::td[@attribute='value']//input[@attribute='value']

}}
