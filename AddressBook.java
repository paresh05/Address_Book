package com.bridgelabzd12;  

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class AddressBook {
	List <ContactInfo> contactInfo;
	List<ContactInfo> sortedContactInfo;

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
		if(duplicateCheck(firstName,lastName)==false) 
		{
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
		}
		else
			addContact();
	}

	/**This function is used to write the file passed
	 * @param file is the name of the file to write
	 */
	public void writeFile(String file) {
		try {
			FileWriter writer = new FileWriter(file + ".txt", true);
			for (int i = 0; i < contactInfo.size(); i++) {
				writer.write("\nFirst Name: "+contactInfo.get(i).getFirstName()+"\nLast Name: "+contactInfo.get(i).getLastName()
						+"\nAddess: "+contactInfo.get(i).getAddress()+"\nCity: "+contactInfo.get(i).getCity()
						+"\nState: "+contactInfo.get(i).getState()+"\nZip Code:"+contactInfo.get(i).getZipCode()
						+"\nPhone Number: "+contactInfo.get(i).getPhoneNumber()+"\nEmail: "+contactInfo.get(i).getEmail());
			}
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	
	/**This function is used to read the file passed
	 * @param file is the name of the file to read
	 * @throws IOException
	 */
	public void readFile(String file) throws IOException
	{
		FileReader fr =new FileReader(file+".txt");
		int i;
		while ((i=fr.read()) != -1)
			System.out.print((char) i);
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
		int choice;
		int exit=0;
		while(exit==0) {
			System.out.println("Enter 1 to add contact, 2 to edit contact, 3 to delete contact, 4 to sort by name, 5 to sort by city, 6 to sort by state, 7 to sort by zip code, 8 to exit");
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
				ab.sortByName();
				ab.displayContact();
				break;
			case 5:
				ab.sortByCity();
				ab.displayContact();
				break;
			case 6:
				ab.sortByState();
				ab.displayContact();
				break;
			case 7:
				ab.sortByZipCode();
				ab.displayContact();
				break;
			case 8:
				exit=1;
				break;
			}
		}

		ab.displayContact();
	}

	/**
	 *This function is used to display the contacts in the contactInfo arraylist
	 *@return nothing 
	 */
	public  void displayContact() {
		for(ContactInfo element : sortedContactInfo) {
			System.out.println(element);
		}
	}

	/**
	 *This function is used to check if the name is a already entered in the contact list or not
	 *@return nothing 
	 */
	public  boolean duplicateCheck(String firstName,String lastName) {
		for(ContactInfo element : contactInfo) {
			if((element.getFirstName().equalsIgnoreCase(firstName))&&(element.getLastName().equalsIgnoreCase(lastName))) {
				System.out.println("Name is already in the list");
				return true;
			}
		}
		return false;

	}

	/**
	 *This function is used to search the search Person in a City or State across the multiple AddressBook
	 *@return nothing 
	 */
	public void searchByCity(String city) {
		for(ContactInfo element : contactInfo) {
			if((element.getCity().equalsIgnoreCase(city))||(element.getState().equalsIgnoreCase(city))) {
				System.out.println(element.getFirstName()+" "+element.getLastName()+" "+"is from "+city);
			}
		}
	}

	/**
	 *This function is used to sort the contactInfo entries alphabetically by Persons Name
	 *@return nothing 
	 */
	public void sortByName() {
		sortedContactInfo = contactInfo.stream().sorted(ContactInfo.contactName).collect(Collectors.toList());
	}

	/**
	 *This function is used to sort the contactInfo entries by City
	 *@return nothing 
	 */
	public void sortByCity() {
		sortedContactInfo = contactInfo.stream().sorted(ContactInfo.contactCity).collect(Collectors.toList());
	}

	/**
	 *This function is used to sort the contactInfo entries by State
	 *@return nothing 
	 */
	public void sortByState() {
		sortedContactInfo = contactInfo.stream().sorted(ContactInfo.contactState).collect(Collectors.toList());
	}

	/**
	 *This function is used to sort the contactInfo entries by Zip code
	 *@return nothing 
	 */
	public void sortByZipCode() {
		sortedContactInfo = contactInfo.stream().sorted(ContactInfo.contactZipCode).collect(Collectors.toList());
	}
}
