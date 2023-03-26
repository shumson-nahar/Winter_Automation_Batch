package practice_testNG;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class My_First_TestNG {
	@BeforeSuite
	public void beforeSuiteAnnotation() {
	System.out.println("This is Before Suite");
	}

	@BeforeTest
	public void beforeTestAnnotation() {
	System.out.println("This is Before Test");
	}

	@BeforeClass
	public void beforeClassAnnotation() {
	System.out.println("This is Before Class");
	}

	@BeforeMethod
	public void beforeMethodAnnotation() {
	System.out.println("This is Before Method");
	}

	@Test
	public void testCase1Annotation() {
	System.out.println("This is TestCase1");
	}

	@Test
	public void testCase2Annotation() {
	System.out.println("This is TestCase2");
	}

	@AfterMethod
	public void afterMethodAnnotation() {
	System.out.println("This is After Method");
	}

	@AfterClass
	public void afterClassAnnotation() {
	System.out.println("This is After Class");
	}

	@AfterTest
	public void afterTestAnnotation() {
	System.out.println("This is After Test");
	}

	@AfterSuite
	public void afterSuiteAnnotation() {
	System.out.println("This is After Suite");
	}

}
