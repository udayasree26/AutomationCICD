package parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class parallelexecution2 {
	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	
	@BeforeTest
	@Parameters({"browser","url"})
	void login(String brow,String url) throws Exception {
		switch(brow.toLowerCase()) {
		case "chrome": driver=new ChromeDriver(); break;	
		case "edge" : driver=new EdgeDriver();break;
		case "firefox": driver=new FirefoxDriver();break;
		default :System.out.println("Invalid Browser"); return;}
		
		wait= new WebDriverWait(driver,Duration.ofSeconds(5));	
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	
	@AfterTest
	void login() {
		driver.quit();
	}
	
	@Test
	void mouseover() throws Exception {
		WebElement mouseover=driver.findElement(By.xpath("//button[@id='mousehover']"));
		WebElement reload=driver.findElement(By.xpath("//a[text()='Reload']"));
		
	    js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", mouseover);
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(mouseover).perform();
		Thread.sleep(2000);
		act.moveToElement(reload).click().perform();
		Thread.sleep(5000);
	}

}
