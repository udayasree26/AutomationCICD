package parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class paralleleecution {
	WebDriver driver;

	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String url) throws InterruptedException {
		switch(br.toLowerCase()) {
		case "chrome": driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		case "firefox": driver=new FirefoxDriver();break;
		default: System.out.println("Invalid Browser");return;
		
		}
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@AfterClass
	void close() {
		driver.quit();
	}
	@Test(priority=1)
	void logo() {
		boolean status=driver.findElement(By.xpath("//img[@alt='orangehrm-logo']/parent::div[@class='orangehrm-login-logo']")).isDisplayed();
		Assert.assertEquals(status, true);
	}
	
	@Test(priority=2)
	void title() {
		Assert.assertEquals(driver.getTitle(),"OrangeHRM" );
	}

}
