package com.gspann.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IrctcFlightbook extends BasePage{
	WebDriver driver;

	public static final By IrctcBook = By.xpath("//input[@id='origin']");
	public static final By IrctcBookD = By.xpath("//input[@id='destination']");
	public static final By IrctcBookDate = By.xpath("//*[@id='where']/div[4]/img");
	public static final By IrctcBookDatePic = By.id("ui-datepicker-div");
	public static final By IrctcBookPic = By.linkText("28");
	public static final By IrctcBookAd = By.xpath("//select[@id='noOfAdult']"); 
	public static final By IrctcBookAdOp = By.xpath("//select[@id='noOfAdult']/option[2]");
	public static final By IrctcBookCh = By.xpath("//select[@id='noOfChild']");
	public static final By IrctcBookChOpt = By.xpath("//select[@id='noOfChild']/option[3]");
	public static final By IrctcBookInft = By.xpath("//select[@id='noOfInfant']");
	public static final By IrctcBookInftOpt = By.xpath("//select[@id='noOfInfant']/option[2]");
	public static final By IrctcBookCType = By.xpath("//select[@id='classType']");
	public static final By IrctcBookCTypeOpt = By.xpath("//select[@id='classType']/option[1]");
	public static final By IrctcBookSubmitBtn = By.xpath("//div[@class='srchbtn']");

	public IrctcFlightbook(WebDriver driver){
		super(driver);
		this.driver=driver;
	}

	public void enterOnOrigin(String origin){
		driver.findElement(IrctcBook).sendKeys(origin);
		driver.findElement(IrctcBook).click();
	}
	public void enterOnDestinetion(String destination){
		driver.findElement(IrctcBookD).sendKeys("destination");
		driver.findElement(IrctcBookD).click();
	}
	public void clickOnDate(){
		driver.findElement(IrctcBookDate).click();
	}
	public void clickOnDatePic(){
		driver.findElement(IrctcBookDatePic).click();
	}
	public void clickOnLink(){
		driver.findElement(IrctcBookPic).click();
	}
	public void clickOnAdult(){
		driver.findElement(IrctcBookAd).click();
	}
	public void clickOnAdultOpt(){
		driver.findElement(IrctcBookAdOp).click();
	}
	public void clickOnChild(){
		driver.findElement(IrctcBookCh).click();
	}
	public void clickOnChildOpt(){
		driver.findElement(IrctcBookChOpt).click();
	}
	public void clickOnInft(){
		driver.findElement(IrctcBookInft).click();
	}
	public void clickOnInftOpt(){
		driver.findElement(IrctcBookInftOpt).click();
	}
	public void clickOnClasstype(){
		driver.findElement(IrctcBookCType).click();
	}
	public void clickOnClasstypeOpt(){
		driver.findElement(IrctcBookCTypeOpt).click();
	}
	public void clickOnSubmitBtn(){
		driver.findElement(IrctcBookSubmitBtn).click();
	}

	
}

