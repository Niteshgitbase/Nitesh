package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCrendtial {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	WebElement Username = driver.findElement(By.xpath("//input[@name='username']"));
    Username.sendKeys("student");
    WebElement password = driver.findElement(By.name("password"));
    password.sendKeys("Password123");
    driver.findElement(By.xpath("//button[text()='Submit']")).click();
    driver.findElement(By.xpath("//a[text()='Log out']")).click();
    
 
   
    
	}

}
