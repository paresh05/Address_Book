package com.bridgelabzd12;  
import java.util.*;  

/* Class Contact
 * This class is used to initialize the contact information of a person 
 * The information cannot be accessed in another class since they are made private 
 * Hence using getters and setters the information can be accessed in main class*/

class Contact
{
	 private String firstName;
	 private String lastName;
	 private String address;
	 private String city;
	 private String state;
	 private String zipCode;
	 private String phoneNumber;
	 private String email;
	 
	 Contact(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String email)
	 {
		 this.firstName=firstName;
		 this.lastName=lastName;
		 this.address=address;
		 this.city=city;
		 this.state=state;
		 this.zipCode=zipCode;
		 this.phoneNumber=phoneNumber;
		 this.email=email;
	 }
	 
	 	public String getFirstName() {
	 		return firstName;
		}

	    public void setFirstName(String firstName) {
	    	this.firstName = firstName;
	    }
		 
	    public String getLastName() {
	    	return lastName;
	 	 }

		 public void setLastName(String lastName) {
			 this.lastName = lastName;
		 }
		 
		 public String getAddress() {
			 return address;
		 }

		 public void setAddress(String address) {
			 this.address = address;
		 }
		 
		 public String getCity() {
			 return city;
		 }

		 public void setCity(String city) {
			 this.city = city;
			 }
		 public String getState() {
				 return state;
			 }

		 public void setState(String state) {
			 this.state = state;
		 }
		 public String getZipCode() {
			 return zipCode;
		 }

		 public void setZipCode(String zipCode) {
			 this.zipCode = zipCode;
	     }
		 public String getPhoneNumber() {
			 return phoneNumber;
		 }

		 public void setPhoneNumber(String phoneNumber) {
			 this.phoneNumber = phoneNumber; 
		 } 
		 
		 public String getEmail() {
			 return email;
		 }

		 public void setEmail(String email) {
			 this.email = email; 
		 } 	 	
}
public class AddressBook {

	public static void main(String[] args) {
			System.out.println("Welcome to Address Book");
			Scanner sc = new Scanner(System.in);  
			System.out.println("Enter First Name");
			String firstName=sc.nextLine();
			System.out.println("Enter Last Name");
			String lastName=sc.nextLine();
			System.out.println("Enter Address");
			String address=sc.nextLine();
			System.out.println("Enter city");
			String city=sc.nextLine();
			System.out.println("Enter state");
			String state=sc.nextLine();
			System.out.println("Enter zip code");
			String zipCode=sc.nextLine();
			System.out.println("Enter Phone Number");
			String phoneNumber=sc.nextLine();
			System.out.println("Enter Email");
			String email=sc.nextLine();
			
			// Object Creation
			Contact obj = new Contact(firstName, lastName, address, city,state,  zipCode, phoneNumber,email);
			System.out.println("First Name: "+obj.getFirstName());
			System.out.println("Last Name: "+obj.getLastName());
			System.out.println("Address: "+obj.getAddress());
			System.out.println("City: "+obj.getCity());
			System.out.println("State "+obj.getState());
			System.out.println("Zip Code "+obj.getZipCode());
			System.out.println("Phone Number"+obj.getPhoneNumber());
			System.out.println("Email: "+obj.getEmail());
	}

}
