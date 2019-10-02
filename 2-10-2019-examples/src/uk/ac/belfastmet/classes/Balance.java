package uk.ac.belfastmet.classes;

public class Balance {
	
	/**
	 * method to show if brackets open or close either beside each other or  on the other side of the string
	 * @param value
	 * @return "Balanced" or "Not Balanced"
	 */
	public static String balanceBrackets(String value) {
		String result = "Balanced";
		String fail = "Not Balanced";

		
		for(int index=0; index<value.length(); index++) {
			if(index < (value.length()-1)) {
				if(value.charAt(index) == '{' ) {
					if(value.charAt((value.length()-1) - index) == '}')
					{
						
					}
					else if(value.charAt(index + 1) == '}')
					{
						
					}
					else
					{
						result = fail;
					}
				}
				else if(value.charAt(index) == '(' ) {
					if(value.charAt((value.length()-1) - index) == ')')
					{
						
					}
					else if(value.charAt(index + 1) == ')')
					{
						
					}
					else
					{
						result = fail;
					}
				}
				else if(value.charAt(index) == '[' ) {
					if(value.charAt((value.length()-1) - index) == ']')
					{
						
					}
					else if(value.charAt(index + 1) == ']')
					{
						
					}
					else
					{
						result = fail;
					}
				}
				

				
			}
			
			if(index > 0) {
				if(value.charAt(index) == '}' ) {
					if(value.charAt((value.length() - 1) - index) == '{')
					{
						
					}
					else if(value.charAt(index - 1) == '{')
					{
						
					}
					else
					{
						result = fail;
					}
				}
				else if(value.charAt(index) == ')' ) {
					if(value.charAt((value.length() - 1) - index) == '(')
					{
						
					}
					else if(value.charAt(index - 1) == '(')
					{
						
					}
					else
					{
						result = fail;
					}
				}
				else if(value.charAt(index) == ']' ) {
					if(value.charAt((value.length() - 1) - index) == '[')
					{
						
					}
					else if(value.charAt(index - 1) == '[')
					{
						
					}
					else
					{
						result = fail;
					}
				}
			}
			
					
		}
		
		return result;
	}
}
