package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformTask {

	     public static void main(String[] args) {
	    	 WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			//Switch To Product Page
			 String currentWindowHandle= driver.getWindowHandle();
			 //Locate saucelab link
			 driver.switchTo().window(currentWindowHandle);
			 
			 driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();
			 driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();

	}

}
