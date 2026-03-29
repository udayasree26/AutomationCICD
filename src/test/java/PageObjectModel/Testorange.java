package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Testorange {
	WebDriver driver;
	
	@BeforeClass
	 void setup() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@AfterClass
	 void close() {
		 driver.quit();
	 }
	
	@Test
	void logging() {
		pageObject2 po=new pageObject2(driver);
		po.setusername("Admin");
		po.setpassword("admin123");
		po.login();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
	}

}
