package Testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class WebTables {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	@BeforeTest
	void login() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        js = (JavascriptExecutor) driver;
	}
	
	@AfterTest
	void logout() {
		driver.quit();
	}
	
	@Test
	void credentials() throws FileNotFoundException, Exception {
		WebElement user1=driver.findElement(By.xpath("//span[@id='edit-record-1']"));
		
	    wait.until(ExpectedConditions.visibilityOf(user1));
	    //js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", user1);
		
		user1.click();
		Thread.sleep(2000);
	}
	
	@Test(priority=2,dependsOnMethods= {"credentials"})
	void edit() throws InterruptedException {
       WebElement salary=driver.findElement(By.xpath("//input[@id='salary']"));
		
	    wait.until(ExpectedConditions.visibilityOf(salary));
	    //js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", salary);
		
	    salary.clear();
	    salary.sendKeys("20000");
	    WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
	    submit.click();
	    Thread.sleep(3000);
	}
	
	@Test(priority=3,dependsOnMethods= {"edit"})
	void delete() throws InterruptedException {
       WebElement delete=driver.findElement(By.xpath("//span[@id='delete-record-3']"));
		
	    wait.until(ExpectedConditions.visibilityOf(delete));
	    //js=(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", delete);
		
	    
	    delete.click();
	    Thread.sleep(5000);
	}

	

}
