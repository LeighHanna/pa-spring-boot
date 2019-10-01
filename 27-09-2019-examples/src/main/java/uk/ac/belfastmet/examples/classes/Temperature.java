package uk.ac.belfastmet.examples.classes;

public class Temperature {
	int numTrue = 0;
	int numFalse = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Temperature temp = new Temperature();
		System.out.println(temp.icyHot(-1, 101)); //True expected
		System.out.println(temp.icyHot(101, -1)); //True expected
		System.out.println(temp.icyHot(0, 101)); //False expected
		System.out.println(temp.icyHot(-1, 100)); //False expected
		System.out.println(temp.icyHot(0, 100)); //False expected
		
		System.out.println(temp.icyHot(101, 101)); //False expected
		System.out.println(temp.icyHot(-1, -1)); //False expected
		
		if(temp.numTrue == 2 && temp.numFalse == 5) {
			System.out.println("It worked");
		}
		
	}
	
	/**
	 * method to confirm a value is greater than 100 and a second value is less than 0
	 * @param val1
	 * @param val2
	 * @return true or false
	 */
	public boolean icyHot(int val1, int val2) {
		boolean index = false;
		if( (val1 < 0 && val2 > 100) || ( val2 < 0 && val1 > 100))
		{
			index = true;
			this.numTrue++;
		}
		else
		{
			this.numFalse++;
		}
		System.out.print("val1(" + val1 + ")| val2(" + val2 + ") - ");
		return index;
	}
	
	

}
