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
public class DeleteCustomerPage extends BaseClass {

	public DeleteCustomerPage() throws IOException {
		super();
	}
	
	By deletecustomer= By.xpath("//*[text()='Delete Customer']");
	
	By customerId= By.name("cusid");
	
	By submit= By.xpath("//*[@value='Submit']");
	
	public void clickDeleteCustomer() {
		WebElement link = driver.findElement(deletecustomer);
		link.isDisplayed();
		link.click();
	}
	
	public void enterCustomerId() {
		WebElement custid = driver.findElement(customerId);
		custid.isDisplayed();
		custid.click();
		custid.clear();
		custid.sendKeys("CI45612");
	}
	
	public void clickSubmitBtn() {
		WebElement sub = driver.findElement(submit);
		sub.isDisplayed();
		sub.click();
	}

}
