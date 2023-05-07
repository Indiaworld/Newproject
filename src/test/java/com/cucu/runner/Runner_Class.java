package com.cucu.runner;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.base.Base_Class1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.internal.com.fasterxml.jackson.databind.deser.Deserializers.Base;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue = "com.adactin.stepdefnition",
monochrome = true,
dryRun = false,
publish = true,
plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		} 
)

public class Runner_Class {
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		driver=Base_Class1.browser_launch("chrome");
		driver.manage().window().maximize();
		Base_Class1.implicitwait(driver);
	}
	
	@AfterClass
	public static void end() {
		driver.quit();
	}

}
