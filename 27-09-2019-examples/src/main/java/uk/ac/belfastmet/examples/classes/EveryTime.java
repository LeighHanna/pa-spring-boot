package uk.ac.belfastmet.examples.classes;

public class EveryTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EveryTime eTime = new EveryTime();
		System.out.println(eTime.everyNth("Miracle", 2)); //Mrce expected
		System.out.println(eTime.everyNth("abcdefg", 2)); //aceg expected
		System.out.println(eTime.everyNth("abcdefg", 3)); //adg expected
		
		if(eTime.everyNth("Miracle", 2).equals("Mrce") && eTime.everyNth("abcdefg", 2).equals("aceg") && eTime.everyNth("abcdefg", 3).equals("adg")) 
		{
			System.out.println("all 3 success");
		}
	}
	
	/**
	 * 
	 * @param data the string you are getting data from
	 * @param spot e.g every two characters
	 * @return newData a string with the characters you required through spot from data
	 */
	public String everyNth(String data, int spot)
	{
		String newData = "";
		for(int index = 0; index < data.length(); index += spot)
		{
			newData += data.charAt(index);
		}
		return newData;
	}

}
