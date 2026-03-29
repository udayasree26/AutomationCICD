package Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		WebElement upload=driver.findElement(By.id("fileSubmit"));
		WebElement choosefile=driver.findElement(By.name("file"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", choosefile);
		Thread.sleep(5000);
		js.executeScript("arguments[0].click();", choosefile);
		Robot robot = new Robot();
		//ctrl+c
		StringSelection fileSelection = new StringSelection("Downloads\\1745595544376_teamss");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null);
		// Simulate pressing CTRL + V to paste the copied file path
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		 // Wait for file to be selected
		// Simulate pressing ENTER to confirm the file selections
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		js.executeScript("arguments[0].click();", upload);
		System.out.println("File Uploaded");
		driver.quit();

	}

}

