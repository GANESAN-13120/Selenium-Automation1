package com.X_Path.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise {
public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\iSHIELD\\eclipse-workspace\\Selinium_Automation\\Chrome_Driver\\chromedriver.exe ");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		 System.out.println(currentUrl);
		
		driver.manage().window().maximize();
		
		WebElement cna = driver.findElement(By.xpath("//a [@data-testid='open-registration-form-button'] "));
		cna.click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname'] ")).sendKeys("GANESAN");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SUBBAIAH");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("7868830304");
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("g1234");
		
		Thread.sleep(3000);
		
		driver.close();
		

}
}