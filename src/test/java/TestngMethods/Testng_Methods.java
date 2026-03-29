package TestngMethods;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng_Methods {
	
	
	@Test(enabled=false)
	public void method1() {
		System.out.println("Method1");
	}
	@Test
	public void method2() {
		System.out.println("Method2");
	}
	@Test
	public void method3() {
		System.out.println("Method3");
	}
	
	

}
