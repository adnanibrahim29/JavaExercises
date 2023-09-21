/**
 * This class describes an object of type Person, including a name, address,
 * and a unique ppsNo.
 *
 *	@version 1.0 March 2016
 *
 * 	The comments at the top of the method are in a format known as JavaDocs. You can look up
 *	more details on how JavaDocs work and why you use them online if you interested
 *
 * This class uses the "this" keyword for more information on the "this" keyword
 * please look at https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html 
 * and ask your Demonstrator.
 *
 */
public class Person {

	// Attributes
  	private String name;
	private String address;
	private int ppsNo;
	
	// Class Variables
	private static int counter =1001; // used to remember the last ppsNo assigned

	// Default Constructor
	/**
     * Creates a Person with default values
	 */
	public Person(){
		//calling setter method to assign values to Person attributes
		setName("");
		setAddress("");
		this.ppsNo = counter++;
	}

	// General Constructor
	/**
	 * Creates a new Person with the details provided and assigns it a unique ppsNo
	 * @param name The name this Person has
	 * @param address The address of this Person
	 *
	 */
  	public Person (String name, String address) {
  		//Assign values to a Person
		this.name = name;
		this.address = address;
    	this.ppsNo = counter++;
	}

	// Accessors and Mutators
	/**
	 * 	Gets the name of this Person
	 *	@return name
	 */
	public String getName(){ 
		return this.name;
	}

	/**
	 * 	Gets the address of this Person
	 *	@return address
	 */
	public String getAddress(){
		return this.address;
	}

	/**
	 * 	Gets the ppsNo of this Person
	 *	@return ppsNo
	 */
	public int getPPSNo(){
		return this.ppsNo;
	}

	/**
	 * Sets the name of the Person to the new one provided.
	 * @param name The new name of the Person.
	 */
	public void setName(String name){
		this.name=name;
	}

	/**
	 * Sets the address of the Person to the new one provided.
	 * @param address The new address of the Person.
	 */
	public void setAddress(String address){
		this.address=address;
	}

	/**
	 * Prints the details of this person to the screen
	 */
    
    public String toString(){
        return "Person 1 is called Bob Hope\n"+
        "They live in America\n" +
        "Their PPS Number is 1001.0"; 
    }
  	public void showPerson(){
		System.out.println("*****PERSONAL DETAILS*****");
		System.out.println("NAME: "+ getName());
		System.out.println("ADDRESS: "+ getAddress());
		System.out.println("PPS NUMBER: "+ getPPSNo());
	}
}