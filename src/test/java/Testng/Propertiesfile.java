package Testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Propertiesfile {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeTest
	void login() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
	}
	
	@AfterTest
	void logout() {
		driver.quit();
	}
	
	@Test
	void credentials() throws FileNotFoundException, Exception {
		WebElement user=driver.findElement(By.id("firstName"));
		Thread.sleep(2000);
		//wait.until(ExpectedConditions.visibilityOf(user));
		Properties prop=new Properties();
		File fil=new File("D:\\Ragavula\\ur63831\\Automation\\Automation\\test-output\\config.properties");
		FileInputStream fis=new FileInputStream(fil);
		prop.load(fis);
		user.sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
	}

}
