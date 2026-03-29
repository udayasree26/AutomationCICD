package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hrmapplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement uname=driver.findElement(By.xpath("//input[@name='username']"));
		uname.click();
		uname.sendKeys("Admin");
		WebElement Pwrd=driver.findElement(By.xpath("//input[@name='password']"));
		Pwrd.click();
		Pwrd.sendKeys("admin123");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//button[text()=' Login ']"));
		login.click();
		Thread.sleep(5000);
		WebElement admin=driver.findElement(By.xpath("//span[text()='Admin']"));
		admin.click();
		Thread.sleep(3000);
		WebElement  add=driver.findElement(By.xpath("//button[text()=' Add ']"));
		add.click();
		Thread.sleep(5000);
		//WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.quit();
		
		
		

	}

}
