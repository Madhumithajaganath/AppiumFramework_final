package com.testng.example;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class BatchTest1 {
	
	@Test (groups = "regression")
	public static void test1() {
		System.out.println("From Test1--> regression suit");
	}
	
	@Test(groups = {"smoke","regression"})
	public static void test2() {
		System.out.println("From Test2 --> smoke suit");
	}
	
	@Test(groups = "regression")
	public static void test3() {
//		System.out.println("From Test3--> regression suit");
	}
}
