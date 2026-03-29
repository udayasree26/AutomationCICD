package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launching {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait up to 10 seconds

        // Wait for an element to be visible
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Practice Test Automation Website for Web UI & API']")));
		Thread.sleep(2000);
		WebElement tryit=driver.findElement(By.xpath("//a[text()='Web inputs']/../../following-sibling::div//div//a[text()='Try it out']"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", tryit);
		Thread.sleep(2000);
		tryit.click();
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Web inputs page for Automation Testing Practice']")));
		Thread.sleep(2000);
		driver.quit();
		
		 
		 
	
	}

}
