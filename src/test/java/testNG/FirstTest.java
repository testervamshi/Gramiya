package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
	
	public WebDriver driver;
	@Test(priority=1)
	void openApp() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	@Test(priority=5)
	void close() {
		driver.quit();
	}
	//openapp,login,logout,close
	

}
