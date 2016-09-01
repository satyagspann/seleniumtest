package com.gspann.pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Configuration;
import org.testng.annotations.Parameters;

public class AppBasePage {
	public WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	@Configuration
	public void setUp(String browser){
		if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:/Software/chromedriver.exe/");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		
	}
}
