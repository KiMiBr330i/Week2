//**********************************************************************************************************
// UserNames.java  Lab 2 Exercise 3  Kip. B.  07/15/20	CPSC 50100-002
// 
// A User Name generator program that takes and mutates portions of the user's first and last names.
//
//  
//**********************************************************************************************************


import java.util.Scanner;
import java.util.Random;

public class UserNames {

	public static void main(String[] args) {
		
		Scanner names = new Scanner(System.in);
		Random digits = new Random();
		String First, Last, mutationF, mutationL;
		int number;
		
		// introduction and string portion of generator program
		System.out.println("I am a UserName Generator.");
		System.out.println("...");
		System.out.println("...");
		System.out.println("Please input your first name: ");
		
			First = names.nextLine();
			
		System.out.println("Please input your last name: ");
		
			Last = names.nextLine();
		
		// number generator portion of the program	
		number = digits.nextInt(90) + 10;
		mutationL = Last.substring(0,4);
		mutationF = First.substring(0,1);
		
		System.out.println("This is your UserName: " + mutationL + mutationF + number);
		
		names.close();

	}

}
