package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageObject {
	WebDriver driver;
	
	//constructor
	pageObject(WebDriver driver){
		this.driver=driver;
	}
	
	//locators
	By txt_username_loc=By.name("username");
	By txt_password_loc=By.name("password");
	By btn_login_loc=By.xpath("//button[text()=' Login ']");
	
	//Actions
	public void setusername(String user) {
		driver.findElement(txt_username_loc).sendKeys(user);
	}
	
	public void setpassword(String pw) {
		driver.findElement(txt_password_loc).sendKeys(pw);
	}
	public void login() {
		driver.findElement(btn_login_loc).click();
	}
	
	

}
