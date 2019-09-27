package uk.ac.belfastmet.examples.classes;

public class everyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		everyTime eTime = new everyTime();
		System.out.println(eTime.everyNth("Miracle", 2)); //Mrce expected
		System.out.println(eTime.everyNth("abcdefg", 2)); //aceg expected
		System.out.println(eTime.everyNth("abcdefg", 3)); //adg expected
		
		if(eTime.everyNth("Miracle", 2).equals("Mrce") && eTime.everyNth("abcdefg", 2).equals("aceg") && eTime.everyNth("abcdefg", 3).equals("adg")) 
		{
			System.out.println("all 3 success");
		}
	}
	
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
