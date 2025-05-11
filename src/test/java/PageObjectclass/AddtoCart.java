package PageObjectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;
public class AddtoCart {
	WebDriver driver;
	public AddtoCart(WebDriver driver)
	{
		this.driver=driver;
	}
	public void additem() 
	{
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		    WebElement iPhoneElement = wait.until(ExpectedConditions.elementToBeClickable(
		        By.xpath("(//div[text()='Apple iPhone 15 (Black, 128 GB)'])[1]")
		    ));
		    iPhoneElement.click();
		  
		//nt6sNV JxFEK3 _48O0EI
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	
		//Actions ac=new Actions(driver);
		
		//System.out.println("Hi I am not able to find the element");
		
		//Boolean ans=driver.findElement(By.xpath("(//div[text()='Apple iPhone 15 (Black, 128 GB)'])[1]")).isDisplayed();
		//System.out.print(ans);
		/*
		WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("")
			));
		ac.moveToElement(ele).click().build().perform();
		*/

		
		
		
		
		String originalwindow=driver.getWindowHandle();
		Set<String>allwindow=driver.getWindowHandles();
		for(String window:allwindow)
		{
			if(!window.equals(originalwindow))
			{
				driver.switchTo().window(window);
				break;
			}
		}
		System.out.println("Title of new page: " + driver.getTitle());
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")).click();
		System.out.println("Title of new page: " + driver.getTitle());
	
	}
}
