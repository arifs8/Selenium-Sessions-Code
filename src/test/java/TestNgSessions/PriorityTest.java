package TestNgSessions;

import org.testng.annotations.Test;

public class PriorityTest {
	
	//can i give zero priority -- yes 
	//can i give negative priority ---highest priority
	//can i give same priority -- alpabetical order
	//non prioiry and priority ---non  priority first
	
	@Test(priority =1)
	public void test1() {
		System.out.println("test1 --------");
	}

	@Test(priority =2)
	public void test2() {
		System.out.println("test2 --------");
	}
	
	@Test
	public void test3() {
		System.out.println("test3 --------");
	}
	
	@Test(priority =3)
	public void atest4() {
		System.out.println("test4 --------");
	}
	
}
