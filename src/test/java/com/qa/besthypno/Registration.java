package com.qa.besthypno;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class Registration {
	public static void main(String[] args){
	WebDriver driver=new ChromeDriver();
driver.get("http://qa.besthypnotherapist.com/");
WebElement reg=driver.findElement(By.id("ctl00_ucLogin_RegisterHyperLink"));
reg.click();
	/*WebElement fname = driver.findElement(By.name("ctl00$ContentPlaceHolder1$NameTextBox"));
    WebElement lname = driver.findElement(By.name("ctl00$ContentPlaceHolder1$LastNameTextBox"));
    WebElement dob = driver.findElement(By.name("ctl00$ContentPlaceHolder1$DOBTextBox"));
    WebElement street = driver.findElement(By.name("ctl00$ContentPlaceHolder1$StreetTextBox"));
    WebElement apt = driver.findElement(By.name("ctl00$ContentPlaceHolder1$AptTextBox"));
    WebElement city = driver.findElement(By.name("ctl00$ContentPlaceHolder1$CityTextBox"));
    WebElement state = driver.findElement(By.name("ctl00$ContentPlaceHolder1$StateDropDownList"));
    WebElement zip = driver.findElement(By.name("ctl00$ContentPlaceHolder1$ZipCodeTextBox"));
    WebElement home = driver.findElement(By.name("ctl00$ContentPlaceHolder1$HomeTextBox"));
    WebElement email = driver.findElement(By.name("ctl00$ContentPlaceHolder1$EmailTextBox"));
    WebElement uid = driver.findElement(By.name("ctl00$ContentPlaceHolder1$UserIdTextBox"));
    WebElement psw= driver.findElement(By.name("ctl00$ContentPlaceHolder1$PasswordTextBox"));
    WebElement conpsw = driver.findElement(By.name("ctl00$ContentPlaceHolder1$RetypePasswordTextBox"));
    WebElement rname = driver.findElement(By.name("ctl00$ContentPlaceHolder1$RelativeNameTextBox"));
    WebElement relation = driver.findElement(By.name("ctl00$ContentPlaceHolder1$RelaonshipToYouTextBox"));
    WebElement rphone = driver.findElement(By.name("ctl00$ContentPlaceHolder1$RelativePhoneTextBox"));
    WebElement submit = driver.findElement(By.name("ctl00$ContentPlaceHolder1$SaveButton"));
}*/
}
}
