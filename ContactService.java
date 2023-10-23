//Manipulation of Contact objects:  Add, Delete and Change.  Functions off ContactID String.
import java.util.Scanner;
import java.util.ArrayList;;


public class ContactService{
	
	Integer newID = 1;  //Increments the ID number for the next contact

	String cID = "CS1";
	String fName;
	String lName;
	String cPhone;
	String cAddress;
	
	/*Create an ArrayList to search via cID*/
	ArrayList<Contact> Contacts = new ArrayList<Contact>();
	
	public Boolean AddContact(String fName2, String lName2, String cPhone2, String cAddress2) {
				
		fName = fName2;
		lName = lName2;
		cPhone = cPhone2;
		cAddress = cAddress2;
		
		Contact myContact = new Contact(cID, fName, lName, cPhone, cAddress);
		
	//	myContact.setID( cID );  
		
		newID++;
		cID = "CS" + newID.toString();

		
	//	myContact.setfName( fName );
		
	//	myContact.setlName( lName );
		
	//	myContact.setPhone( cPhone );
		
	//	myContact.setAddress( cAddress );
		
		//Add the new contact to the ArrayList
		Contacts.add(myContact);

		
		return true;
	}

	
	public Boolean RemoveContact(String cID2) {
		String testID = cID2;
		
		for(Contact element : Contacts) {
			if(Contacts.contains(testID)) {
				Contacts.remove(element);
			}
			
		}
		return true;
	}
	
	public Boolean UpdateContact(String cID2, String fName2, String lName2, String cPhone2, String cAddress2) {
			
		String newNameF = fName2;
		String newNameL = lName2;
		String newAddress = cAddress2;
		String newPhone = cPhone2;
		String testID = cID2;
		int iPlace;
		int i = 0;
		
		for(Contact element : Contacts){
			if(Contacts.contains(testID)) {
				
				Contacts.get(i);
				
				iPlace = i;
				Contacts.get(iPlace).setfName(newNameF);
				Contacts.get(iPlace).setlName(newNameL);
				Contacts.get(iPlace).setAddress(newAddress);
				Contacts.get(iPlace).setPhone(newPhone);	
			}
	
			
		}
		
		return true;
	}
	
}

