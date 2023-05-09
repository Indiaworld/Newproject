package com.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.Base_Class1;

public class Runner_Class1 extends Base_Class1 {
	public static WebDriver driver;

	public static void main(String[] args) {
		driver= Base_Class1.browser_launch("chrome");
		//driver= browser_launch("chrome");
		//driver= new ChromeDriver();
		url(driver, "https://www.facebook.com/");
		window_maximize(driver);
		System.out.println("Test1");
		System.out.println("Test2");

	}

}
