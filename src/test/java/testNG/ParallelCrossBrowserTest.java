package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.*;

public class ParallelCrossBrowserTest {
	
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	void setup(String br) {
		//setting the  multiple browsers
		if(br.equals("chrome")) {
		driver = new ChromeDriver();
		}else {
		driver=new EdgeDriver();
		}
	}
	@Test(priority=1)
	@Parameters("url")
	void launch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(priority=2)
	@Parameters({"uname","pwd"})
	void login(String uname, String pwd) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@AfterClass
	void close() {
		driver.quit();
	}

}
