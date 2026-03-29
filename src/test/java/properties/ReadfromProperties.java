package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadfromProperties {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		//location of properties file
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Config.Properties");
		
		//Loading properties file
		Properties prop=new Properties();
		prop.load(fis);
		
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.findElement(By.name("username")).sendKeys(username);
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.quit();

	}

}
