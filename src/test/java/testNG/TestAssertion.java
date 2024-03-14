package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class TestAssertion {
	
	int a=10;
	int b=20;
	@Test
	void validation() {
		//hard assert
		Assert.assertEquals(a,b);
		System.out.println("test is failed");
		//Soft assert
		//SoftAssert sa=new SoftAssert();
		//sa.assertEquals(a, b);
		//sa.assertAll();
	/*if(a==b) {
		System.out.println("test is passed");
	}else {
		System.out.println("test is failed");
	}*/
	}

}
