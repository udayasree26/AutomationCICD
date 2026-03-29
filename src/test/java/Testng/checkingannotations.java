package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class checkingannotations {
	WebDriver driver;
	JavascriptExecutor js;
	SoftAssert sa;
	@BeforeClass
	void openpage() {
		 driver=new ChromeDriver();
		 driver.get("https://practice.expandtesting.com/radio-buttons");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.manage().window().maximize();
	}
	@AfterClass
	void closepage() {
		driver.quit();
	}
	@Test(priority=1)
	void favcolor() throws InterruptedException {
		WebElement Green=driver.findElement(By.xpath("//label[text()='Green']"));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Green);
		WebElement yellowbtn=driver.findElement(By.xpath("//label[text()='Yellow']/preceding-sibling::input[@type='radio']"));
//		if(!yellowbtn.isSelected()) {
//			yellowbtn.click();
//		}
		Thread.sleep(3000);
		sa=new SoftAssert();
		
		if(yellowbtn.isSelected()) {
			sa.assertTrue(true);
			System.out.println("Expected button is selected");
		}else {
			sa.assertTrue(false);
			System.out.println("Expected button is not selected");
		}
		sa.assertAll();
	}
	@Test(priority=2,dependsOnMethods= {"favcolor"})
	void favsport() throws InterruptedException {
		WebElement Green=driver.findElement(By.xpath("//label[text()='Green']"));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", Green);
		WebElement tennisbtn=driver.findElement(By.xpath("//label[text()='Football']/preceding-sibling::input[@type='radio']"));
		Thread.sleep(2000);
		if(!tennisbtn.isSelected()) {
			tennisbtn.click();
		}
		if(tennisbtn.isSelected()) {
			sa.assertTrue(true);
			System.out.println("Expected button is selected");
		}else {
			sa.assertTrue(false);
			System.out.println("Expected button is not selected");
		}
		sa.assertAll();
	}
	

}
