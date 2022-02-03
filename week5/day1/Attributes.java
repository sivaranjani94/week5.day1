package week5.day1;

import org.testng.annotations.Test;

public class Attributes {

	@Test(priority = 1)
	public void testpriority() {
		System.out.println("priority two");
	}

	@Test(priority = 0)
	public void testpriority2() {
		System.out.println("priority one");
	}

	@Test(enabled = false)
	public void testenable() {
		System.out.println("priority two");
	}

	@Test(invocationCount = 5, priority = 2)
	public  void testinvocationcount() {
		System.out.println("invocation count");	
	}
}