package testlisteners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners(testlisteners.ExtentReportmanager.class)
public class orangehrm {
WebDriver driver;

	
	@BeforeClass
	void setup() throws InterruptedException {
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@AfterClass
	void close() {
		driver.quit();
	}
	@Test(priority=1)
	void logo() throws InterruptedException {
		boolean status=driver.findElement(By.xpath("//img[@alt='orangehrm-logo']/parent::div[@class='orangehrm-login-logo']")).isDisplayed();
		Assert.assertEquals(status, true);
		
	}
	
	@Test(priority=3,dependsOnMethods= {"urlcheck"})
	void title() throws InterruptedException {
		Assert.assertEquals(driver.getTitle(),"OrangeHRM" );
		
	}
	@Test(priority=2)
	void urlcheck() throws InterruptedException {
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/au/login");
		

}


}
