package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarr {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		int day =28;
		
		//calendar 6 by sendkeys method
		WebElement cal6=driver.findElement(By.id("sixth_date_picker"));
		cal6.sendKeys("02/16/2024");
		
		//Calendar to select current month date
		driver.findElement(By.id("first_date_picker")).click();
		driver.findElement(By.xpath("//a[text()="+day+"]")).click();
		
		//Calendar with previous and future month dates with current month
		driver.findElement(By.id("second_date_picker")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+day+"]")).click();

	}

}
