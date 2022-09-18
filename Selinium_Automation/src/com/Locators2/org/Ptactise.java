package com.Locators2.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ptactise {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selinium_Automation\\Chrome_Driver\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		WebElement mail = driver.findElement(By.name("email"));
		mail.sendKeys("sganesh13120@gmail.com");
		
		boolean enabled = mail.isEnabled();
		System.out.println(enabled);
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("ssg12051996");
		
		boolean displayed = password.isDisplayed();
		System.out.println(displayed);
		
		WebElement login = driver.findElement(By.name("login"));
	    login.click();
	    
	    driver.close();
		
		
		
	}

}
