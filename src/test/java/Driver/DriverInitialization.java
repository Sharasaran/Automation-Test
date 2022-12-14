package Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class DriverInitialization {
	
	 public static WebDriver driver;

	@BeforeMethod
	public  void main() throws InterruptedException {
		// TODO Auto-generated method stub
		//chromedriver initialization//
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\driver\\chromedriver.exe");
		driver=new ChromeDriver();//
		//window Maximize//
		driver.manage().window().maximize();
		driver.get("http://transport-hub-qa-release.com.s3-website.ap-south-1.amazonaws.com/");
		WebElement username= driver.findElement(By.id("email"));
		Thread.sleep(3000);
		username.sendKeys("admin@gmail.com");
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys("admin");
		WebElement loginbutton=driver.findElement(By.id("mui-1"));
		loginbutton.click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
