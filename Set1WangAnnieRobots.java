/*Robots! Project 
 * by Annie Wang
 * begun 2/19/19
 * Project first asks user to input robot id and command for robot then prints them out
 * Then asks user to input two integers, characters and Strings and adds them up to their respective
 * types with Method Overloading */
import java.util.Scanner;
public class Set1WangAnnieRobots {
	//Adds the id of the robot and the command together
	public static String confuse(int rob, String command) {
		return ("Robot # " + rob + " " + command);
	}
//Adds two integers, returns the sum
	public static int add (int one, int two) {
		return(one + two);
		
	}
	//Adds two Strings, returns a String
	public static String add (String one, String two) {
		return(one + two);
	}
	//Adds two characters, returns a character after converting the characters to ASCII
	public static char add(char one, char two) {
		return(char)(one + two);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		//Confuse
		System.out.println("Please input the robot's id number and command it to do something (dont use any spaces)");
		int id = s.nextInt();
		String something = s.nextLine();
		System.out.println(confuse(id, something));
		//Add with integers
		System.out.println("Please input two integers");
		int one = s.nextInt();
		int two = s.nextInt();
		
		//Add with characters
		System.out.println("Please input two characters");
		char on = s.next().charAt(0);
		char tw = s.next().charAt(0);
		
		//Add with Strings 
		System.out.println("Please input two Strings");
		String o = s.nextLine();
		String t = s.nextLine();
		//Prints them out individually
		System.out.println(one + " + " + two + " = " + add(one, two) );
		System.out.println(on + " + " + tw + " = " + add(on, tw));
		System.out.println(o + " + " + t + " = " + add(o,t));
		
		
		
	}
	 
}
