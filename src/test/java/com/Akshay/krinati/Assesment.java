package com.Akshay.krinati;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assesment {
	public static WebDriver driver;
	public static WebDriver driver1;
	public String date1;
	public String country1;
	public String date2;
	public String country2;


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\software\\eclipse\\c\\workpace\\krinati\\WebDriver2\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		System.out.println(driver.getTitle());
		tearDown();
      
	}
	
	
	public static void tearDown() {
		driver.close();
		}
}