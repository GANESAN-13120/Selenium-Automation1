package com.Locators1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selinium_Automation\\Chrome_Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        
        String title = driver.getTitle();
        System.out.println(title);
        
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("sganesh13120@gmail.com");
        
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("sg1251996");
        
        WebElement login = driver.findElement(By.name("login"));
        login.click();
        
	}

}
