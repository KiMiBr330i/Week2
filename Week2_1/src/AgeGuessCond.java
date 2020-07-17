//**********************************************************************************************************
// AgeGuessCond.java  Lab 2 Exercise 4  Kip. B.  07/15/20	CPSC 50100-002
// 
// Second Modified AgeGuess Program with conditional statements.
//
//  
//**********************************************************************************************************



import java.util.Random;
import java.util.Scanner;

public class AgeGuessCond {

	public static void main(String[] args) {
	

		// Name Guess---------------------------------------------------------------------------
		
				Scanner scan = new Scanner(System.in);
				
				System.out.print("Guess what my name is: ");
					String name;
					name = scan.nextLine();
				
				System.out.println("You guessed that my name is: " + name + ". It's actually 3279.64i0.");
				
		// Age Guess----------------------------------------------------------------------------
			
					int AgeGuess, age; 
					Random Age = new Random();
					age = 1 + Age.nextInt(100);
				
				System.out.print("I'm somewhere between 0 and 100 days old. Guess a number: ");
					AgeGuess = scan.nextInt();
					
				System.out.println("Really? You think I'm " + AgeGuess + " days old?");
			
				if (AgeGuess != age); {
				System.out.println("You guessed wrong!");
				
				
					if (AgeGuess > age) {
					System.out.println("I'm younger.");
					}
				
				
					if (AgeGuess < age) {
					System.out.println("I'm older.");
					}
				
					if (AgeGuess == age) {
					System.out.println("Good guess!");
						// Added in case the random number generator gave a matching value to the user input.
						// Debugging in eclipse is confusing. When using the debugger, I realized that the obvious
						// bug is what happens if user input = random number.
				}
				System.out.println("I'm actually " + age + " days old.");
				
				scan.close();
				
					}
			}
	}
