package uk.ac.belfastmet.classes;

public class Balance {
	
	/**
	 * method to show if brackets open or close either beside each other or  on the other side of the string
	 * @param value
	 * @return "Balanced" or "Not Balanced"
	 */
	public static String balanceBrackets(String value) {
		String result = "Balanced"; //sucess message + the default value
		String fail = "Not Balanced"; //fail message 

		//for loop for each character in the string given
		for(int index=0; index<value.length(); index++) {
			//ALL OPEN BRACKETS
			//an if statement to ensure i can check one to the right of the current character
			if(index < (value.length()-1)) {
				if(value.charAt(index) == '{' ) {
					if(value.charAt((value.length()-1) - index) == '}') 
					//if statement to check character at the other of the string
					{/**Do Nothing the result stays "Balanced"**/}
					else if(value.charAt(index + 1) == '}') 
					//if statement to check character beside this one to the right
					{/**Do Nothing the result stays "Balanced"**/}
					else
					{
						result = fail;
					}
				}
				else if(value.charAt(index) == '(' ) {
					if(value.charAt((value.length()-1) - index) == ')') 
					//if statement to check character at the other of the string
					{/**Do Nothing the result stays "Balanced"**/}
					else if(value.charAt(index + 1) == ')')
					//if statement to check character beside this one  to the right
					{/**Do Nothing the result stays "Balanced"**/}
					else
					{
						result = fail;
					}
				}
				else if(value.charAt(index) == '[' ) {
					if(value.charAt((value.length()-1) - index) == ']') 
					//if statement to check character at the other of the string  to the right
					{/**Do Nothing the result stays "Balanced"**/}
					else if(value.charAt(index + 1) == ']') 
					//if statement to check character beside this one
					{/**Do Nothing the result stays "Balanced"**/}
					else
					{
						result = fail;
					}
				}
				

				
			}
			
			//ALL CLOSE BRACKETS
			//an if statement to ensure i can check one to the left of the current character
			if(index > 0) {
				if(value.charAt(index) == '}' ) {
					 
					if(value.charAt((value.length() - 1) - index) == '{') 
					//if statement to check character at the other of the string
					{/**Do Nothing the result stays "Balanced"**/}
					else if(value.charAt(index - 1) == '{')
					//if statement to check character beside this one to the left
					{/**Do Nothing the result stays "Balanced"**/}
					else
					{
						result = fail;
					}
				}
				else if(value.charAt(index) == ')' ) {
					if(value.charAt((value.length() - 1) - index) == '(') 
					//if statement to check character at the other of the string
					{/**Do Nothing the result stays "Balanced"**/}
					else if(value.charAt(index - 1) == '(') 
					//if statement to check character beside this one to the left
					{/**Do Nothing the result stays "Balanced"**/}
					else
					{
						result = fail;
					}
				}
				else if(value.charAt(index) == ']' ) {
					if(value.charAt((value.length() - 1) - index) == '[') 
					//if statement to check character at the other of the string
					{/**Do Nothing the result stays "Balanced"**/}
					else if(value.charAt(index - 1) == '[') 
					//if statement to check character beside this one to the left
					{/**Do Nothing the result stays "Balanced"**/}
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
