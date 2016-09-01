package com.gspann.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Mylistener implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("onFinish "+arg0.getName());
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("onStart" +arg0.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailedButWithinSuccessPercentage" +arg0.getName());
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestFailure" +arg0.getName());
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
	System.out.println("onTestSkipped" +arg0.getName());	
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestStart"+arg0.getName());
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("onTestSuccess"+arg0.getName());
	}

}
