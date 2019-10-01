package uk.ac.belfastmet.examples;


public class MidString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * method to find the middle 2 characters in a string
	 * @param value
	 * @return new string of length 2
	 */
	public String middleTwo(String value) {
		String result = "";
		if((value.length() % 2) == 0) {
			result += value.charAt((value.length() / 2)-1);
			result += value.charAt((value.length() / 2));
		}
		System.out.println(result);
		return result;
	}

}
