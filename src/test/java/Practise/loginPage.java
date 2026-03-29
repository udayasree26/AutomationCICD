package Practise;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/login");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement Input=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Test Login page for Automation Testing Practice']")));
		WebElement username=driver.findElement(By.name("username"));
		WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", username);
		username.sendKeys("practice");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");
		js.executeScript("arguments[0].scrollIntoView(true);", login);
		login.click();
		Thread.sleep(2000);
		WebElement message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[text()='You logged into a secure area!']")));
		String success=message.getText();
		if(success.equalsIgnoreCase("You logged into a secure area!")) {
			System.out.println("Successfully logged in");
		}else {
			System.out.println("login is unSuccessful");
		}
		Thread.sleep(2000);
		
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
		driver.quit();

	}

}
