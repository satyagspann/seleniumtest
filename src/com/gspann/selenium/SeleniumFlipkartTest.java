package com.gspann.selenium;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumFlipkartTest {

	@Test
	public void test1() throws InterruptedException, IOException  {
		WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//div[@class='O8ZS_U']//input[@type='text']")).sendKeys("jeans");
		driver.findElement(By.xpath("//div[@class='col-1-12']//button[@type='submit']")).click();
        //Random Click
		Random r = new java.util.Random();
		List <WebElement> allElements = driver.findElements(By.xpath(".//*[@id='products']/div"));
		WebElement randomElement = allElements.get(r.nextInt(allElements.size()));
		randomElement.click();
        List <WebElement> allSizes = driver.findElements(By.xpath("//div[contains(@class,'selector-attr-size')]/div"));		   
		allSizes.get(0).click();
        driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[@class='unitExt tmargin2']/a")).click();
	    String string = driver.findElement(By.xpath("//*[@id='cartpage-cart-tab-content']/div[contains(@class,'cart-activity')]")).getText();
		System.out.println(string);
		Thread.sleep(5000);
		File sFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sFile, new File("E:/image.jpg"));
		
		driver.manage().deleteAllCookies();

		driver.quit();	
   }
}
