package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaySongYoutube {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement SearchBox = driver.findElement(By.xpath("//input[@id='search']"));
        SearchBox.sendKeys("aii jagdambka kadamka kadamka");
       
       
       
       
       
	}

}
