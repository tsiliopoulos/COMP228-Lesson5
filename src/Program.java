// PROGRAM DRIVER CLASS
public class Program {

	// STATIC MAIN METHOD ++++++++++++++++++++
	public static void main(String[] args) {
		Resident resident = new Resident("Tom", 46, 72.0f, 175.0f, "555 555 555");
		
		resident.eats();
		resident.setAddress("55", "Fifty-Fifth Street", "Toronto", "Ontario");
		
		System.out.println(resident.getAddress());
	}

}
