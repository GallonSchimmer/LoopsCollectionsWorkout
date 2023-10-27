package stringArrayloops;

public class StringArrayLoop {

	// Attribute
	String asString = "This is a String";

	// Constructor
	public StringArrayLoop(String asString) {
		this.asString = asString;
	}

	// overriding toString method
	public String toString(String asString) {
		return " first letter:  " + this.asString;
	}

	// main for tests
	public static void main(String[] args) {

		// looping through String array
		String[] textArray = { "First", "Second", "Third", "Fourth", "Fifth" };

		for (int i = 0; i < textArray.length; i++) {
			System.out.println("This ist the index: " + i + " of the String Array, that corresponds to this value:  "
					+ textArray[i]);
		}

		System.out.println();

		for (int i = 0; i < textArray.length; i++) {
			String asString = textArray.toString();
			System.out.println(asString);
			System.out.println("The index: " + i + " changed to String " + asString.charAt(i));
		}

		// creating instance, looping and printing with new toString
		System.out.println();

		StringArrayLoop newStringLoop = new StringArrayLoop("New String of the new Instance");
		newStringLoop.toString();
		System.out.println("Printing : " + newStringLoop.asString);

		System.out.println();

		for (int i = 0; i < newStringLoop.asString.length()-20; i++) {
			String asString = newStringLoop.asString.toString();
			System.out.println(asString);
			System.out.println("The index: " + i + " changed to String " + asString.charAt(i));
		}

	}

}
