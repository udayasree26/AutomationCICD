package AmazonAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestAmazon {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void settup(String br) {
		
		switch(br.toLowerCase()) {
		case "chrome": driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		default: System.out.println("Invalid Browser");return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=7954429843609792862&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062138&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
		driver.manage().window().maximize();
	}
	@AfterClass
	void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test(priority=1)
    void titlecheck(){
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	@Test(priority=2,dependsOnMethods= {"titlecheck"})
	void searchproduct() throws InterruptedException {
		AmazonPageObject apo=new AmazonPageObject(driver);
		apo.searchamazon("Himalaya facewash");
		// Select by visible text
		Thread.sleep(5000);
		apo.productselect();
	}

}
