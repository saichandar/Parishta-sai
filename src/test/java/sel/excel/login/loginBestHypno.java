package sel.excel.login;
//import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class loginBestHypno {
	WebDriver driver;
	@Test(dataProvider="loginData")
public void logintest(String username,String password) throws Exception{
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://qa.besthypnotherapist.com/");
	driver.findElement(By.id("ctl00_ucLogin_UserNameTextBox")).sendKeys(username);;
	driver.findElement(By.id("ctl00_ucLogin_PasswordTextBox")).sendKeys(password);;
	driver.findElement(By.id("ctl00_ucLogin_LoginButton")).click();
	Thread.sleep(5000);
System.out.println(driver.getPageSource());
	//Assert.assertTrue(driver.getTitle().contains("Best Hypnotherapist"));

}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	@DataProvider(name="loginData")
	public Object[][] passData() throws Exception{
		ExcelData edata=new ExcelData("E:\\Selenium\\TestData.xlsx");
		int rows=edata.getRowCount(0);
		
		
	Object[][] obj=new Object[rows][2];
		for(int i=0;i<=rows;i++){
			//for(int j=0;j<=2;j++){
			obj[i][0]=edata.getData(0, i, 0);
			obj[i][1]=edata.getData(0, i, 1);
		}
		//}
		return obj;
		
	}
}
