package com.testng.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DummyTest {

	@Test
	public void dummy() {
		System.out.println("From dummy");
	}
	
	@BeforeMethod
	public static void beforeMethod() {
		System.out.println("From dummy BM");
	}
	
	@AfterMethod
	public static void afterMethod() {
		System.out.println("From dummy AM");
	}

	@BeforeClass
	public static void beforeClass() {
		System.out.println("From dummy BC");
	}
		
	@AfterClass
	public static void afterClass() {
		System.out.println("From dummy AC");
	}
	
	@Test
	public void dummy1() throws Exception {
		System.out.println("From dummy1");
	}
	
	@Test
	public void dummy2() throws Exception {
		System.out.println("From dummy2");
	}
	
	
}
