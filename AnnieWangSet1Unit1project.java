import java.util.Scanner;
import java.lang.Math;

public class AnnieWangSet1Unit1project {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//kinetic energy 
		double m; 
		double v; 
		System.out.println("Please input a number for mass and a number for speed");
		m = s.nextDouble();
		v = s.nextDouble();
		double kinetic;
		kinetic = (0.5*(m*(Math.pow(v, 2))));
		System.out.println(kinetic);
		//Fahreheit to Celcius 
		System.out.println (98.00-32.00 * (5/9));
		//Momentum 
		System.out.println(10 * 12 + " kilogram meters per second");
		//Perimeter and area  
		System.out.println((2*(4.5+2.3)) + " feet" );
		System.out.println((2.3*4.5) + " square feet");
		//Minutes in a year 
		System.out.println(((60*24)*365) + " minutes in a year " );
		//The distance light travels a year 
		System.out.println(Math.pow(3,Math.pow(10, 8)) * 365*(60*24*(60)) + " meters is how much distance light travels a year ");
		

	}

}
