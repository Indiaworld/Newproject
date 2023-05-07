Feature: Validate A Hotel Booking Fucntionality In Adactin Hotel Application
@Adactin1
Scenario Outline: Login Page
Given user Launch The Adactin Url
When user Enter The "<Username>" In The Username Field
And user Enter The "<Password>" In The Password Field
Then user Click The Login button And It Navigate To Search Hotel



    Examples:
      |Username|Password|
      |hello|34567|
      |siva|7654|
      |Sivasankari1|India@2020|

@Adactin2
Scenario: Search Hotel
When user Select The "Sydney" In The Location Dropdown
And user Select The "Hotel Creek" In The Select Hotel Dropdown
And user Select The "Double" In The Roomtype Dropdown
And user Select "2 - Two" In The Number Of Rooms Dropdown
And user Enter The "13/11/2022" In The Check In Date Field
And user Enter The "14/11/2022" In The Check Out Date Field
And user Select The "3 - Three" In The Adults Per Room Field
And user Select The "1 - One" In The Children Per Room Field
Then user Click The Search button And Its Navigate To Select Hotel

@Adactin3
Scenario: Select Hotel
When user Select The Hotel In Select Hotel Radio button 
Then user Click The Continue button And Its Navigate To Book A Hotel

@Adactin4
Scenario: Book A Hotel
When user Enter The "Sivasankari" In The Firstname Field
And user Enter The "Sekar" In The Lastname Field
And user Enter The "Bandharahalli,Karimangalam,Dharmapuri" In The Billing Address Field
And user Enter The "1234567890123455" In The Credit Card Number Field
And user Select The "VISA" In The Credit Card Type Dropdown
And user Select The "April" In The Month And "2022" Dropdown
And user Enter The "234" In The Cvv Number Field
Then user Click The Book Hotel button And Its Naviagte To Booking Confirmation 

@Adactin5
Scenario: Booking Confirmation
Then user Click The My Itinerary button And Its Navigate To Booked Itinerary

@Adactin6
Scenario: Booked Itinerary
When user Select Hotel In The Booked Itinerary
And user Click Cancel Selected button
And user Click Ok button In The AlertBox

 
