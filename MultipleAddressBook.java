package com.bridgelabzd12;

import java.util.*;


/**
 * @author paresh.praveen_ymedi
 * @class member multipleAddressBook is used the store the multiple address books 
 */
public class MultipleAddressBook {

	public static Map<String,AddressBook> multipleAddressBook = new HashMap<String,AddressBook>();
	public static Map<String,String> personByCity = new HashMap<String,String>();
	public static Map<String,String> personByState = new HashMap<String,String>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int userInput = 1;
		System.out.println("Welcome to Address Book");
		Scanner sc = new Scanner(System.in);

		AddressBook addressBook;
		while(userInput == 1) {

			addressBook = new AddressBook();
			System.out.println("Enter the name of the address book");
			String addressBookName = sc.nextLine();
			multipleAddressBook.put(addressBookName, addressBook);
			addressBook.choice(addressBook);
			for(ContactInfo element : addressBook.contactInfo) {
				personByCity.put((element.getFirstName()+" "+element.getLastName()), element.getCity());
				personByState.put((element.getFirstName()+" "+element.getLastName()), element.getState());
				
			}
			System.out.println("To Create another Address Book, Enter 1");
			userInput = sc.nextInt();
			sc.nextLine();
		}
		
		System.out.println("Veiw Person by city");
		for(Map.Entry<String, String> entry:personByCity.entrySet()) 
		{
			System.out.println("Name of the Person: "+entry.getKey()+", City: "+entry.getValue());
		}
		
		System.out.println("Veiw Person by State");
		for(Map.Entry<String, String> entry:personByState.entrySet()) 
		{
			System.out.println("Name of the Person: "+entry.getKey()+", State: "+entry.getValue());
		}
	}
}

