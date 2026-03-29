package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Methods {
	
	/*
	 * Login
	 * search
	 * logout
	 * login
	 * adv search
	 * logout
	 */
	@BeforeMethod
	void login() {
		System.out.println("Login..");
	}
	@AfterMethod
	void logout() {
		System.out.println("Logout..");
	}
	@Test(priority=1)
	void search() {
		System.out.println("search..");
	}
	@Test(priority=2)
	void advsearch() {
		System.out.println("Advance search..");
	}

}
