package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/");
		driver.manage().window().maximize();
		
		WebElement date=driver.findElement(By.name("bdaytime"));
		//first enter date
		date.sendKeys("02122024");
		//click on tab on keyboard
		date.sendKeys(Keys.TAB);
		//enter time
		date.sendKeys("1255PM");
	}

}
