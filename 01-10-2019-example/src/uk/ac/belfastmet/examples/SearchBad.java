package uk.ac.belfastmet.examples;

public class SearchBad {
	
	/**
	 * method to see if "bad" is present in the first 4 characters
	 * @param value
	 * @return true or false
	 */
	public Boolean hasBad(String value) {
		Boolean result = false;
		String newValue = value.substring(0, 4);
		result = newValue.contains("bad");
		return result;
	}

}
