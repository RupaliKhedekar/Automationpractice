package day_19Dec_testng;

import org.testng.annotations.Test;

public class Example4 {

	@Test(enabled=false)
	public void testCase1() {
		System.out.println("Hello TC1");
	}
	@Test(enabled=true,priority =1)
	public void testCase3() {
		System.out.println("Hello TC3");
	}
	@Test(enabled=true,priority =2,invocationCount = 3)
	public void testCase2() {
		System.out.println("Hello TC2");
	}
	@Test(enabled=true,priority =3, timeOut = 2000)
	public void testCase4() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Hello TC4");
	}
	@Test(enabled=true,priority =0, dependsOnMethods = "testCase4", description = "Here we are testing dependsOnMethod attributes")
	public void testCase5() throws InterruptedException {
		
		System.out.println("Hello TC5");
	}
	
	@Test(enabled=true,priority =7, expectedExceptions = ArithmeticException.class)
	public void testCase6() {
		
		System.out.println("Hello TC6");
		int x=10/0;
		System.out.println("TC6 executed successfully....");
	}
}
/*
@Test method attributes:
 	enabled: by default true which mean method must be executed
 			 false: which means this method won;t be executed
 	priority: be default priority is zero set for all test method
 			in case if test methods are having common priority, dn common priority test method 
 			will be executed in alphabetical order
 	innocationCount: this will help to execute a Test method multiple times depends on defined value
 			
 		
 */
