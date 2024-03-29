package com.inetBanking.testCases;

import java.io.IOException;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import com.inetBanking.base.BaseClass;
import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.ListenerTest;

@Listeners(ListenerTest.class)
public class TC_LoginTest_001 extends BaseClass {

	public TC_LoginTest_001() throws IOException {
		super();
	}

	public static Logger logger = Logger.getLogger(BaseClass.class);
	LoginPage lp = new LoginPage();

	@BeforeClass
	public void loginTest() throws IOException {

		lp.setUserName(prop.getProperty("username"));
		logger.info("Entered username");

		lp.password(prop.getProperty("password"));
		logger.info("Entered password");

		lp.clickLogin();
		logger.info("Click on login button");

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		} else {
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
