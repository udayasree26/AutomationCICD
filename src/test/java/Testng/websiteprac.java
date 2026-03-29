package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class websiteprac {
	/*launch an app
	 * verify the logo
	 * login
	 * logout 
	 */
	WebDriver driver;
	@Test(priority=1)
	void lauchapp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		System.out.println("successfully opened app");
		
	}
	
	@Test(priority=2)
	void verifylogo() throws InterruptedException {
		Thread.sleep(2000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo is present: "+status);
	}
	
	@Test(priority=3)
	void login() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		System.out.println("successfully logged in");
	}
	
	@Test(priority=4)
	void closeapp() {
		driver.quit();
	}
  
}
