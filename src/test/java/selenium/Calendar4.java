package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		int day =28;
		String month="February 2021";
		
		
		WebElement ele=driver.findElement(By.id("sixth_date_picker"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
		//Calendar to select past date
		driver.findElement(By.id("first_date_picker")).click();
		
		while(true) {
			String currentmonth=driver.findElement(By.className("ui-datepicker-title")).getText();
			if(currentmonth.equals(month)) {
				break;
			}else {
				driver.findElement(By.className("ui-datepicker-prev")).click();//click on prev button and compare with expected month
			}
		}
		driver.findElement(By.xpath("//a[text()="+day+"]")).click();//select the date

	}

}
