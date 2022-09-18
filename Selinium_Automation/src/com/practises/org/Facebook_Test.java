package com.practises.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Test {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selinium_Automation\\Chrome_Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		 
		driver.get("https://www.facebook.com/"); 
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		String title = driver.getTitle();
		System.out.println(title);
		//navigate method
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().to("https://www.flipkart.com/");
		//back
		driver.navigate().back();
		//forward
		driver.navigate().forward();
		//refresh
		driver.navigate().refresh();
		//close
		driver.close();
		//quit
		driver.quit();
		
		
		
	}

}
