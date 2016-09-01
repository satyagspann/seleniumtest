package com.gspann.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class SeleniumTest1 {
	@Test
	public void test1() throws IOException{
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","F:/Software/chromedriver.exe/");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//a[text()='Downloads - Selenium']")).click();
		driver.findElement(By.xpath("//li[@id='menu_download']")).click();
		File sFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		  FileUtils.copyFile(sFile, new File("E:/image.jpg"));
		  driver.quit();
	}


}
