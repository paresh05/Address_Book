package com.bridgelabzd12;

import java.util.Comparator;

/* Class Contact
 * This class is used to initialize the contact information of a person 
 * The information cannot be accessed in another class since they are made private 
 * Hence using getters and setters the information can be accessed in main class*/

public class ContactInfo {

	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private String phoneNumber;
	private String email;

	ContactInfo(String firstName, String lastName, String address, String city, String state, String zipCode, String phoneNumber, String email)
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

	public static Comparator<ContactInfo> contactName = new Comparator<ContactInfo>() {
		@Override
		public int compare(ContactInfo c1,ContactInfo c2) {
			String firstName1 = c1.getFirstName();
			String firstName2 = c2.getFirstName();
			return firstName1.compareTo(firstName2);
		}
	};
	
	public static Comparator<ContactInfo> contactCity = new Comparator<ContactInfo>() {
		@Override
		public int compare(ContactInfo c1,ContactInfo c2) {
			String city1 = c1.getCity();
			String city2 = c2.getCity();
			return city1.compareTo(city2);
		}
	};
	
	public static Comparator<ContactInfo> contactState = new Comparator<ContactInfo>() {
		@Override
		public int compare(ContactInfo c1,ContactInfo c2) {
			String state1 = c1.getState();
			String state2 = c2.getState();
			return state1.compareTo(state2);
		}
	};
	
	public static Comparator<ContactInfo> contactZipCode = new Comparator<ContactInfo>() {
		@Override
		public int compare(ContactInfo c1,ContactInfo c2) {
			String zipCode1 = c1.getZipCode();
			String zipcode2 = c2.getZipCode();
			return zipCode1.compareTo(zipcode2);
		}
	};
	
	@Override
	public String toString() {
		return "ContactInfo [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", phoneNumber="
				+ phoneNumber + ", email=" + email + "]";
	}


}
