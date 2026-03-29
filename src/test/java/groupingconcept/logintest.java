package groupingconcept;

import org.testng.annotations.Test;

public class logintest {
	
	@Test(priority=1,groups= {"sanity"})
	void loginintoemail() {
		System.out.println("logged in to email");
	}
	

	@Test(priority=2,groups= {"sanity"})
	void loginintofacebook() {
		System.out.println("logged in to facebool");
	}
	

	@Test(priority=3,groups= {"sanity"})
	void loginintotwitter() {
		System.out.println("logged in to twitter");
	}

}
