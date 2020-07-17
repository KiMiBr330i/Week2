//**********************************************************************************************************
// AgeGuessMod.java  Lab 2 Exercise 1  Kip. B.  07/15/20	CPSC 50100-002
// 
// Modified AgeGuess Program from Lab 1 with random number generator.
//
//  
//**********************************************************************************************************


import java.util.Random;
import java.util.Scanner;

public class AgeGuessMod {

	public static void main(String[] args) {
	
	// Name Guess---------------------------------------------------------------------------
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Guess what my name is: ");
			String name;
			name = scan.nextLine();
		
		System.out.println("You guessed that my name is: " + name + ". It's actually Harold.");
		
	// Age Guess----------------------------------------------------------------------------
	
			int AgeGuess;
			int age; 
			int ageGuess;
			Random Age = new Random();
			age = Age.nextInt(100) + 1;
		
		System.out.print("I'm somewhere between 0 and 100 days old. Guess a number: ");
			AgeGuess = scan.nextInt();
			ageGuess = Math.abs(AgeGuess - age); 
			//Stores random number and gives the difference between it and user guess
			
			
		System.out.println("Really? You think I'm " + AgeGuess + " days old?");
		System.out.println("Well! You were only off by " + ageGuess + ". I'm " + age + " days old.");
		
		scan.close();
	
		
	}

}		

	


