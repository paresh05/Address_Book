package com.bridgelabzd12;

import java.util.*;


public class MultipleAddressBook {

	public static Map<String,AddressBook> multipleAddressBook = new HashMap<String,AddressBook>();

	public static void main(String[] args) {

		int userInput = 1;
		System.out.println("Welcome to Address Book");

		while(userInput == 1) {
			
			AddressBook addressBook = new AddressBook();
			System.out.println("Enter the name of the address book");
			Scanner sc = new Scanner(System.in);
			String addressBookName = sc.nextLine();
			multipleAddressBook.put(addressBookName, addressBook);
			addressBook.choice(addressBook);
			System.out.println("To Create another Address Book, Enter 1");
			userInput = sc.nextInt();
		}
	}
}

