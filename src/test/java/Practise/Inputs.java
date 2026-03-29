package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inputs {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/inputs");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement Input=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Web inputs page for Automation Testing Practice']")));
		WebElement num=driver.findElement(By.name("input-number"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", num);
		num.sendKeys("8");
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.name("input-text"));
		text.sendKeys("selenium");
		WebElement pass=driver.findElement(By.name("input-password"));
		pass.sendKeys("automation");
		Thread.sleep(2000);
		driver.quit();

	}

}
