import java.lang.Math;
import java.util.Scanner;
public class AnnieWangSetOneLibraryFunctions {

	public static void main(String[] args) {
		//Annie Wang
		//10/17/18
		//Library Functions
		//Ice skating 
		//Ice skating 3
		
		Scanner s = new Scanner(System.in);
		System.out.println(Math.cos(Math.sqrt(Math.abs(-8))));
		//Penguin
		int year;
		System.out.println("Please give this program a year");
		year = s.nextInt();
		System.out.println( "Here is the time of year the penguin thing will happen"+ (Math.abs(Math.cos(Math.sqrt(year%25)))));
		//log
		int number;
		System.out.println("Please input a number:");
		number = s.nextInt();
		System.out.println("Here is the natural log for this number:"+(Math.log(year)));
		//Johnny Johny yes Appleseed
		int temp;
		System.out.println("Please input a temperature");
		temp = s.nextInt();
		System.out.println(1000*(Math.abs(Math.sin(Math.pow(temp, 3)))));
		
		
		
	
		
		
		
		
	}

}
