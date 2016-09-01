package com.gspann.selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
@Test
public void t1() throws MalformedURLException{
	DesiredCapabilities cap = new DesiredCapabilities();
	System.setProperty("webdriver.chrome.driver","F:/Software/chromedriver.exe");
	cap.setBrowserName(BrowserType.CHROME);
	cap.setVersion("52.0");
	cap.setPlatform(Platform.WINDOWS);
	
	//WebDriver driver = new ChromeDriver();
	//WebDriver driver = new FirefoxDriver();
	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	driver.get("https://www.google.co.in/");
}
}
