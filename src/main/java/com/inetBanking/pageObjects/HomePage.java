/**
 * 
 */
package com.inetBanking.pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.inetBanking.base.BaseClass;

/**
 * 
 */
public class HomePage extends BaseClass {

	public HomePage() throws IOException {
		this.driver = driver;
	}

	By homepagelogo = By.xpath("//*[text()='Demo Site']");

	By links = By.tagName("a");

	public void verifyLogo() {
		WebElement logo = driver.findElement(homepagelogo);
		logo.isDisplayed();
		Assert.assertTrue(true);
	}

	public void verifyLinks() {
		List<WebElement> lnks = driver.findElements(links);
		int linkscount = lnks.size();
		System.out.println(linkscount);
	}
}
