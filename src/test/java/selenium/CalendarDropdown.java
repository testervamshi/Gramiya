package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		int day=2;
		
		driver.findElement(By.id("fourth_date_picker")).click();
		Select month=new Select(driver.findElement(By.className("ui-datepicker-month")));
		month.selectByVisibleText("Jul");
		
		Select year=new Select(driver.findElement(By.className("ui-datepicker-year")));
		year.selectByVisibleText("2029");
		
		//driver.findElement(By.xpath("//a[text()="+day+"]")).click();
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()="+day+"]")).click();

	}

}

//table[@class='ui-datepicker-calendar']//td[not(contains(@class,' ui-datepicker-other-month '))]//a[text()=]
