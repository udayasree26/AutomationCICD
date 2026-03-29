package TestngMethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;
public class Day1 {
	
	@BeforeTest
	@Parameters({"url"})
	public void testbefore1(String url) {
	    System.out.println("BeforeTest "+url);
	}
	

	@AfterTest
	public void afterbefore() {
	    System.out.println("aftertest");
	}
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}
	
	@Test(timeOut=5000)
	public void signin() {
		System.out.println("signin");
	}
	@Test
	public void signout() {
		System.out.println("signout");
	}
	
	@Test
	@Parameters({"name"})
	public void testbefore(String name) {
	    System.out.println("get value from XML " + name);
	}
	
	

}
