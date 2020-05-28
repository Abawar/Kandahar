package SeleniumLearning;

public class b11CustomizeXpath {

	public static void main(String[] args) {
		
		
       // tow type xpath, 1) absolute xpath, 2) relative xpath.
		
// 1) absolute xpath: is the address of an element in the HTML dom from top to donw, form parent to child . its not recommend to use , coz by changing an element location in dome our xpath also will chnage and we will not have a correct xpath to find that spesific elemnt.(herichy base xpath)
		
		//disadvantage of.
		//1 Performance issue
		//2 not reliable.
		//3 can be change any time in the feature.
		
// 2) relative xpath: call on dote xpath which will give u exact address of the element even element location  change in the dome.
		
	  // Customize xpath ==>
// HTML-Tag[@attribute ='attribute value']
// HTML Tag[contains(@ attribute,'attribute value')] ==> powerful 
		
		// dynamic id.
// id = test_123
// id = test_678
// id = test_634 ==> id attribute value will getting change by refreshing the page , than we have to use contains function as below.
		
// Contains ==>   //input[contains(@id,test_')]"))
// Start-with method ==> //input[start-with(@id,test_')]"))
		
		// if id was as bellow.
		
// id = 123_test_t.
// id = 345_test_t.
// id = 875_test_t
		
// in above we can not use with-start method, we have method thats call end with
		
		//HTML Tag[ends-with(@id,'_test_t')]

// we have use start-with or ends-with when id has dynamic number in contain, so we ixclude the number and copy and pest teh test what ever it start with.	


		
//		xpath for links
		
// all links in HTML dome represent by (a) mens their tag is a.
		
		//HTML Tag[contains(text(),'text of that particular element')]
		
		//==> //a[contains(text(),'My Account')]
		
		
		//input[contains(id@,'anything')]
		//input[@id='anything']
		
		
		//input[contains(@id,'anything')]
		//input[@id='anything')]
		//input[start_with(@id,'anything')]
		//input[ends_with(@id,'anything')]
		//a[contains(text(),'anything')]
		
	}
	
	

}
