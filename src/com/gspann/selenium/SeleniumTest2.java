package com.gspann.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumTest2 {
@Test

public void test2(){
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Toolsqa");
	driver.findElement(By.xpath("//a[text()='TOOLSQA | Free QA Automation Tools Tutorials']")).click();
	driver.findElement(By.xpath("//span[text()='TRAININGS']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[text()='Selenium Training']")).click();
	}
}
