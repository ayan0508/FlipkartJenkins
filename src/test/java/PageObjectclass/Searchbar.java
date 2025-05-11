package PageObjectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searchbar {

	WebDriver driver;
	public Searchbar(WebDriver driver)
	{
		this.driver=driver;
	}
	public String selectElement() 
	{
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 15");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
	/*List<WebElement> searchlist= wait.until(
			    ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//li[@class='_3D0G9a']/div/a/div[2]"))
			);
		
		//searchlist.forEach(ele->{String txt=ele.getText().replace("\n", " ");String[] words=txt.split(" ");System.out.println(words[0] + " " + words[1]);});
		
		/*
		searchlist.forEach(ele -> {
		    String txt = ele.getText().replace("\n", " ");
		    String[] words=txt.split(" ");
		    System.out.println(words[0]+words[1]);
		}); 

		*/
		
		
		//searchlist.stream().filter(ele->ele.getText().replace("\n", " ").equalsIgnoreCase("iphone 16")).findFirst().ifPresent(ele->{System.out.println(ele.getText());ele.click();});
		
		/*
		searchlist.stream().filter(ele->{String txt=ele.getText().replace("\n", " ").trim();
		String[] words=txt.split(" ");
		return words.length>=2&&(words[0] + " " + words[1]).equalsIgnoreCase("iphone 15");
		}).findFirst().ifPresent(ele->{System.out.println(ele.getText());ele.click();});
		
		
		*/
		return driver.getTitle();
		
	}
}
