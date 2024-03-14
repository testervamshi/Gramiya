package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Class2 {
	@Test(priority=2)
	void addproduct() {
		System.out.println("addproduct");
	}
	@Test(priority=1)
	void search() {
		System.out.println("search");
	}

}
