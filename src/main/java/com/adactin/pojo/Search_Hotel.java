package com.adactin.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	WebDriver driver;
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement roomtype;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement no_of_rooms;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement room_adult;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement room_child;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement search;

	public Search_Hotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNo_of_rooms() {
		return no_of_rooms;
	}

	public WebElement getRoom_adult() {
		return room_adult;
	}

	public WebElement getRoom_child() {
		return room_child;
	}

	public WebElement getSearch() {
		return search;
	}
	

}
