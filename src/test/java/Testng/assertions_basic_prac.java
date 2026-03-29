package Testng;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class assertions_basic_prac {
	WebDriverWait wait;
	WebDriver driver;
	
	
	
	@BeforeTest
	void login() throws Exception {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	    wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		
	}
	@AfterTest
	void logout() {
		driver.quit();
		
	}
	@Test(priority=1)
	void switchwindow() throws Exception {
		String parentwin=driver.getWindowHandle();
		System.out.println("Parent Window ID: "+parentwin);
		WebElement windowbtn=driver.findElement(By.xpath("//button[@id='openwindow']"));
		windowbtn.click();
		Set <String>windowhandles=driver.getWindowHandles();
		for(String win:windowhandles) {
			driver.switchTo().window(win);
			System.out.println("Window title: "+driver.getTitle());
			Thread.sleep(2000);
		}
		driver.switchTo().window(parentwin);
		System.out.println("back to parent window: "+driver.getTitle());
		Thread.sleep(2000);
		
	}
	@Test(priority=2,dependsOnMethods= {"switchwindow"})
	void assertions() throws Exception {
		WebElement radiobutton=driver.findElement(By.xpath("//input[@value='radio2']"));
		radiobutton.click();
		if(radiobutton.isSelected()) {
			Assert.assertTrue(true, "Radio button is correctly selected");
			System.out.println("Radio button is correctly selected");
			Thread.sleep(2000);
		}else {
			Assert.assertTrue(false,"Radio button is not correctly selected");
		}
	}
	
	@Test(priority=3,dependsOnMethods= {"switchwindow","assertions"})
	void assertionssoft() throws Exception {
		SoftAssert sa=new SoftAssert();

		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option1']"));
		checkbox.click();
		if(checkbox.isSelected()) {
			sa.assertTrue(true);
			System.out.println("checkbox is correctly selected");
			Thread.sleep(2000);
		}else {
			sa.assertTrue(false,"checkbox is not correctly selected");
		}
		sa.assertAll();
	}

}
