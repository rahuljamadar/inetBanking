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
public class NewCustomerPage extends BaseClass {

	public NewCustomerPage() throws IOException {
		super();
	}

	By newCustomer = By.xpath("//*[text()='New Customer']");

	By customername = By.name("name");

	By gender = By.name("rad1");

	By DOB = By.id("dob");

	By address = By.name("addr");

	By city = By.name("city");

	By state = By.name("state");

	By pin = By.name("pinno");

	By mobilenumber = By.name("telephoneno");

	By email = By.name("emailid");

	By password = By.name("password");

	By submit = By.name("sub");

	public void verifyNewCustomer() {
		WebElement newcust = driver.findElement(newCustomer);
		newcust.isDisplayed();
		newcust.click();
	}

	public void addCustomerName(String cname) {
		WebElement cust = driver.findElement(customername);
		cust.isDisplayed();
		cust.clear();
		cust.sendKeys(cname);
	}

	public void gender() {
		WebElement gen = driver.findElement(gender);
		gen.isDisplayed();
		gen.isEnabled();
	}

	public void dateOfBirth() {
		WebElement dateofbirth = driver.findElement(DOB);
		dateofbirth.isDisplayed();
		dateofbirth.click();
		dateofbirth.sendKeys("23/05/1992");
	}

	public void enterAddress(String add) {
		WebElement addr = driver.findElement(address);
		addr.isDisplayed();
		addr.click();
		addr.clear();
		addr.sendKeys(add);
	}

	public void enterCity(String ciname) {
		WebElement cty = driver.findElement(city);
		cty.isDisplayed();
		cty.click();
		cty.clear();
		cty.sendKeys(ciname);
	}

	public void enterState(String sname) {
		WebElement st = driver.findElement(state);
		st.isDisplayed();
		st.click();
		st.clear();
		st.sendKeys(sname);
	}

	public void enterPin(String pin1) {
		WebElement pn = driver.findElement(pin);
		pn.isDisplayed();
		pn.click();
		pn.clear();
		pn.sendKeys(pin1);
	}

	public void enterMobileNumber(String mobile) {
		WebElement mob = driver.findElement(mobilenumber);
		mob.isDisplayed();
		mob.click();
		mob.clear();
		mob.sendKeys(mobile);
	}

	public void enterEmail(String eml) {
		WebElement em = driver.findElement(email);
		em.isDisplayed();
		em.click();
		em.clear();
		em.sendKeys(eml);
	}

	public void enterPassword(String pass) {
		WebElement pwd = driver.findElement(password);
		pwd.isDisplayed();
		pwd.click();
		pwd.clear();
		pwd.sendKeys(pass);
	}

	public void clickSubmitBtn() {
		driver.findElement(submit).click();
		driver.switchTo().alert().accept();
	}

}
