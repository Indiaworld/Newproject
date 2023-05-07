package com.adactin.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Page {
public WebDriver driver;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement select1;
	
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement cancel;
	
	@FindBy(xpath = "(//input[@type='button'])[4]")
	private WebElement logout;

	public Logout_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSelect1() {
		return select1;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	

}
