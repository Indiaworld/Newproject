package com.adactin.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {

public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement selethotel;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continu;
	
	public Select_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelethotel() {
		return selethotel;
	}

	public WebElement getContinu() {
		return continu;
	}




}
