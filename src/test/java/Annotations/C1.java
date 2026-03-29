package Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	
	@Test()
	void search() {
		System.out.println("Search...C1");
	}
	@BeforeTest()
	void beforetest() {
		System.out.println("Beforetest...");
	}
	
	@AfterTest()
	void aftertest() {
		System.out.println("aftertest...");
	}
	

}
