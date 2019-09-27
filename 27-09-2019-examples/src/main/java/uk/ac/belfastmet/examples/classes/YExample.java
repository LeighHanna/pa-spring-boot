package uk.ac.belfastmet.examples.classes;

public class YExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YExample myExample = new YExample();
		System.out.println(myExample.sleepIn(true,false));
		System.out.println(myExample.sleepIn(true,true));
		System.out.println(myExample.sleepIn(false,false));
		System.out.println(myExample.sleepIn(false,true));
	}
	
	public boolean sleepIn(boolean weekday, boolean vacation) {
		boolean sleepIn = false;
		 if(vacation == true) {
			 sleepIn = true;
		 }
		 else if (weekday == false){
			 sleepIn = true;
		 }
		
		return sleepIn;
	}
}
