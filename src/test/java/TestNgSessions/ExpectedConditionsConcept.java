package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedConditionsConcept {
	
	@Test(expectedExceptions = ArithmeticException.class )
	public void divTest() {
		int a = 9/0;
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
		System.out.println(20);
	}

}
