package com.bridgelabzd12;  
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
			// Object Creation
			Contact obj = new Contact("Paresh","Praveen","Surathkal","Mangalore","Karnataka","575014","8050146095","pareshpraveen@gmail.com");
			System.out.println(obj.getFirstName());
			System.out.println(obj.getLastName());
			System.out.println(obj.getAddress());
			System.out.println(obj.getCity());
			System.out.println(obj.getState());
			System.out.println(obj.getZipCode());
			System.out.println(obj.getPhoneNumber());
			System.out.println(obj.getEmail());
	}

}
