package com.inetBanking.utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.inetBanking.base.BaseClass;

public class ListenerTest extends BaseClass implements ITestListener {

	public ListenerTest() throws IOException {
		super();
	}

	@Override
	public void onTestStart(ITestResult result) {
      

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of testcase passed is :" + result.getName());

	}

	@Override
	public void onTestFailure(ITestResult result) {
		String s=result.getName();
		String time=new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		System.out.println("--->"+s);
		TakesScreenshot t = ((TakesScreenshot) driver);

		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File dcs=new File("C:\\Users\\rahul.jamadar_mplify\\eclipse-workspace\\inetBanking\\Screenshots\\"+s+"-"+time+".png");

		try {
			FileUtils.copyFile(srcFile, dcs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Screenshot capture successfully");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of testcase passed is :" + result.getName());
	}
}
