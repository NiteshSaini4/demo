package com.Ec_project.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginClass 
{
	

	public static void main(String[] args)
	{
		//driver integration
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\Demo\\Ec_project\\drivers\\chromedriver.exe");
		
		WebDriver driver=new EdgeDriver();//open chrome browser
		driver.get("https://www.saucedemo.com/");
	
		WebElement username=driver.findElement(By.name("user-name"));//loc+f
		username.sendKeys("standard_user");//actions
		
		
		WebElement password=driver.findElement(By.id("password1233"));
		
		password.sendKeys("secret_sauce");
		
		
		WebElement submit=driver.findElement(By.className("submit-button"));
		
		submit.click();
		
		WebElement link =driver.findElement(By.partialLinkText("Sauce Labs Backpa"));
		link.click();

	}

}
//By.id()
//By.name();
//By.className();
//By.linkText();
//By.partialLinkText();
