package parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class dataprovider2 {
	WebDriver driver;
	WebDriverWait wait;
	SoftAssert sa=new SoftAssert();
	
	@BeforeTest
	void login() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
	}
	@AfterTest
	void logout() throws Exception {
		driver.quit();
	
	}
	
	@Test(dataProvider="dp")
	void logindetails(String username,String password) throws Exception {
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(2000);
		WebElement user=driver.findElement(By.xpath("//input[@name='username']"));
		user.clear();
		user.sendKeys(username);
		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.clear();
		pass.sendKeys(password);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
		String text=driver.findElement(By.xpath("//a[text()='Log out']")).getText();
		if(text.equalsIgnoreCase("Log out")) {
			sa.assertTrue(true);
			System.out.println("Login successfully");
		}else {
			sa.assertTrue(false);
			System.out.println("Login is not successful");
		}
		sa.assertAll();
		
		
	}
	@DataProvider(name="dp",indices= {0,1})
	Object[][] details() {
		Object data[][]= {
				{"student","Password123"},
				{"student123","Password123"},
				{"student","Password"}
		};
		return data;
		
		
	}
	
}
