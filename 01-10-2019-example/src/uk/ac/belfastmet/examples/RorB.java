package uk.ac.belfastmet.examples;
public class RorB {

	/**
	 * method to see if a string starts with blue or red and retun this or returns a "" blank string
	 * @param value
	 * @return "red" or "blue" or ""
	 */
	public String seeColor(String value) {
		String result = "";
		
		if(value.startsWith("blue")) {
			result="blue";
		}
		else if(value.startsWith("red")) {
			result="red";
		}
		
		return result;
	}
}
