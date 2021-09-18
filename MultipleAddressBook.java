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
	public static Set<String> countofCity = new HashSet<String>();
	public static Set<String> countofState = new HashSet<String>();

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
		
		
		//Code to view a person by state and also to display the count of persons from a state
		
		System.out.println("Veiw Person by city");

		for(Map.Entry<String, String> entry:personByCity.entrySet()) 
		{
			int countCity = 0;
			System.out.println("Name of the Person: "+entry.getKey()+", City: "+entry.getValue());
			String city = entry.getValue();
			for(Map.Entry<String, String> entry2:personByCity.entrySet()) {
				if(entry2.getValue().equalsIgnoreCase(city)) {
					countCity++;
				}
			}
			countofCity.add("Number of Persons from "+city+" : "+countCity);
		}
		for(String element: countofCity) {
			System.out.println(element);
		}

		//Code to view a person by state and also to display the count of persons from a state
		
		System.out.println("Veiw Person by State");
		for(Map.Entry<String, String> entry:personByState.entrySet()) 
		{
			int countState = 0;
			System.out.println("Name of the Person: "+entry.getKey()+", State: "+entry.getValue());

			String state = entry.getValue();
			for(Map.Entry<String, String> entry2:personByState.entrySet()) {
				if(entry2.getValue().equalsIgnoreCase(state)) {
					countState++;
				}
			}
			countofState.add("Number of Persons from "+state+" : "+countState);
		}

		for(String element: countofState) {
			System.out.println(element);
		}
	}
}

