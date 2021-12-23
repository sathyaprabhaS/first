package org.odd;

public class OddNumbers {
	
	public static void main(String[] args) {
		 
	    int sum = 0;
	    
		     //  1        2        5 
		for (int i = 1; i <= 100; i++) {
			  //  3  
			if (i% 2 == 0) {
				  //4        
				sum = sum +i;
				
				
			}	
			
			
		}
		
		System.out.println("sum of odd num is"+sum);//6
		
	}

}
