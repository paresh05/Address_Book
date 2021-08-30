package com.bridgelabzd12;  
import java.util.*;  
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
			ContactInfo obj = new ContactInfo(firstName, lastName, address, city,state,  zipCode, phoneNumber,email);
			obj.print();
			edit(firstName,lastName,address,city,state,zipCode,phoneNumber,email);//Function call to edit function
	}
	
	/* Function Edit
	 * This function is used to edit the information entered by the user*/
	public static void edit(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String email)
	{
		ContactInfo obj = new ContactInfo(firstName, lastName, address, city,state,  zipCode, phoneNumber,email);
		System.out.println("Which information do you want to edit");
		Scanner sc = new Scanner(System.in);  
		String editInfo=sc.nextLine().toLowerCase();
		System.out.println(editInfo);
		if(editInfo.equals("first name")) {
			System.out.println("Re-enter the First Name");
			obj.setFirstName(sc.nextLine());
		}
		else if(editInfo.equals("last name")) {
			System.out.println("Re-enter the Last Name");
			obj.setLastName(sc.nextLine());
		}
		else if(editInfo.equals("address")) {
			System.out.println("Re-enter the address");
			obj.setAddress(sc.nextLine());
		}
		else if(editInfo.equals("city")) {
			System.out.println("Re-enter the city");
			obj.setCity(sc.nextLine());
		}
		else if(editInfo.equals("state")) {
			System.out.println("Re-enter the state");
			obj.setState(sc.nextLine());
		}
		else if(editInfo.equals("zip code")) {
			System.out.println("Re-enter the Zip Code");
			obj.setZipCode(sc.nextLine());
		}
		else if(editInfo.equals("phone number")) {
			System.out.println("Re-enter the Phone number");
			obj.setPhoneNumber(sc.nextLine());
		}
		else if(editInfo.equals("email")) {
			System.out.println("Re-enter the Email");
			obj.setEmail(sc.nextLine());
		}
		// Printing the edited function
		obj.print();
	}
}
