package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class basic_testng_script {
	WebDriver driver;
	
	
	@BeforeClass
	void login() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
	}
	@AfterClass
	void exit() {
		driver.quit();
	}
	
	@Test
	void dropdown() throws Exception {
		WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select sel=new Select(drop);
		sel.selectByVisibleText("Option3");
		Thread.sleep(5000);
	}

}
