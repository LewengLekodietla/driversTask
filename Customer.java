package CompulsoryTask2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Customer extends Person {

	//Object attributes
	String customerContactNumber;
	String customerAddress;
	String emailAddressCustomer;
	String restaurantName;
	String locationRestaurant;
	String restaurantContactNumber;
	int mealOptionQuantity;
	String mealOption;
	int mealOptionPrice;
	String mealOptionInstructions;
	int totalMealPricePayable;

	//The 'Customer' class constructor
	public Customer(String firstName, String lastName, String cityLocation, String orderNumber, String customerContactNumber, String customerAddress, String emailAddressCustomer, String restaurantName, String locationRestaurant, String restaurantContactNumber,
			int mealOptionQuantity, String mealOption, int mealOptionPrice, String mealOptionInstructions, int totalMealPricePayable){
		
		super(firstName,lastName, cityLocation, orderNumber);

		
		this.customerContactNumber = customerContactNumber;
		this.customerAddress = customerAddress;
		this.emailAddressCustomer = emailAddressCustomer;
		this.restaurantName = restaurantName;
		this.locationRestaurant = locationRestaurant;
		this.restaurantContactNumber = restaurantContactNumber;
		this.mealOptionQuantity = mealOptionQuantity;
		this.mealOption = mealOption;
		this.mealOptionPrice = mealOptionPrice;
		this.mealOptionInstructions = mealOptionInstructions;
		this.totalMealPricePayable = totalMealPricePayable;

	}
	//
	public String getCustomerInvoice() {

		String output = "Order number " + this.orderNumber;
		output += "\nCustomer: " + this.firstName;
		output += " " + this.lastName;
		output += "\nEmail: " + this.emailAddressCustomer;
		output += "\nPhone number: " + this.customerContactNumber;
		output += "\n" + this.customerAddress;
		output += "\nLocation: " + this.cityLocation;
		output += "\nYou have ordered the following from " + this.restaurantName + " in " + this.locationRestaurant + ":";
		output += "\n" + this.mealOptionQuantity + " x" + this.mealOption + " (R" + this.mealOptionPrice + ")";
		output += "\nSpecial instructions: " + this.mealOptionInstructions;
		output += "\nTotal: R" + this.totalMealPricePayable;
		output += "\nIf you need to contact the restaurant, their number is " + this.restaurantContactNumber + ".";

		return output;

	}
	

}
