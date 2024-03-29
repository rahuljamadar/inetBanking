package com.inetBanking.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import com.inetBanking.base.BaseClass;

public class LoginPage extends BaseClass {

	
	
	public LoginPage() throws IOException {
		super();
	}

	By username=By.name("uid");
	@CacheLookup
	
	By password=By.name("password");
	@CacheLookup
	
	By login=By.name("btnLogin");
	
	public void setUserName(String uname) {
		WebElement un = driver.findElement(username);
		un.isDisplayed();
		un.clear();
		un.sendKeys(uname);	
	}
	
	public void password(String pwd) {
		WebElement pass = driver.findElement(password);
		pass.isDisplayed();
		pass.clear();
		pass.sendKeys(pwd);
	}
	
	public void clickLogin() throws IOException {
		WebElement lbtn = driver.findElement(login);
		lbtn.isDisplayed();
		lbtn.click();
		//return new HomePage();
	}

}
