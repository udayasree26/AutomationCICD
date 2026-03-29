package TestngMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day2 {
	
	@BeforeSuite
	public void Beforesuite() {
		System.out.println("Beforesuite");
	}
	
	@AfterSuite
	public void Aftersuite() {
		System.out.println("Aftersuite");
	}
	
	
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void logout() {
		System.out.println("logout");
	}


}
