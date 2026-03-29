package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class rahul_page {
	WebDriver driver;
	WebDriverWait wait;
	Select sel;
	
	@BeforeTest
	void setup() throws Exception {
		driver=new ChromeDriver();
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
	}
	@AfterTest
	void close() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	void login() throws Exception {
		pageObject_rahul ra=new pageObject_rahul(driver);
//		ra.radiobtn.click();
//		Thread.sleep(2000);
//		ra.checkbox.click();
//		Thread.sleep(2000);
//		ra.dropdown_select("Option1");
		//ra.suggestions_select("ind","india");
		//ra.alerts("udaya");
		ra.confirm("well");
	
	}

}
