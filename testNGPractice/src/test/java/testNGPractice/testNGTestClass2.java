package testNGPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGTestClass2 {
	
	@BeforeSuite
	public void beforeSuite2() {
		System.out.println("Before Suite2");
	}
	@AfterSuite
	public void afterSuite2() {
		System.out.println("After Suite2");
	}
	@BeforeTest
	public void beforeTest2() {
		System.out.println("Before Test2");
	}
	@AfterTest
	public void afterTest2() {
		System.out.println("After Test2");
	}
	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("Before Method2");
	}
	@AfterMethod
	public void afterMethod2() {
		System.out.println("After Method2");
	}
@Test ( groups = {"1stTest"} )
public void test1 () {
	System.out.println("First Testcase_1");
}

@Test	
public void test2 () {
	System.out.println("Second Testcase_1");
}
}
