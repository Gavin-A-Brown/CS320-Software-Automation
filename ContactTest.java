
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContact() {		//All Test cases here should return no errors
		Contact myContact = new Contact("C1", "John", "Doe", "1018675309", "111 Fantasy Lane");
		assertTrue(myContact.getcontactID().equals("C1"));
		assertTrue(myContact.getfirstName().equals("John"));
		assertTrue(myContact.getlastName().equals("Doe"));
		assertTrue(myContact.getcontactPhone().equals("1018675309"));
		assertTrue(myContact.getcontactAddress().equals("111 Fantasy Lane"));
	}
	
	@Test
	void testContactIDTooLong() {		//This Test case should return a failure on contactID
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact("C1234567891011", "Lucielle", "Tarkovski", "1018675309", "111 Fantasy Lane");
	});
	}
	
	@Test
	void testContactFNameTooLong() {	//This Test case should return a failure on contactFName
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("C3", "Lucielliannia", "Tarkovski", "1018675309", "111 Fantasy Lane");
		});
	}
	
	@Test
	void testContactLNameTooLong() {	//This Test case should return a failure on contactLName
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("C4", "Lucielle", "Tartakovskia", "1018675309", "111 Fantasy Lane");
		});
	}
	
	@Test
	void testContactNumberTooLong() {	//This Test case should return a failure on contactNumber
		Assertions.assertThrows(IllegalArgumentException.class,  () -> {
			new Contact("C5", "Lucielle", "Tarkovski", "1800THISTOOLONG", "111 Fantasy Lane");
		});
	}
	
	@Test
	void testContactAddressTooLong() {	//This Test case should return a failure on contactAddress
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("C6", "Lucielle", "Tarkovski", "1018675309", "ThisAddressIsFarTooLongForThisFieldWhyDoYouLiveHere");
		});
	}
	
	@Test
	void testContactIDNaught() {		//This Test case should return a null failure on contactID
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
		new Contact(null, "Lucielle", "Tarkovski", "1018675309", "111 Fantasy Lane");
	});
	}
	
	@Test
	void testContactFNameNaught() {		//This Test case should return a null failure on contactFName
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("C7", null, "Tarkovski", "1018675309", "111 Fantasy Lane");
		});
	}
	
	@Test
	void testContactLNameNaught() {		//This Test case should return a null failure on contactLName
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("C8", "Lucielle", null, "1018675309", "111 Fantasy Lane");
		});
	}
	
	@Test
	void testContactNumberNaught() {	//This Test case should return a null failure on contactNumber
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("C9", "Lucielle", "Tarkovski", null, "111 Fantasy Lane");
		});
	}
	
	@Test
	void testContactAddressNaught() {	//This Test case should return a null failure on contactAddress
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("C10", "Lucielle", "Tarkovski", "1018675309", null);
		});
	}
	

}
