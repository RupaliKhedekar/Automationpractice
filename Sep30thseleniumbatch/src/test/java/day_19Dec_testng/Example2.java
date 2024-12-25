package day_19Dec_testng;

import org.testng.annotations.Test;

public class Example2 {
@Test
	public void testcase1() {
		System.out.println("Hii,TC1");
	}
@Test
public void testcase4() {
	System.out.println("Hii,TC4");
}
@Test
public void testcase3() {
	System.out.println("Hii,TC3");
}
@Test 
public void testcase2() {
	System.out.println("Hii,TC2");
}
	

	}
/*
In testng
	- no main()
	- execution is controlled by @Test method
	- we can declare more than one @Test method, 
	  in this case all @Test method will be executed in alphabetical order
	- in Java console 
		Tests run: count comes based on number @Test method executed
		Total tests run: count comes based on how many time @Test method executed
*/


