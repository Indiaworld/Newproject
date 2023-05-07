package com.adactin.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Now_Page {
public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement cc_number;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement cardtype;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement month;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement year;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement book_now;
	
	public Book_Now_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_number() {
		return cc_number;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}
	
	
	


}
