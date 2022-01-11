package Dec2021SeleniumSessions.SeleniumSessions;

public class CustomXpath {

	public static void main(String[] args) {
		
		//xpath --> address of the element in DOM
		//XML Path in DOM
		
		//1.absoulte  ----//html/body/div/div[2]/ui/li/span
		//2.relative
		// xpath ===== //htmltagName[@attribute='value']
		
		//single property
		//input[@name='username']
		//input[@name='password']
		
		//multiple property
		//htmltagName[@prop='value' and @prop='value2']
		//input[@name='username' and @type='text']
		//input[@name='password' and @type='password']
		
		//not compulsory prop should be associated with value
		//input[@name and @type]
		
		//indexing
		//    (//input[@name and @type])[2]
		//     (//input[@name])[2]
		
		
		//form[@id='loginForm']
		
		//input[@placeholder='Username']
		
		//position 
		///       (//input[@name and @type])[position()=1]
		
		
		//child
		//div/form
		//div/form[@id='loginForm']
		
		//text -- for links,span,label
		//htmlTag[text()='value']
				
		//a[text()='Sign Up']
		
		//starts-with()
		////input[starts-with(@name,'pass')]
				
		
		//contains
		//tag[contains(@id,'name')]
		//input[contains(@name,'word')]
		
		//last()
		//  (//ul[@class='nav navbar-nav navbar-right']/li)[last()]
		
		//following --Selects all elements in the document of the current node( ) 
		//div[@class='input-group']/input//following::input
		
		//ancestor - The ancestor axis selects all ancestors element (grandparent, parent, etc.) of the current node
		//input[@type='text']//ancestor::div[1]
		
		//preceding - Select all nodes that come before the current node
		
		//input[@type='text']//preceding::div
		
		//following -sibling
		//input[@type='text']//following-sibling::input
		
		
		//parent
		//input[@type='text']//parent::div
		
		//css selector 
		
		//id ------> #id or htmltag#id
		//class -----> .classname or htmltag.name
		
		//          input[id*='user'] ======contains
		//          input[id^='user'] ========starts with
		//          input[id$='name']==========ends with

	}

}
