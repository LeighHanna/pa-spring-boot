package uk.ac.belfastmet.classes;

public class Brace {

	public static void main(String[] args) {
		System.out.println(Brace.checkBrace("({ } [ ] ( ))"));
		System.out.println(Brace.checkBrace("({ } [ ] ( ))"));
	}
	
	public static String checkBrace(String value) {
		String result = "Correct";
		String fail = "Not Correct";
		String reverseVal = "";
		value = value.replaceAll(" ",""); //remove all whitespaces from value
		
		//for loop to populate reverseVal the opposite string to value
		for(int index = 0; index < value.length(); index++) {
			reverseVal += value.charAt((value.length() - 1) - index);
		}
		
		//for loop to check the complete brackets
		for(int index = 0; index < value.length(); index++) {
			
			try{
				switch(value.charAt(index))
				{
				case '{':
					if((value.charAt(index + 1)) == '}' || reverseVal.charAt(index) == '}')
					{break;}
				case '(':
					if((value.charAt(index + 1)) == ')' || reverseVal.charAt(index) == ')')
					{break;}
				case '[':
					if((value.charAt(index + 1)) == ']' || reverseVal.charAt(index) == ']')
					{break;}
				case '}':
					if((value.charAt(index - 1)) == '{' || reverseVal.charAt(index) == '{')
					{break;}
				case ')':
					if((value.charAt(index - 1)) == '(' || reverseVal.charAt(index) == '(')
					{break;}
				case ']':
					if((value.charAt(index - 1)) == '[' || reverseVal.charAt(index) == '[')
					{break;}
				case ' ':
					if((value.charAt(index + 1)) == ' ' || value.charAt(index - 1) == ' ' || reverseVal.charAt(index) == ' ')
					{break;}
				default:
					result = fail;				
				}
			}
			catch(Exception e)
			{/**Do Nothing**/}
		}
		return result;
	}
}
