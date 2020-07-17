//**********************************************************************************************************
// NumDisplay.java  Lab 2 Exercise 6  Kip. B.  07/15/20	CPSC 50100-002
// 
// A program that writes out the the user input number from int to string literal.
//
//  
//**********************************************************************************************************



import java.util.Scanner;
public class NumDisplay {

	public static void main(String[] args) {
		
		int number;
		Scanner NumDisplay = new Scanner(System.in);
		System.out.println("Please input a number from 0 to 9. ");
		number = NumDisplay.nextInt();
		
		switch(number) {
		
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		
			default:
				System.out.println("You've input a wrong number!");
		
		}
	NumDisplay.close();
	}
}