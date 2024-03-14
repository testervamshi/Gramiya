package testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestCase1 {
	@Test(priority=1)
	void test1() {
		//this is pass method
		Assert.assertTrue(true);
	}
	@Test(priority=2)
	void test2() {
		//this is failed method
		Assert.assertTrue(false);
	}
	@Test(priority=3,dependsOnMethods="test2")
	void test3() {
		//this is skipped method
	}

}
