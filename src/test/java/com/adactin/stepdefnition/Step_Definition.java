package com.adactin.stepdefnition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.adactin.pojo.Book_Now_Page;
import com.adactin.pojo.Confirmation_Page;
import com.adactin.pojo.Login_Page;
import com.adactin.pojo.Logout_Page;
import com.adactin.pojo.Search_Hotel;
import com.adactin.pojo.Select_Hotel;
import com.base.Base_Class1;
import com.cucu.runner.Runner_Class;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definition extends Base_Class1 {
	public static WebDriver driver= Runner_Class.driver;
	public static Login_Page login=new Login_Page(driver);
	public static Search_Hotel search=new Search_Hotel(driver);
	public static Select_Hotel select=new Select_Hotel(driver);
	public static Book_Now_Page book=new Book_Now_Page(driver);
	public static Confirmation_Page confirm=new Confirmation_Page(driver);
	public static Logout_Page logout=new Logout_Page(driver);
	
	//login page
	
	
	@Given("user Launch The Adactin Url")
	public void user_launch_the_adactin_url() {
	    url(driver, "http://adactinhotelapp.com/index.php");
	}
	@When("user Enter The {string} In The Username Field")
	public void user_enter_the_in_the_username_field(String string) {
		sendkeys(login.getUsername(), string);
	}
	@When("user Enter The {string} In The Password Field")
	public void user_enter_the_in_the_password_field(String string) {
		sendkeys(login.getPassword(), string);
	}
	@Then("user Click The Login button And It Navigate To Search Hotel")
	public void user_click_the_login_button_and_it_navigate_to_search_hotel() {
	    click(login.getLogin_btn());
	}
	   
	
	
	//search hotel page
	
	@When("user Select The {string} In The Location Dropdown")
	
	public void user_select_the_in_the_location_dropdown(String string) {
		select_visible_text(search.getLocation(), "Sydney");
	   
	}
	@When("user Select The {string} In The Select Hotel Dropdown")
	public void user_select_the_in_the_select_hotel_dropdown(String string) {
		select_visible_text(search.getHotel(), "Hotel Creek");
		
	  
	}
	@When("user Select The {string} In The Roomtype Dropdown")
	public void user_select_the_in_the_roomtype_dropdown(String string) {
		select_visible_text(search.getRoomtype(), "Standard");
	   
	}
	@When("user Select {string} In The Number Of Rooms Dropdown")
	public void user_select_in_the_number_of_rooms_dropdown(String string) {
		select_visible_text(search.getNo_of_rooms(), "2 - Two");
	    
	}
	@When("user Enter The {string} In The Check In Date Field")
	public void user_enter_the_in_the_check_in_date_field(String string) {
	    
	}
	@When("user Enter The {string} In The Check Out Date Field")
	public void user_enter_the_in_the_check_out_date_field(String string) {
	    
	}
	@When("user Select The {string} In The Adults Per Room Field")
	public void user_select_the_in_the_adults_per_room_field(String string) {
		select_visible_text(search.getRoom_adult(), "2 - Two");
	    
	}
	@When("user Select The {string} In The Children Per Room Field")
	public void user_select_the_in_the_children_per_room_field(String string) {
		select_visible_text(search.getRoom_child(), "0 - None");
	    
	}
	@Then("user Click The Search button And Its Navigate To Select Hotel")
	public void user_click_the_search_button_and_its_navigate_to_select_hotel() {
	   click(search.getSearch());
	}
	
	
	
	//select hotel page
	
	@When("user Select The Hotel In Select Hotel Radio button")
	public void user_select_the_hotel_in_select_hotel_radio_button() {
		click(select.getSelethotel());

	
	}
	@Then("user Click The Continue button And Its Navigate To Book A Hotel")
	public void user_click_the_continue_button_and_its_navigate_to_book_a_hotel() {
		click(select.getContinu());
	
	}
	
	//book now page

	@When("user Enter The {string} In The Firstname Field")
	public void user_enter_the_in_the_firstname_field(String string) {
		sendkeys(book.getFirstname(), "Sivasankari");
		
	}
	    
	@When("user Enter The {string} In The Lastname Field")
	public void user_enter_the_in_the_lastname_field(String string) {
		sendkeys(book.getLastname(), "Sekar");
	    
	}
	@When("user Enter The {string} In The Billing Address Field")
	public void user_enter_the_in_the_billing_address_field(String string) {
		sendkeys(book.getAddress(), "Bandharahalli,Karimangalam Taluk,Dharmapuri Dt.");
	    
	}
	@When("user Enter The {string} In The Credit Card Number Field")
	public void user_enter_the_in_the_credit_card_number_field(String string) {
		sendkeys(book.getCc_number(), "1234567890123456");
	    
	}
	@When("user Select The {string} In The Credit Card Type Dropdown")
	public void user_select_the_in_the_credit_card_type_dropdown(String string) {
	    select_visible_text(book.getCardtype(), "VISA");
	}
	@When("user Select The {string} In The Month And {string} Dropdown")
	public void user_select_the_in_the_month_and_dropdown(String string, String string2) {
	    select_visible_text(book.getMonth(), "May");
	    select_visible_text(book.getYear(), "2022");
	}
	@When("user Enter The {string} In The Cvv Number Field")
	public void user_enter_the_in_the_cvv_number_field(String string) {
		sendkeys(book.getCvv(), "345");
		
	    
	}
    @Then("user Click The Book Hotel button And Its Naviagte To Booking Confirmation")
	public void user_click_the_book_hotel_button_and_its_naviagte_to_booking_confirmation() {
	   click(book.getBook_now());
	}
	
    //confirmation page

	@Then("user Click The My Itinerary button And Its Navigate To Booked Itinerary")
	public void user_click_the_my_itinerary_button_and_its_navigate_to_booked_itinerary() {
		click(confirm.getMyitinery());
	   
	}

	@When("user Select Hotel In The Booked Itinerary")
	public void user_select_hotel_in_the_booked_itinerary() {
		click(logout.getSelect1());
	    
	}
	@When("user Click Cancel Selected button")
	public void user_click_cancel_selected_button() {
		click(logout.getCancel());
	    
	}
	@When("user Click Ok button In The AlertBox")
	public void user_click_ok_button_in_the_alert_box() {
		alert_accept(driver);
	   
	}
	





}
