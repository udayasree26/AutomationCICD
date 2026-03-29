package groupingconcept;

import org.testng.annotations.Test;

public class paymenttest {
	
	@Test(priority=1,groups= {"sanity","regression","functional"})
	void paybyrupee() {
		System.out.println("pay by rupee");
	}
	
	@Test(priority=2,groups= {"sanity","regression","functional"})
	void paybydollar() {
		System.out.println("pay by dollar");
	}

}
