package com.bridgelabzd12;  
import java.util.*;  
public class AddressBook {
	public static ArrayList <ContactInfo> contactInfo;

	public AddressBook() {
		contactInfo = new ArrayList<ContactInfo>();
	}
	
	/**
	 *This function is used to add contacts to the contactInfo arraylist
	 *@return nothing 
	 */
	public void addContact() {

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

		ContactInfo contact = new ContactInfo(firstName, lastName, address, city,state,  zipCode, phoneNumber,email);
		contactInfo.add(contact);
		System.out.println(contact);
		//edit(firstName,lastName,address,city,state,zipCode,phoneNumber,email);//Function call to edit function
	}
	
	/**
	 *This function is used to delete contacts from the contactInfo arraylist
	 *@return nothing 
	 */
	public void deleteContact() {
		for(int i=0;i<contactInfo.size();i++) {
			Scanner sc = new Scanner(System.in);  
			System.out.println("Enter the name");
			String input=sc.nextLine();
			ContactInfo obj = (ContactInfo)contactInfo.get(i);
			if(input.equals(obj.getFirstName())){
				contactInfo.remove(i);
				System.out.println("Contact Removed");
			}
		}
	}

	/** Function Edit
	 * This function is used to edit the information entered by the user
	 */
	public void edit()
	{
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the name");
		String input=sc.nextLine();
		
		for(int i=0;i<contactInfo.size();i++) {
			
			ContactInfo obj = (ContactInfo)contactInfo.get(i);
			if(input.equals(obj.getFirstName())){

				System.out.println("Which information do you want to edit");
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
				System.out.println(obj);
			}
		}
	}
	
	/**
	 *This function is used to get the choice of operation to be performed from the user
	 *@return nothing 
	 */
	public void choice (AddressBook ab) {
		int choice,exit=0;
		while(exit==0) {
			System.out.println("Enter 1 to add contact, 2 to edit contact, 3 to delete contact, 4 to exit");
			Scanner sc = new Scanner(System.in);  
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				ab.addContact();
				break;
			case 2:
				ab.edit();
				break;
			case 3:
				ab.deleteContact();
				break;
			case 4:
				exit=1;
				break;
			}
		}
		AddressBook.displayContact();
	}
	
	/**
	 *This function is used to display the contacts in the contactInfo arraylist
	 *@return nothing 
	 */
	public static void displayContact() {
		for(ContactInfo element : contactInfo) {
			System.out.println(element);
		}
	}
		
}
