//Chapter 2 project
import java.util.Scanner;
import java.lang.Math;
public class Set1WangAnnieChapter3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Menu
		System.out.println("Select one of the following");
		System.out.println("1. The quotient and remainder of two numbers");
		System.out.println("2. Find the slope of a line passing through two coordinates ");
		System.out.println("3. Determine whether a triangle is a scalene, equilateral or isosceles");
		System.out.println("4. Determines whether an object floats or sinks");
		System.out.println("5. Unit Converter");
		System.out.println("6. Reports your weight on different planets");
		int inter = s.nextInt();
		//Switch Statement starts here
		switch (inter) {
		//The quotient + remainder project
		case 1:
			System.out.println("Please input two integers, the result will print out the quotient and remainder (integer only)");
			int one = s.nextInt();
			int two = s.nextInt();
			//If statement determining which integer is larger and then dividing them
			if (one > two) {
				System.out.println((one / two) + " r " + (one%two) ); 
			}
			else if (one < two) {
				System.out.println((two/one) + " r " + (two%one));
			}
			else if (one == two) {
				
				System.out.println("These two are equal, therefore the quotient and remainder are both 0");
			}
			break;
		case 2:
			//Slope of line 
			System.out.println("Please input two coordinates to use (x and y values for each) (integer only)");
			//x value
			int first = s.nextInt();
			//y value
			int second = s.nextInt();
			//x value
			int third = s.nextInt();
			//y value 
			int fourth = s.nextInt();
			if (second - fourth == 0 ) {
				//Avoiding Java dividing by 0 error
				System.out.println("The slope of this line is undefined");
				
			}
			else if (second - fourth != 0 ) {
				//Normal slope 
				System.out.println("The slope of the line that goes through these points is " + (first-third)/(second-fourth));
			}
			 
			
			
			break;
		case 3:
			//Triangle type
			System.out.println("Please input three values for the  length of the sides of a triangle (integer only)");
			int oneside = s.nextInt();
			int twoside = s.nextInt();
			int threeside = s.nextInt();
			if (oneside == twoside && twoside == threeside) {
				//Determining whether or not the triangle is equilateral
				System.out.println("This triangle is an equilateral triangle");
			}
			else if (oneside == twoside && twoside != threeside || oneside == threeside && threeside != twoside || oneside == threeside && threeside != twoside) {
				//Determining whether or not the triangle is isosoceles
				System.out.println("This triangle is an iscoceles triangle");
			}
			else if (oneside != twoside && twoside != threeside) {
				//Determining whether or not the triangle is scalene
				System.out.println("This triangle is a scalene triangle");
			}
			break;
		case 4:
			//Mass and Volume
			System.out.println("Please input the mass and volume of an object (integer only)");
			double mass = s.nextDouble();
			double volume = s.nextDouble();
			if (volume == 0 || mass == 0) {
				//Avoiding divide by 0 error, plus volume of object = 0 or mass = 0 not possible
				System.out.println("Invalid. Please try again.");
			}
			else if ((mass/volume) < 1) {
				System.out.println("This object floats");
			}
			else if ((mass/volume) > 1) {
				System.out.println("This object sinks");
			}
			
			break;
		case 5:
			//Unit converter
			System.out.println("Please input a unit and value, units are pounds (P) Miles (M) and feet(F) (integer only)");
			String unit = s.next();
			double value = s.nextDouble();
			switch (unit) {
			//if user inputs pound
			case "P":
			case "p":
				System.out.println(value + " " + unit + "is equal to " + (value * 4.44) + " Newtons");
				break;
				//if user inputs feet
			case "F":
			case "f":
				System.out.println(value + " " + unit + "is equal to " + (value / 3.28) + " Meters");
				break;
				//if user inputs meters
			case "M":
			case"m":
				System.out.println(value + " " + unit + "is equal to " + (value * 1.6) + " Kilometers");
				break;
			
			default:
				System.out.println("This unit is not included, please try again");
			}
			
			
			
			
			
			break;
		case 6:
			//Planet mass 
			System.out.println("Please input a planet first and your weight on Earth (integer only)");
			//Planet you choose, you have to input this first otherwise there will be an error
			String planet = s.next();
			//Your weight on Earth
			int earthWeight = s.nextInt();
			
			switch (planet) {
			case "Mercury":
				//I did an uppercase and lowercase varient just in case someone was lazy
			case "mercury":
				//Prints out your weight on Mercury
				System.out.println("Your weight on " + planet + " is " + ((double)earthWeight * 0.38) );
				
				break;
			case "Venus":
			case "venus":
				//Prints out your weight on venus 
				System.out.println("Your weight on " + planet + " is " + ((double)earthWeight * 0.78));
				break;
			case "Earth":
			case "earth":
				//Honestly, this wasn't needed but it's here anyway
				//Prints out your weight on Earth
				System.out.println("Your weight on " + planet + " is " + (double)earthWeight);
				break;
			case "Mars":
			case "mars":
				//Prints out your weight on Mars
				System.out.println("Your weight on " + planet + " is " + ((double)earthWeight * 0.39));
				break;
			case "Jupiter":
			case "jupiter":
				//Prints out your weight on Jupiter
				System.out.println("Your weight on " + planet + " is " + ((double)earthWeight * 2.65));
			
				break;
			case "Saturn":
			case "saturn":
				//Prints out your weight on Saturn
				System.out.println("Your weight on " + planet + " is " + ((double)earthWeight * 1.17));
				break;
			case "Uranus":
			case "uranus":
				//Prints out your weight on Uranus 
				System.out.println("Your weight on " + planet + " is " + ((double)earthWeight * 1.05));
				break;
			case "Neptune":
			case "neptune":
				//prints out your weight on Neptune
				System.out.println("Your weight on " + planet + " is " + ((double)earthWeight * 1.23));
				break;
			case "Pluto":
			case "pluto":
				//Can Pluto be counted in this project?
				//prints out your weight on Pluto, if someone were curious 
				System.out.println("Your weight on " + planet + " is " + ((double)earthWeight * 0.05));
				break;
				default:
					//If someone were to, say, input a body in the Keiper Belt or Asteroid belt or even an exoplanet
					System.out.println("Please input a planet in the Solar System. Bad input");
				
					
			}
			break;
			default:
				
				System.out.println("Invalid input. Please try again");
		}
		
		

	}

}
