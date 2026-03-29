package PageObjectModel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class pageObject_rahul {
	WebDriver driver;
	
	pageObject_rahul(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="checkBoxOption1")
	WebElement checkbox;
	
	@FindBy(name="radioButton")
	WebElement radiobtn;
	
	 @FindBy(name="dropdown-class-example")
	WebElement dropdown;
	
	
	public void checkbox_click() {
		checkbox.click();
	}
	
	public void radiobtn_click() {
		radiobtn.click();
	}
	
	@FindBy(id="autocomplete")
	WebElement inputbar;
	
	@FindBy(xpath="//div[@class='ui-menu-item-wrapper']")
	List<WebElement>suggestions;
	
	@FindBy(id="name")
	WebElement alertbox;
	
	@FindBy(id="alertbtn")
	WebElement alertbtn;
	
	@FindBy(id="confirmbtn")
	WebElement confirmbtn;
	
	public void dropdown_select(String text) {
		Select sel= new Select(dropdown);
		sel.selectByVisibleText(text);
	}
	public void suggestions_select(String text,String selText) throws Exception {
		inputbar.click();
		Thread.sleep(2000);
		inputbar.sendKeys(text);
		boolean found=false;
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfAllElements(suggestions));

		
		for(WebElement suggestion:suggestions) {
			if(suggestion.getText().equalsIgnoreCase(selText)) {;
			found=true;
			suggestion.click();
			Thread.sleep(2000);
			break;
			}
		}
		Assert.assertTrue(found, "❌ Suggestion '" + text + "' not found!");
		
	}
	
	public void alerts(String text) throws Exception {
		alertbox.click();
		alertbox.sendKeys(text);
		Thread.sleep(2000);
		alertbtn.click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
	}
	
	public void confirm(String text) throws Exception {
		alertbox.click();
		alertbox.sendKeys(text);
		Thread.sleep(2000);
		confirmbtn.click();
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.dismiss();
	}
		
	

}
