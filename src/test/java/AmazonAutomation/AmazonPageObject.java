package AmazonAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonPageObject {
	WebDriver driver;
	//constructor
	AmazonPageObject(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//locators
	@FindBy(xpath="//input[@aria-label='Search Amazon.in']")
	WebElement searchbar;
	
	@FindBy(xpath="//div[@aria-label='himalaya facewash']")
	WebElement searchenterproduct;
	
	@FindBy(xpath="(//span[text()='Himalaya Moisturizing Aloe Vera Face Wash, 200ml'])[1]/../../../following-sibling::div[4]/div/child::div/child::div[2]/child::div/form/div/div/span/div/span/span/button[text()='Add to cart']")
	WebElement producttosearch;
	
	
	//Actions
	public void searchamazon(String sp) throws InterruptedException {
		searchbar.sendKeys(sp);
		Thread.sleep(2000);
		searchenterproduct.click();
		
	}
	
	public void productselect() {
		producttosearch.click();
	}

}
