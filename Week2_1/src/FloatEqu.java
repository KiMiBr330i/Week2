//**********************************************************************************************************
// FloatEqu.java  Lab 2 Exercise 5  Kip. B.  07/15/20	CPSC 50100-002
// 
// A program that compares two double variable against each other, and defines
// if the values are essentially equal.
//  
//**********************************************************************************************************

public class FloatEqu {

	public static void main(String[] args) {
		double initial, composite;
		final double TOLERANCE;
		TOLERANCE = 0.0001;
		initial = ((1.0/10) * (1.0/10));
		composite = (1.0/100);
	
	System.out.println("Is (1.0/10) * (1.0/10) equal to  (1.0/100)?");	
	
	if (initial == composite) { 
			System.out.println("EQUAL");
	}
	else { 
			System.out.println("NOT EQUAL");
//I expected the two doubles to be equal.  Original result was "NOT EQUAL".
	
	System.out.println("Here is the tolerance point at which we consider this equation essentially equal: " + TOLERANCE);
	System.out.println("This is how different each side of the equation is: "+ Math.abs(composite - initial)); 
	
	//prints the value of the difference for reference
	
	System.out.println("If the difference is smaller than the tolerance point, then the equation is essentially equal.");
	System.out.println("Is the difference less than the tolerance?");
	}
	if (Math.abs(composite - initial) < TOLERANCE){
		System.out.println("Yes. This equation is essentially equal.");
		// I've found out that proper indentation and curly braces are important.
	}
	}
}
