//**********************************************************************************************************
// DistCalc.java  Lab 2 Exercise 2  Kip. B.  07/15/20	CPSC 50100-002
// 
// A calculator program that calculates the distance between 2 points on a Cartesian Coordinate System.
//
//  
//**********************************************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class DistCalc {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, distcalc, deltax, deltay;
		
		Scanner points = new Scanner(System.in);
			System.out.print("This is a distance calculation between");
			System.out.println(" two points on a cartesian coordinate system.");
			System.out.println("The formula is dist = (((x2-x1)^2) + ((y2-y1)^2))^0.5");
			// Displays the equation to orient the user.
			
			System.out.println("Input value for x1: ");
		x1 = points.nextInt();
			
			System.out.println("Input value for y1: ");
		y1 = points.nextInt();
		
			System.out.println("Input value for x2: ");
		x2 = points.nextInt();
			
			System.out.println("Input vlaue for y2: ");
		y2 = points.nextInt();
		
		
		deltax = Math.pow(x2 - x1, 2);
		deltay = Math.pow(y2 - y1, 2);
		distcalc = Math.sqrt(deltax + deltay);
			
		DecimalFormat dist = new DecimalFormat("0.###");
			
		System.out.println("The distance between these two points is: " + dist.format(distcalc));
		
		points.close();
		
		
		
		
		
	}

}
