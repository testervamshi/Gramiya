package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@BeforeTest
	void login() {
		System.out.println("login");
	}
	
	@AfterTest
	void logout() {
		System.out.println("logout");
	}

}
