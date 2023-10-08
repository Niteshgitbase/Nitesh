package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Nitish/Desktop/xpath.html");
			WebElement textbox = driver.findElement(By.xpath("html/body/div[1]/input[2]"));
			textbox.sendKeys("Qspider");

	}

}

