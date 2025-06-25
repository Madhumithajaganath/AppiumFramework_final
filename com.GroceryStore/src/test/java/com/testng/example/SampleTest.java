package com.testng.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public static void demo() {
		System.out.println("From Test1");
	}
	
	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("From BM");
	}
	
	@AfterMethod
	public static void afterMethod() {
		System.out.println("From AM");
	}
	
	@Test
	public static void demo1() {
		System.out.println("From Test2");
	}
	
	@Test
	public static void demo2() {
		System.out.println("From Test3");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("From BC");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("From AC");
	}
	
	@AfterSuite
	public static void afterSuite() {
		System.out.println("From AS");
	}
	
	@BeforeSuite
	public static void beforeSuite() {
		System.out.println("From BS");
	}
}
