package com.bridgelabzd12;

import java.util.*;


public class MultipleAddressBook {

	public static Map<String,AddressBook> multipleAddressBook = new HashMap<String,AddressBook>();

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
			System.out.println("To Create another Address Book, Enter 1");
			userInput = sc.nextInt();
			sc.nextLine();
		}

		System.out.println("Enter the name of the city or state");
		String stateOrCity = sc.nextLine();
		for(Map.Entry<String, AddressBook> entry:multipleAddressBook.entrySet()) {
			System.out.println("Name of the Address Book : "+entry.getKey());
			entry.getValue().searchByCity(stateOrCity);
		}


	}
}

