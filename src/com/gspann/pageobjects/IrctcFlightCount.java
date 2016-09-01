package com.gspann.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IrctcFlightCount extends BasePage{

	WebDriver driver;
	public IrctcFlightCount(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public final By IrctcList  = By.xpath("//div[@id='or_price_bg_stk']");
	public final By IrctcCount = By.xpath("//div[@class='onewayflightinfo']");

	public String IrctcText(){
		String str = driver.findElement(IrctcList).getText();
		return str;
	}
	public int IrctcCount(){
		int allSizes = driver.findElements(IrctcCount).size();
		return allSizes;
	}
}
