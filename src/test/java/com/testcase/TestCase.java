 package com.testcase;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectclass.AddtoCart;
import PageObjectclass.Searchbar;

public class TestCase {

	String URL="https://www.flipkart.com/";
	public static WebElement element=null;
	public static WebDriver driver;
	public double TotalPrice;
	
	@BeforeTest
	public WebDriver setUpDriver() throws InterruptedException
	{
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get(URL);
	     driver.manage().window().maximize();
	     return driver;
	}
	@Test()
	public void searchitem() throws InterruptedException
	{
		Searchbar sc=new Searchbar(driver);
		String getSearchpage=sc.selectElement();
		System.out.print(getSearchpage);
		
		//Assert.assertEquals(getSearchpage, "Iphone 15- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
	}
	
	
	
	@Test(dependsOnMethods = {"searchitem"})
	public void addToCart() throws InterruptedException {
	    AddtoCart ad = new AddtoCart(driver);
	     ad.additem();
	}
	
	
}
