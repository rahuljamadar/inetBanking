/**
 * 
 */
package com.inetBanking.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.inetBanking.pageObjects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */
public class BaseClass {	

	public static Properties prop;
	public static WebDriver driver;
	public static Logger logger=LogManager.getLogger(BaseClass.class);
	
	public BaseClass() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
			"C:\\Users\\rahul.jamadar_mplify\\eclipse-workspace\\inetBanking\\Configuration\\config.properties");
		prop.load(fis);

	}
	
	@BeforeTest
	public  void launchApp() {
		
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver= new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("baseURL"));
        logger.info("URL is opened");
        
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	}
	@BeforeClass
	public void loginTest() throws IOException {
		LoginPage lp = new LoginPage();
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
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
