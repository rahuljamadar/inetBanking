/**
 * 
 */
package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inetBanking.base.BaseClass;
import com.inetBanking.pageObjects.DeleteCustomerPage;
import com.inetBanking.utilities.ListenerTest;

/**
 * 
 */
@Listeners(ListenerTest.class)
public class TC_DeleteCustomerTest_005 extends BaseClass {
     DeleteCustomerPage dp= new DeleteCustomerPage();
	
	public TC_DeleteCustomerTest_005() throws IOException {
		super();
	}
	
	@Test
	public void verifyDeleteCustomerLink() {
		dp.clickDeleteCustomer();
		Assert.assertTrue(true);
	}
	
	@Test
	public void verifyEnterCustomerId() {
		dp.enterCustomerId();
		Assert.assertTrue(true);
	}
	
	@Test
	public void verifyClickSubmitBtn() {
		dp.clickSubmitBtn();
		Assert.assertTrue(true);
	}

}
