package com.testng.example;

import org.testng.annotations.Test;

import Utilities.BaseClass;

public class BatchTest2 {

	@Test(groups = "smoke")
	public static void demo1() throws InterruptedException {
		Thread.sleep(100000);
		System.out.println("From demo1 --> smoke suit");
	}
	
	@Test(groups = "regression")
	public static void demo2() throws InterruptedException {
		Thread.sleep(100000);
		System.out.println("From demo2 --> regression suit");
	}
	
	
}
