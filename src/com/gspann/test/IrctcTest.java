package com.gspann.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.gspann.pageobjects.AppBasePage;
import com.gspann.pageobjects.FlightsPage;
import com.gspann.pageobjects.IrctcFlightCount;
import com.gspann.pageobjects.IrctcFlightbook;

public class IrctcTest extends AppBasePage{
	WebDriver driver;
	@Test
	public void  test1() {
		AppBasePage Apage = new AppBasePage();
        FlightsPage page = new FlightsPage(driver);
        IrctcFlightbook flight = new IrctcFlightbook(driver);
		IrctcFlightCount count = new IrctcFlightCount(driver);
		Apage.setUp("firefox");
		page.clickOnFlightButton();
		flight.enterOnOrigin("Delhi");
		flight.enterOnDestinetion("Patna");
	    flight.clickOnDate();
		flight.clickOnDatePic();
		flight.clickOnLink();
		flight.clickOnAdult();
		flight.clickOnAdultOpt();
		flight.clickOnChild();
		flight.clickOnChildOpt();
		flight.clickOnInft();
		flight.clickOnInftOpt();
		flight.clickOnClasstype();
		flight.clickOnClasstypeOpt();
		flight.clickOnSubmitBtn();
        count.IrctcText();
		int flightCount=count.IrctcCount();
		Assert.assertTrue(flightCount > 0, "The count is less than zero");
		System.out.println("The flight count is greater than zero");
		
		driver.quit();

	}

}



