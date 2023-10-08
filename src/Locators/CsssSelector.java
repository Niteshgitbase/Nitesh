package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsssSelector {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement language = driver.findElement(By.cssSelector("div[id='SIvCob']"));
        String googleLanguage = language.getText();
        System.out.println(googleLanguage);
	}

}
