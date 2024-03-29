/**
 * 
 */
package com.inetBanking.pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.inetBanking.base.BaseClass;

/**
 * 
 */
public class EditCustomerPage extends BaseClass {

	public EditCustomerPage() throws IOException {
		super();
	}
	
	By editcustomer= By.xpath("//*[text()='Edit Customer']");
	
	By customerid= By.name("cusid");
	
	By submitBtn= By.name("AccSubmit");
	
	public void editCustomer() {
		WebElement cust = driver.findElement(editcustomer);
		cust.isDisplayed();
		cust.click();
	}
	
	public void enterCustomerId() {
		WebElement cid = driver.findElement(customerid);
		cid.click();
		cid.clear();
		cid.sendKeys("CI45612");
		driver.switchTo().alert().accept();
	}
	
	public void clickSubmitBtn() {
		WebElement submit = driver.findElement(submitBtn);
		submit.isDisplayed();
		submit.click();
	}

}
