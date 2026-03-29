package groupingconcept;

import org.testng.annotations.Test;

public class signuppage {

	@Test(priority=1,groups= {"regression"})
	void signupintoemail() {
		System.out.println("sign up in to email");
	}
	
	@Test(priority=2,groups= {"regression"})
	void signupintofacebook() {
		System.out.println("sign up in to facebook");
	}
	
	@Test(priority=3,groups= {"regression"})
	void signupintotwitter() {
		System.out.println("sign up in to twitter");
	}

}
