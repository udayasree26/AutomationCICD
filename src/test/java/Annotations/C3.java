package Annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	void abc() {
		System.out.println("abc c3");
	}
	@BeforeSuite()
	void bs() {
		System.out.println("Before Suite");
	}
	@AfterSuite()
	void as() {
		System.out.println("After Suite");
	}

}
