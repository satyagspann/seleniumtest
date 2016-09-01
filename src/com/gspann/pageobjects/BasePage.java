package com.gspann.pageobjects;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class BasePage {
 WebDriver driver;
 public BasePage(WebDriver driver) {
	}

	public void switchWindow(){
		String handle = driver.getWindowHandle();
		Set<String> allwin = driver.getWindowHandles();
		for(String s : allwin){
			if(s.equals(handle)== false){
				driver.switchTo().window(s);
				break;

			}
		}
	}
}
	