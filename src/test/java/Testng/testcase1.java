package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase1 {
	WebDriver driver;
	@Test(priority=1)
	void openpage() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/forgot-password");
	}
	@Test(priority=2)
	void enterdetails() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//button[text()='Retrieve password']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		driver.findElement(By.name("email")).sendKeys("reels@gmail.com");
		Thread.sleep(2000);
		ele.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		boolean status=driver.findElement(By.id("confirmation-alert")).isDisplayed();
		System.out.println("Successfully retrived");
	}
	@Test(priority=3)
	void closepage() {
		driver.quit();
	}

}
