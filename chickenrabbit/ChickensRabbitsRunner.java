package com.qa.chickenrabbit;

public class ChickensRabbitsRunner {
	
	public static void main(String[] args) {
		
		chickensAndRabbits(20,80);
		chickensAndRabbits(23,96);
		
	}
	
	public static void chickensAndRabbits(int heads, int legs) {
		
		 boolean solution = false;
		 
		 for (int i = 0; i <= heads; i++) {
			 
			 int r = heads - i;
			 int c = i;
			 
			 if ( (r*4 + c*2) == legs ) {
				 System.out.println("Rabbits: " + r);
				 System.out.println("Chickens: " + c);
				 solution = true;
			 }
			 
		 }
		 if (!solution) {
			 System.out.println("No solution available.");
		 }
		
	}

}
