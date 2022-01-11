package TestNgSessions;

import org.testng.annotations.Test;

public class DisableTest {
	

	@Test()
	public void test1() {
		System.out.println("test1 --------");
	}

	@Test()
	public void test2() {
		System.out.println("test2 --------");
	}
	
	@Test(enabled=true)
	public void test3() {
		System.out.println("test3 --------");
	}
	
	@Test(enabled=false)
	public void atest4() {
		System.out.println("test4 --------");
	}
	
}
	


