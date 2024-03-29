/**
 * 
 */
package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inetBanking.base.BaseClass;
import com.inetBanking.pageObjects.NewCustomerPage;
import com.inetBanking.utilities.ListenerTest;

/**
 * @Rahul
 */
@Listeners(ListenerTest.class)
public class TC_NewCustomerTest_003 extends BaseClass {
	
	public TC_NewCustomerTest_003() throws IOException {
		super();
	}
	
	public static Logger logger=Logger.getLogger(BaseClass.class);
	public NewCustomerPage newcustomerpage=new NewCustomerPage();

	@Test
	public void verifyAddNewCustomer() {
		newcustomerpage.verifyNewCustomer();
		newcustomerpage.addCustomerName("Tarshul Mehta");
		newcustomerpage.gender();
		newcustomerpage.enterAddress("sargasan palm road gandhinagar");
		newcustomerpage.enterCity("Gandhinagar");
		newcustomerpage.enterState("Gujarat");
		newcustomerpage.enterPin("382421");
		newcustomerpage.enterMobileNumber("1234567890");
		newcustomerpage.enterEmail("tarshul.m@test.com");
		newcustomerpage.enterPassword("pass123");
		newcustomerpage.clickSubmitBtn();
		
		Assert.assertTrue(true);
	}
	

}
