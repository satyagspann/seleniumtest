package com.gspann.selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.excel.gspann.ExcelTest;

public class SeleniumIrctTest extends ExcelTest{
	WebDriver driver;
    @Parameters ("browser")
	@Test
	public void  test1(String browser) throws InterruptedException{
    	
		if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
	} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"F:/Software/chromedriver.exe/");
		driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));*/
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/");
		Thread.sleep(3000);
		String handle = driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@id='bluemenu']/ul/li[6]/a")).click();
		Thread.sleep(6000);
		Set<String> allwin = driver.getWindowHandles();
		for(String s : allwin){
			if(s.equals(handle)== false){
				driver.switchTo().window(s);
				break;
			}
		}
		
	    driver.findElement(By.xpath("//input[@id='origin']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//*[@id='ui-active-menuitem']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Patna");
		driver.findElement(By.xpath("//*[@id='ui-active-menuitem']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id='where']/div[4]/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ui-datepicker-div")).click(); 
		driver.findElement(By.linkText("28")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//select[@id='noOfAdult']")).click();
		Thread.sleep(5);
		driver.findElement(By.xpath("//select[@id='noOfAdult']/option[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//select[@id='noOfChild']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//select[@id='noOfChild']/option[3]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//select[@id='noOfInfant']")).click();
		driver.findElement(By.xpath("//select[@id='noOfInfant']/option[2]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//select[@id='classType']")).click();
		driver.findElement(By.xpath("//select[@id='classType']/option[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='srchbtn']")).click();
		String str = driver.findElement(By.xpath("//div[@id='or_price_bg_stk']")).getText();
		System.out.println(str);
		List <WebElement> allSizes = driver.findElements(By.xpath("//div[@class='onewayflightinfo']"));		   
		System.out.println("Total Number of flights :" +allSizes.size());
		
		driver.quit();
	}
}

