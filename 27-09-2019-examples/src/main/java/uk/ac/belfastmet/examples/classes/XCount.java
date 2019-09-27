package uk.ac.belfastmet.examples.classes;

public class XCount {
	int tSuccess = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XCount myCount = new XCount();
		System.out.println(myCount.countXX("abcxx")); //2 x's
		System.out.println(myCount.countXX("xxx")); //3 x's
		System.out.println(myCount.countXX("xxxx")); //4 x's
		
		System.out.println("-----------------------------------");
		
		if(myCount.countXX("abcxx") == 2 && myCount.countXX("xxx") == 3 && myCount.countXX("xxxx") == 4) {
			System.out.println("All three tests sucessful");
		}
		
	}
	
	public int countXX(String data) {
		int index = 0;
		
		for(int step = 0; step < data.length(); step++)
		{
			if(data.charAt(step) == 'x' || data.charAt(step) == 'X')
			{
				index++;
			}
		}
		return index;
	}

}
