/**
 * 
 */
package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inetBanking.base.BaseClass;
import com.inetBanking.pageObjects.EditCustomerPage;
import com.inetBanking.utilities.ListenerTest;

/**
 * 
 */
@Listeners(ListenerTest.class)
public class TC_EditCustomerTest_004 extends BaseClass {
    public EditCustomerPage ep= new EditCustomerPage();
    
	public TC_EditCustomerTest_004() throws IOException {
		super();
	}
	
	@Test(priority=1)
	public void verifyClickOnEditCustomer() {
		ep.editCustomer();
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	public void verifyEnterCustomerId() {
		ep.enterCustomerId();
	}
	
	@Test(priority=3)
	public void verifyClickOnSubmit() {
		ep.clickSubmitBtn();
	}
	
	
	

}
