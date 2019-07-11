package testNGPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGTestClass {
	
	@BeforeSuite
	public void beforeSuite1() {
		System.out.println("Before Suite1");
		Reporter.log("hi");
	}
	@AfterSuite
	public void afterSuite1() {
		System.out.println("After Suite1");
		Reporter.log("hi");
	}
	@BeforeTest
	public void beforeTest1() {
		System.out.println("Before Test1");
		Reporter.log("hi");
	}
	@AfterTest
	public void afterTest1() {
		System.out.println("After Test1");
		Reporter.log("hi");
	}
	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("Before Method1");
		Reporter.log("hi");
	}
	@AfterMethod
	public void afterMethod1() {
		System.out.println("After Method1");
	}
	@Parameters ({"x"})
@Test ( groups = {"1stTest"} )
public void test1 (@Optional("optional param") String x) {
	System.out.println("First Testcase " + x);
	Reporter.log("hi");
}

@Test	
public void test2 () {
	System.out.println("Second Testcase");
}
}
