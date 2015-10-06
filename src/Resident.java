// RESIDENT SUB CLASS OF THE PERSON SUPERCLASS
public class Resident extends Person {
	//PRIVATE INSTANCE VARIABLES
	private String _SIN;
	private Address _address;
	
	//GETTERS AND SETTERS
	public String getSIN() {
	return this._SIN;
	}
	
	public void setAddress(String streetNumber, String streetName, String cityName, String provinceName){
		this._address = new Address(streetNumber, streetName, cityName, provinceName);
	}
	
	public String getAddress() {
		return this._address.toString();
	}
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++++
	Resident(String name, int age, float heightInInches, float massInPounds, String SIN) {
		super(name, age, heightInInches, massInPounds);
		this._SIN = SIN;
	}

}
