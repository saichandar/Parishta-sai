package best.hypno;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.File;
public class login {
	WebDriver driver;
	@Test(dataProvider="loginData")
public void logintest(String username,String password) throws Exception{
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://qa.besthypnotherapist.com/");
	driver.findElement(By.id("ctl00_ucLogin_UserNameTextBox")).sendKeys(username);;
	driver.findElement(By.id("ctl00_ucLogin_PasswordTextBox")).sendKeys(password);;
	driver.findElement(By.id("ctl00_ucLogin_LoginButton")).click();
	Thread.sleep(5000);;
	System.out.println(driver.getCurrentUrl());
	Assert.assertTrue(driver.getCurrentUrl().contains("http://qa.besthypnotherapist.com/qa/UserProfile.aspx"),"loggin failed");
	//Assert.assertTrue(driver.getTitle().contains("Best Hypnotherapist"),"login failed");
System.out.println("login successfully");
}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	@DataProvider(name="loginData")
	public Object[][] passData() throws Exception{
		File file1=new File("E:\\Selenium\\TestData.xlsx");
		FileInputStream instream=new FileInputStream(file1);
		XSSFWorkbook wb=new XSSFWorkbook(instream);//load complete excel sheet(.xlsx)
		
//HSSWorkbook: dealing with .xls sheet
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		//int columncount=4;
		System.out.println("total rows:"+(rowcount));
	
		
	Object[][] obj=new Object[(rowcount)+1][2];
	for(int i=0;i<((rowcount)+1);i++){
		for(int j=0;j<2;j++){
		 obj[i][j]=sheet1.getRow(i).getCell(j).getStringCellValue();
		//System.out.println("Testdata from Row"+i+"column"+j+" excel is"+data0)
	}}
		/*obj[0][0]="hari";
		obj[0][1]="hari1";
		obj[1][0]="haripriya7";
		obj[1][1]="Hari407#";*/
		return obj;
		
	}
}
