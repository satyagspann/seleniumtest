package com.gspann.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FlightsPage extends BasePage
{
	WebDriver driver;
	public FlightsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		
	}
public static final By FLIGHT = By.xpath("//*[@id='bluemenu']/ul/li[6]/a");
	public void clickOnFlightButton(){
		driver.findElement(FLIGHT).click();		
	}

}


