package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToFacebook {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
        username.sendKeys("nis.kumar555@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("Nitesh@2");
        WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
        button.click();
        WebElement con = driver.findElement(By.xpath("//button[@value='1']"));
        con.click();
        WebElement OTP = driver.findElement(By.id("recovery_code_entry"));
        OTP.sendKeys("024356");
        
	}

}
