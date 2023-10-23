
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import java.io.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ContactServiceTest extends ContactService{
	
	String cID2 = "CS1";
	String fName2;
	String lName2;
	String cPhone2;
	String cAddress2;

	ArrayList<Contact> testContacts = new ArrayList<>();

	//Contact myContact = new Contact(cID, fName, lName, cPhone, cAddress);
	Contact June = new Contact("CS2", "June", "Doe", "1112223333", "8282 Grant Street");
	Contact Hayden = new Contact("CS3", "Hayden", "Lambert", "0001112222", "7643 Aberdine Lane");


	
	
	@Test
	void testAddContact() {
		
	/*	testContacts.add(June);
		testContacts.add(Hayden);	*/
		
		String fName2 = "Julia";
		String lName2 = "Long";
		String cPhone2 = "1013892733";
		String cAddress2 = "1123 Highrise Street";
		
		
		assertTrue(AddContact(fName2, lName2, cPhone2, cAddress2));		
	}
	
	@Test
	void testAddContactFNameNull() {
		
	/*	testContacts.add(June);
		testContacts.add(Hayden);	*/
		
		String fName2 = null;
		String lName2 = "Long";
		String cPhone2 = "1013892733";
		String cAddress2 = "1123 Highrise Street";
		
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});
		}
	
	@Test
	void testAddContactLNameNull() {
		
	/*	testContacts.add(June);
		testContacts.add(Hayden);	*/
		
		String fName2 = "Julia";
		String lName2 = null;
		String cPhone2 = "1013892733";
		String cAddress2 = "1123 Highrise Street";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		AddContact(fName2, lName2, cPhone2, cAddress2);
		});
	}
	
	@Test
	void testAddContactPhoneNull() {
		
	/*	testContacts.add(June);
		testContacts.add(Hayden);	*/
		
		String fName2 = "Julia";
		String lName2 = "Long";
		String cPhone2 = null;
		String cAddress2 = "1123 Highrise Street";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});	
	}
	
	@Test
	void testAddContactAddressNull() {
		
	/*	testContacts.add(June);
		testContacts.add(Hayden);	*/
		
		String fName2 = "Julia";
		String lName2 = "Long";
		String cPhone2 = "1013892733";
		String cAddress2 = null;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		AddContact(fName2, lName2, cPhone2, cAddress2);		
		});
	}
	
	@Test
	void testAddContactFNameTooLong() {
		
	/*	testContacts.add(June);
		testContacts.add(Hayden);	*/
		
		String fName2 = "Julianiaiaiaiaia";
		String lName2 = "Long";
		String cPhone2 = "1013892733";
		String cAddress2 = "1123 Highrise Street";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		AddContact(fName2, lName2, cPhone2, cAddress2);		
		});
	}
	
	@Test
	void testAddContactLNameTooLong() {
		
	/*	testContacts.add(June);
		testContacts.add(Hayden);	*/
		
		String fName2 = "Julia";
		String lName2 = "Loooooooooooooooooooooooooooooooooooong";
		String cPhone2 = "1013892733";
		String cAddress2 = "1123 Highrise Street";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		AddContact(fName2, lName2, cPhone2, cAddress2);		
		});
	}
	
	@Test
	void testAddContactPhoneTooLong() {
		
	/*	testContacts.add(June);
		testContacts.add(Hayden);	*/
		
		String fName2 = "Julia";
		String lName2 = "Long";
		String cPhone2 = "10138927330001111";
		String cAddress2 = "1123 Highrise Street";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		AddContact(fName2, lName2, cPhone2, cAddress2);		
		});
	}
	
	@Test
	void testAddContactAddressTooLong() {
		
	/*	testContacts.add(June);
		testContacts.add(Hayden);	*/
		
		String fName2 = "Julia";
		String lName2 = "Long";
		String cPhone2 = "1013892733";
		String cAddress2 = "1123 Highrise Street On The Corner Of Roundabout Lane";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		AddContact(fName2, lName2, cPhone2, cAddress2);		
		});
	}
	
	
	
	@Test
	void testRemoveContact() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		cID2 = "CS3";
		
		assertTrue(RemoveContact(cID2));		
		
	}
	
	@Test
	void testRemoveContactIDWrong() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		cID2 = "CS7";
		
		
		assertFalse(RemoveContact(cID2));		
		
	}
	
	
	@Test 
	void testUpdateContact() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "Jill";
		lName2 = "Doe";
		cAddress2 = "2023334444";
		cPhone2 = "1234 Address Here";
		cID2 = "CS3";
		
		assertTrue(UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2));
	}
	
	@Test 
	void testUpdateContactIDWrong() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "Jill";
		lName2 = "Doe";
		cAddress2 = "2023334444";
		cPhone2 = "1234 Address Here";
		cID2 = "CS4";
		
		assertFalse(UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2));
	}
	
	@Test 
	void testUpdateContactIDTooLong() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "Jill";
		lName2 = "Doe";
		cAddress2 = "2023334444";
		cPhone2 = "1234 Address Here";
		cID2 = "CS1234567891011";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});
	}
	
	@Test 
	void testUpdateContactFNameTooLong() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "JillianVossamere";
		lName2 = "Doe";
		cAddress2 = "2023334444";
		cPhone2 = "1234 Address Here";
		cID2 = "CS3";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});
	}
	
	@Test 
	void testUpdateContactLNameTooLong() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "Jill";
		lName2 = "DoeRayMeFaSohLeeTahDoe";
		cAddress2 = "2023334444";
		cPhone2 = "1234 Address Here";
		cID2 = "CS3";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});
	}
	
	@Test 
	void testUpdateContactPhoneTooLong() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "Jill";
		lName2 = "Doe";
		cAddress2 = "202333444455555";
		cPhone2 = "1234 Address Here";
		cID2 = "CS3";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});
	}
	
	@Test 
	void testUpdateContactAddressTooLong() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "Jill";
		lName2 = "Doe";
		cAddress2 = "2023334444";
		cPhone2 = "1234 Address Here But This Is Way Too Long For This Field";
		cID2 = "CS3";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});	}
	
	@Test 
	void testUpdateContactIDNull() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "Jill";
		lName2 = "Doe";
		cAddress2 = "2023334444";
		cPhone2 = "1234 Address Here";
		cID2 = null;
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});
		}
	
	@Test 
	void testUpdateContactFNameNull() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = null;
		lName2 = "Doe";
		cAddress2 = "2023334444";
		cPhone2 = "1234 Address Here";
		cID2 = "CS3";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});
	}
	
	@Test 
	void testUpdateContactLNameNull() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "Jill";
		lName2 = null;
		cAddress2 = "2023334444";
		cPhone2 = "1234 Address Here";
		cID2 = "CS3";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});
		}
	
	@Test 
	void testUpdateContactPhoneNull() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "Jill";
		lName2 = "Doe";
		cAddress2 = null;
		cPhone2 = "1234 Address Here";
		cID2 = "CS3";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});
	}
	
	@Test 
	void testUpdateContactAddressNull() {
		testContacts.add(June);
		testContacts.add(Hayden);	
		
		fName2 = "Jill";
		lName2 = "Doe";
		cAddress2 = "2023334444";
		cPhone2 = null;
		cID2 = "CS3";
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		UpdateContact(cID2, fName2, lName2, cPhone2, cAddress2);
		});
		}
}


