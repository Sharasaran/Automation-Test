package TestCases;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Driver.DriverInitialization;
import Page.LoginPage;


public class LoginTest extends DriverInitialization{
	
	LoginPage loginPage= new LoginPage();
	
	@Test
	public void Login() throws IOException, InterruptedException {

		
		PageFactory.initElements(driver, loginPage);
		//LoginPage.Username.sendKeys("admin@gmail.com");
		//LoginPage.Password.sendKeys("admin");
		//LoginPage.LoginButton.click();
		
		FileInputStream file = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selanium\\src\\test\\java\\Excel\\New Microsoft Excel Worksheet (2).xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("login");
	
	int rowcount=sheet.getLastRowNum();
	for(int i=0; i<=rowcount;i++) {
		XSSFRow row =sheet.getRow(i);
		String uName =(String)row.getCell(0).getStringCellValue();
	   String pWord =(String)row.getCell(1).getStringCellValue();
	 
	   
	   
	
		
		
		
	}
		
		
		
		
	}
	
		
			
}
