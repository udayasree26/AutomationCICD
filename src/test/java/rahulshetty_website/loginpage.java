package rahulshetty_website;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		//driver.get("https://practicetestautomation.com/practice-test-login/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement username=driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("student");
		WebElement password=driver.findElement(By.id("password"));
		Thread.sleep(2000);
		password.click();
		password.sendKeys("Password123");
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.id("submit"));
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("arguments[0].scrollIntoView(true);", submit);
		submit.click();
		//WebDriverWait successmsg=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement successmsg=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Logged In Successfully']")));
		String message=successmsg.getText();
		if(message.equals("Logged In Successfully")) {
			System.out.println("Successfully logged");
		}else {
			System.out.println("Something went wrong");
		}
		driver.quit();
		
		
		
		

	}

}
