package com.adactin.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_Page {
	
public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='my_itinerary']")
	private WebElement myitinery;

	public Confirmation_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	
	}

	

	public WebElement getMyitinery() {
		return myitinery;
	}
	

}
