package AddressBook;


public interface AddressBookService {
	
	void store(Person person);

	void edit(File file, String name);

	void delete(File file, String name);

	JSONObject search(File file, String name);

	void addAddressBook(String name);

	void deleteAddressBook(String name);

	File listOfFiles();

}
