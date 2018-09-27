package grand_circus_prework;

import java.util.Scanner;

public class lab_1 {

	public static void main (String [] args ){
		
		System.out.println("What is your favorite 3 digit number?");
	
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int digit1a = (number1 / 100);
		int digit2a = (number1 % 100)/10;
		int digit3a = (number1 % 10);
		
		System.out.println("What is your 2nd favorite 3 digit number?");
		
		int number2 = input.nextInt();
		int digit1b = (number2 / 100);
		int digit2b = (number2 % 100)/10;
		int digit3b = (number2 % 10);

	    int digit1c = digit1a + digit1b;
	    int digit2c = digit2a + digit2b;
	    int digit3c = digit3a + digit3b;

	    if (digit1c != digit2c) {
	    	System.out.println("False");
	        } 
	    else if (digit1c != digit3c) {
	        	System.out.println("False");
	        }
	    else if (digit2c != digit3c) {
	        	System.out.println("False");
	        }
	    else System.out.println("True");
			}
	
}
	        
			
	        
	        
	        
	        
	        
		