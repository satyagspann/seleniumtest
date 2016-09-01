package com.gspann.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ComposingEmailTest {
	
	@Test
	
	public void test1(){
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/");
		
		//Login
	    driver.findElement(By.id("Email")).sendKeys("techsatya09@gmail.com");
	    driver.findElement(By.xpath("//*[@id='next']")).click();
	    driver.findElement(By.id("Passwd")).sendKeys("satya@cool");
	    driver.findElement(By.id("signIn")).click();
	    
	    //click on Compose button
	    driver.findElement(By.xpath("//div[contains(text(),'COMPOSE')]")).click();
	    driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("satya.prakash@gspann.com");
	    driver.findElement(By.name("subjectbox")).sendKeys("Test Mail");
	    
	    //To write Message
	    
	    driver.findElement(By.xpath("//div[@class= 'Am Al editable LW-avf']")).sendKeys("Hi !This is my first email using selenium webdriver.");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    //click Send button
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	  
	    driver.quit();
	}
}