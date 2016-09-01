package com.gspann.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	@Test
	public void test1(){
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		/*driver.navigate().to();
		driver.navigate().back();
		driver.navigate().forward();*/
	 driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Selenium");
	 driver.findElement(By.xpath("//input[@id='lst-ib']")).click();
	 driver.findElement(By.xpath("//input[@id='lst-ib']")).clear();
		//e.sendKeys("Selenium");
		driver.quit();
	}
}
