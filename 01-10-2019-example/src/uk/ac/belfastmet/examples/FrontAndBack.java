package uk.ac.belfastmet.examples;
public class FrontAndBack {	
	
	/**
	 * method to see if text is Palindrome meaning the same backwards
	 * @param value
	 * @return
	 */
	public Boolean isPalindrome(String value){
		Boolean result = false;
		String half1 = "";
		String half2 = "";
		String half2new = "";
		if((value.length() % 2) == 0) {
			half1 = value.substring(0,(value.length()/2));
			half2 = value.substring(value.length()/2,(value.length()));
			
			for(int index = 0; index < half2.length() ; index++)
			{
				half2new += half2.charAt(half2.length() - (index+1));
			}
			
			
			if(half1.equals(half2new))
			{
				result = true;
			}
		}
		else
		{
			half1 = value.substring(0,(value.length()/2));
			half2 = value.substring((value.length()/2)+1,(value.length()));	
			
			for(int index = 0; index < half2.length() ; index++)
			{
				half2new += half2.charAt(half2.length() - (index+1));
			}
			
			if(half1.equals(half2new))
			{
				result = true;
			}
		}
		return result;
	}

}
