package Practise;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Datepicker2 {
	
	static Month convertMonth(String month) {
		HashMap<String,Month>Monthmap=new HashMap<String,Month>();
		Monthmap.put("Jan", Month.JANUARY);
		Monthmap.put("Feb", Month.FEBRUARY);
		Monthmap.put("Mar", Month.MARCH);
		Monthmap.put("Apr", Month.APRIL);
		Monthmap.put("May", Month.MAY);
		Monthmap.put("Jun", Month.JUNE);
		Monthmap.put("Jul", Month.JULY);
		Monthmap.put("Aug", Month.AUGUST);
		Monthmap.put("Sepr", Month.SEPTEMBER);
		Monthmap.put("Oct", Month.OCTOBER);
		Monthmap.put("Nov", Month.NOVEMBER);
		Monthmap.put("Dec", Month.DECEMBER);
		
		Month vmonth=Monthmap.get(month);
		
		if(vmonth==null) {
			System.out.println("Invalid month");
		}
		return vmonth;
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement datepicker=driver.findElement(By.id("txtDate"));
		js.executeScript("arguments[0].scrollIntoView(true);", datepicker);
		Thread.sleep(2000);
		datepicker.click();
		
		String reqyear="2022";
		String reqmonth="Jul";
		String date="26";
		
		//select year
		
		WebElement year=driver.findElement(By.className("ui-datepicker-year"));
		Select yearselect=new Select(year);
		yearselect.selectByVisibleText(reqyear);
		
		while(true) {
			String displaymonth=driver.findElement(By.xpath("")).getText();
			System.out.println("display month is : "+displaymonth);
			//convert display and required month into month objects
			Month currentmonth=convertMonth(displaymonth);
			Month Expectedmonth=convertMonth(reqmonth);
			Thread.sleep(3000);
			
			//compare
			int result=Expectedmonth.compareTo(currentmonth);
			
			//0 months are equal
			//>0 future month
			//<0 past month
			
			if(result<0) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			else if(result>0) {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			else {
				break;
			}
		}
		
		List<WebElement>datestoselect=driver.findElements(By.xpath("(//table)[6]//tbody//tr//td//a"));
		
		for(WebElement dt:datestoselect) {
			if(dt.equals(date)) {
				dt.click();
				break;
			}
		}
	}

}
