
	public class Contact extends ContactService{
		//Generate unique ID code?
		private String contactID;
		//Initializers
		private String firstName;
		private String lastName;
		private String contactPhone;
		private String contactAddress;
		
		//Constructor
	public Contact(String cID, String fName, String lName, String cPhone, String cAddress) {
		
		contactID = cID;
		firstName = fName;
		lastName = lName;
		contactPhone = cPhone;
		contactAddress = cAddress;
		
		//Input Validation
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name " + firstName);
		}
		
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		if(contactPhone == null || contactPhone.length()>10 || contactPhone.length()<10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		if(contactAddress == null || contactAddress.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactPhone = contactPhone;
		this.contactAddress = contactAddress;
	}


	
	public String getcontactID() {
		return contactID;
	}
	
	public void setID( String cID ) {
		contactID = cID;
		if(contactID == null || contactID.length()>10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.contactID = cID;

	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public Boolean setfName( String fName ) {
		String testName = fName;
		firstName = testName;
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = fName;
		
		return true;

	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setlName( String lName ) {
		String testName = lName;
		lastName = testName;
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lName;
	}
	
	public String getcontactPhone() {
		return contactPhone;
	}
	
	public void setPhone( String cPhone ) {
		String testPhone = cPhone;
		contactPhone = testPhone;
		if(contactPhone == null || contactPhone.length()>10 || contactPhone.length()<10) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		this.contactPhone = cPhone;
	}
	
	public String getcontactAddress() {
		return contactAddress;
	}
	
	public void setAddress( String cAddress ) {
		String testAddress = cAddress;
		contactAddress = testAddress;
		if(contactAddress == null || contactAddress.length()>30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.contactAddress = cAddress;
	}
	
}
