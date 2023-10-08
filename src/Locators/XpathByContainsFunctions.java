package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsFunctions {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");
			WebElement textbox = driver.findElement(By.xpath("//p[contains(text(),'If you want to create robust, browser-based regressio')]"));
            
	}

}
