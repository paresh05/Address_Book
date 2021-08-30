package com.bridgelabzd12;  
import java.util.*;  
public class AddressBook {
	public static ArrayList<ContactInfo> contactInfo;
	
	public AddressBook() {
		contactInfo = new ArrayList<ContactInfo>();
	}
    private static ContactInfo getPerson(ArrayList<ContactInfo> contactInfo){
        for(int i=0;i<contactInfo.size();){
                return contactInfo.get(i);
        }
        return null;
    }
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
		contact.print();
		//edit(firstName,lastName,address,city,state,zipCode,phoneNumber,email);//Function call to edit function
	}
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
	public static void main(String[] args) {
			System.out.println("Welcome to Address Book");
			AddressBook ab = new AddressBook();
			int choice,exit=0;
			while(exit==0) {
				System.out.println("Enter 1 to add contact, 2 to edit contact, 3 to delete contact, and 4 to exit");
				Scanner sc = new Scanner(System.in);  
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					ab.addContact();
					break;
				case 2:
					ContactInfo personInfo=getPerson(contactInfo);
					ab.edit(personInfo);
					break;
				case 3:
					ab.deleteContact();
					break;
				case 4:
					exit=1;
					break;
				}
			}			
	}
	
	/* Function Edit
	 * This function is used to edit the information entered by the user*/
	public void edit(ContactInfo contact)
	{
		contact.getFirstName();
		System.out.println("Which information do you want to edit");
		Scanner sc = new Scanner(System.in);  
		String editInfo=sc.nextLine().toLowerCase();
		System.out.println(editInfo);
		if(editInfo.equals("first name")) {
			System.out.println("Re-enter the First Name");
			contact.setFirstName(sc.nextLine());
		}
		else if(editInfo.equals("last name")) {
			System.out.println("Re-enter the Last Name");
			contact.setLastName(sc.nextLine());
		}
		else if(editInfo.equals("address")) {
			System.out.println("Re-enter the address");
			contact.setAddress(sc.nextLine());
		}
		else if(editInfo.equals("city")) {
			System.out.println("Re-enter the city");
			contact.setCity(sc.nextLine());
		}
		else if(editInfo.equals("state")) {
			System.out.println("Re-enter the state");
			contact.setState(sc.nextLine());
		}
		else if(editInfo.equals("zip code")) {
			System.out.println("Re-enter the Zip Code");
			contact.setZipCode(sc.nextLine());
		}
		else if(editInfo.equals("phone number")) {
			System.out.println("Re-enter the Phone number");
			contact.setPhoneNumber(sc.nextLine());
		}
		else if(editInfo.equals("email")) {
			System.out.println("Re-enter the Email");
			contact.setEmail(sc.nextLine());
		}
		// Printing the edited function
		contact.print();
	}
}
