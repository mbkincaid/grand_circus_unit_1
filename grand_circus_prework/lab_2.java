package grand_circus_prework;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class lab_2 {

private static Scanner scanner;

	public static void main(String[] args) {
        
		System.out.print("Hello! Please enter a date in the YYYY-MM-DD format: ");
        
		scanner = new Scanner(System.in);
        String Day1Strinq = scanner.nextLine();
        LocalDate Day1 = LocalDate.parse(Day1Strinq);

        System.out.println("You entered " + Day1);

        System.out.println("Please another date in the same format: ");

        String Day2Strinq = scanner.nextLine();
        LocalDate Day2 = LocalDate.parse(Day2Strinq);

        System.out.println("You entered " + Day2);
        
        Period diff1 = Day1.until(Day2);

        int days = diff1.getYears();
        int months = diff1.getMonths();
        int years = diff1.getDays();

        System.out.println("Would you like to know the difference between the two dates?");

        System.out.println("Your difference is  " + years + " Years, " + months + " Months, and " + days + " Days."); 

		}        

	}
