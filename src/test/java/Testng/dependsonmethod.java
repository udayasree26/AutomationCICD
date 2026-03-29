package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethod {
	WebDriver driver;
	JavascriptExecutor js;
	@Test(priority=1)
	void openapp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://practice.expandtesting.com/form-validation");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void enterdetails() throws InterruptedException {
		WebElement register=driver.findElement(By.xpath("//button[text()=' Register ']"));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", register);
		driver.findElement(By.name("ContactName")).sendKeys("dodo");
		driver.findElement(By.name("contactnumber")).sendKeys("012-3456789");
		Thread.sleep(10000);
	}
	@Test(priority=3,dependsOnMethods= {"openapp","enterdetails"})
	void clickregister() throws InterruptedException {
		WebElement register=driver.findElement(By.xpath("//button[text()=' Register ']"));
		register.click();
		Thread.sleep(3000);
		WebElement text=driver.findElement(By.xpath("//p[text()='Thank you for validating your ticket']"));
		String texttoread=text.getText();
		String expectedtext="Thank you for validating your ticket";
		Assert.assertEquals(texttoread, expectedtext);
	}
	
	@Test(priority=4,dependsOnMethods= {"openapp","clickregister"})
	void closeapp() {
		driver.quit();
	}

}
