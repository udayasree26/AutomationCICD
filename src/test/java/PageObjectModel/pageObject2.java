package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pageObject2 {
	WebDriver driver;
	
	//constructor
	pageObject2(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);//MANDATORY
	}
	
	//locators

	//@FindBy(name="username") 
	@FindBy(how=How.NAME,using="username")//another way of writing xpath
	WebElement txt_username_loc;
	
	@FindBy(name="password") 
	WebElement txt_password_loc;
	
	@FindBy(xpath="//button[text()=' Login ']") 
	WebElement btn_login_loc;
	
	@FindBy(tagName="a")
	List<WebElement>links;
	
	
	
	//Actions
	public void setusername(String user) {
		txt_username_loc.sendKeys(user);
	}
	
	public void setpassword(String pw) {
		txt_password_loc.sendKeys(pw);
	}
	public void login() {
		btn_login_loc.click();
	}
	
	
	
	

}
