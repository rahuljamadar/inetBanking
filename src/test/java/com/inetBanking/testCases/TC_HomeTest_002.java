/**
 * 
 */
package com.inetBanking.testCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.inetBanking.base.BaseClass;
import com.inetBanking.pageObjects.HomePage;
import com.inetBanking.utilities.ListenerTest;

/**
 * 
 */
@Listeners(ListenerTest.class)
public class TC_HomeTest_002 extends BaseClass {
	
	public TC_HomeTest_002() throws IOException {
		super();
	}
	
	public static Logger logger=Logger.getLogger(BaseClass.class);
	HomePage homepage= new HomePage();
	
	@Test(priority=1)
	public void verifyLogo() throws IOException {
		homepage.verifyLogo();
		logger.info("Logo is displayed");
	}
	
	@Test(priority=2)
	public void Links() {
		homepage.verifyLinks();
		logger.info("Identified links");
	}

}
