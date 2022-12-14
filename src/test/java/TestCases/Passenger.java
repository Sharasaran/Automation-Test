package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import Driver.DriverInitialization;
import Page.LoginPage;

public class Passenger extends DriverInitialization {
	LoginPage loginpage = new LoginPage();
	
	public void loginFunction () 
	{
	PageFactory.initElements(driver, loginpage);
	LoginPage.Username.sendKeys("admin@gmail.com");
	LoginPage.Password.sendKeys("admin");
	LoginPage.LoginButton.click();
	
	driver.findElements(By.xpath("//*[@id=\"root\"]/div[1]/div/div[1]/ul[1]/ul/div[7]/a"))
	;
	driver.fi
	
	}
	

}
