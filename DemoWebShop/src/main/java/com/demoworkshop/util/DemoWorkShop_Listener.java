package com.demoworkshop.util;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.demoworkshop.qa.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class DemoWorkShop_Listener extends TestBase implements ITestListener {

	public void onTestStart(ITestResult result) {

		System.out.println("On test start ->:"+ result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("On test success ->:"+ result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("On test Failure ->:"+ result.getName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skipped ->:"+ result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On test Failed with success percentage ->:"+ result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("On test start ->:"+ context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("On Test Finish ->:" + context.getName());
	
	}

}
