package Practise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/drag-and-drop");
		Thread.sleep(5000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.id("column-a"));
		WebElement drop=driver.findElement(By.id("column-b"));
		js.executeScript("arguments[0].scrollIntoView(true);", drop);
		Thread.sleep(2000);
		act.dragAndDrop(drag, drop);
		Thread.sleep(2000);
		driver.quit();

	}

}
