package rahulshetty_website;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.apache.poi.hpsf.Date;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basic {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(2000);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		
		//radiobutton
//		WebElement radiobtn=driver.findElement(By.xpath("//input[@value='radio2']"));
//		Thread.sleep(2000);
//		radiobtn.click();
//		Thread.sleep(2000);
//		if(radiobtn.isSelected()) {
//			System.out.println("radio button is selected");
//		}
//		
//		//checkbox
//		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option3']"));
//		Thread.sleep(2000);
//		checkbox.click();
//		Thread.sleep(2000);
//		if(checkbox.isSelected()) {
//			System.out.println("Checkbox is selected");
//		}
//		
		//dropdown
//		WebElement dropdown=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
//		Select select=new Select(dropdown);		
//		select.selectByVisibleText("Option3");
//		Thread.sleep(2000);
		//driver.quit();
		
		//suggestions
//		WebElement text=driver.findElement(By.xpath("//input[@id='autocomplete']"));
//		text.click();
//		text.sendKeys("ind");
//		Thread.sleep(2000);
//		List <WebElement>suggestions=driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
//		
//		for(WebElement suggestion:suggestions) {
//			if(suggestion.getText().equalsIgnoreCase("India")) {
//				suggestion.click();
//				break;
//			}
//			
//		}
//		Thread.sleep(2000);
		///window switch
//		 String parentWindow = driver.getWindowHandle();
//	     System.out.println("Parent Window ID: " + parentWindow);
//		
//		WebElement child=driver.findElement(By.xpath("//button[text()='Open Window']"));
//		child.click();
//		Thread.sleep(2000);
//		Set <String>windowhandles=driver.getWindowHandles();
//		System.out.println("All the window Handles: "+windowhandles);
//		
//		for(String window:windowhandles) {
//			driver.switchTo().window(window);
//			System.out.println("Window title: "+driver.getTitle());
//			Thread.sleep(2000);
//		}
//		
//		driver.switchTo().window(parentWindow);
//		System.out.println("back to parent window: "+driver.getTitle());
//		driver.quit();
		//tab switch
//		String parenttab=driver.getWindowHandle();
//		System.out.println("Parent tab ID: "+parenttab);
//		
//		WebElement child=driver.findElement(By.xpath("//a[text()='Open Tab']"));
//		child.click();
//		Thread.sleep(2000);
//		
//		Set<String>alltabs=driver.getWindowHandles();
//		System.out.println("All the window tabs: "+alltabs);
//		
//		for(String tabs:alltabs) {
//			driver.switchTo().window(tabs);
//			System.out.println("tabs title: "+driver.getTitle());
//			Thread.sleep(2000);
//		}
//		driver.switchTo().window(parenttab);
//		System.out.println("back to parent tab: "+driver.getTitle());
//		Thread.sleep(2000);
		 
		
		//alerts
//		WebElement input=driver.findElement(By.xpath("//input[@id='name']"));
//		input.sendKeys("udaya");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
//		Alert msg=driver.switchTo().alert();
//		System.out.println("Text in alert: "+msg.getText());
//		msg.accept();
//		Thread.sleep(5000);
//		input.sendKeys("man");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
//		Alert simplemsg=driver.switchTo().alert();
//		System.out.println("Text in alert: "+simplemsg.getText());
//		msg.dismiss();
//		Thread.sleep(10000);
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());

		
//		driver.findElement(By.xpath("//input[@id='displayed-text']")).sendKeys("pause");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id='show-textbox']")).click();
////		Thread.sleep(2000);
		
		//Actions
//		WebElement mouseover=driver.findElement(By.xpath("//button[@id='mousehover']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", mouseover);
//		Actions act=new Actions(driver);
//		act.moveToElement(mouseover).perform();
//		Thread.sleep(2000);
//		System.out.println("mouseover");
		
		//iframes
//		WebElement iframe1=driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
//		driver.switchTo().frame(iframe1);
//		WebElement courses=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//ul[@class='navigation clearfix'])[1]//li//a[text()='Courses']")));
//		courses.click();
//		WebElement products=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Browse products']")));
//		System.out.println("we can see courses");
//		Thread.sleep(2000);
//		driver.switchTo().parentFrame();
//		System.out.println("we can parent frame");
//		Thread.sleep(2000);
//		driver.quit();
		
		
		
//		WebElement iframe1=driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
//		driver.switchTo().frame(iframe1);
//		
//		WebElement login=driver.findElement(By.xpath("//a[text()='Login']"));
//		Thread.sleep(2000);
//		login.click();
//		Thread.sleep(2000);
//		
//		
//			// Take screenshot
//		
//	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//	        
//	        // Save it to a location
//	        
//	        String filePath = System.getProperty("user.dir") + "\\Screenshots\\website.png";//Use a Relative Project Path
//	        FileHandler.copy(screenshot, new File(filePath));
//	        
//	        System.out.println("Screenshot taken on failure.");
		
		driver.navigate().to("https://practice.expandtesting.com/upload");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='fileInput']"));
		WebElement upload=driver.findElement(By.xpath("//button[@id='fileSubmit']"));
		js.executeScript("arguments[0].scrollIntoView(true);", choosefile);
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", choosefile);
		Thread.sleep(2000);
		
		
		//robot class
		
		Robot robo=new Robot();
		
		StringSelection fileselect=new StringSelection("Downloads\\1745595544376_teamss");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileselect, null);
		
		//ctrl+v
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		//enter
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		upload.click();
		driver.quit();
		
		
	        
		
		
		

	}

}

