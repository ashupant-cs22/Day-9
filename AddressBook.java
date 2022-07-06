package AddressBook;
import java.util.Scanner;


public class AddressBook<Person> {

	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		AddressBook addressBook = new AddressBook();
		addressBook.addAPerson();
}
	private void addressbook(AddressBook addressBook) {
		
	}

public void addAPerson() {
	System.out.print("Enter first and last name: ");
	String firstName = scanner.next();
	String lastName = scanner.next();
	
	System.out.print("Enter complete address: ");
	scanner.nextLine();
	String address = scanner.nextLine();
	
	System.out.print("Enter city, state and zip: ");
	String city = scanner.next();
	String state = scanner.next();
	String zip = scanner.next();
	
	System.out.println("Enter phone number: ");
	String phoneNumber = scanner.next();
	
	
}


}