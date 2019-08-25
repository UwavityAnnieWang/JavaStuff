//For Loops Project 2
import java.util.Scanner;
import java.lang.Math;
public class Set1AnnieWangForLoops2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Select one of these by entering the number");
		System.out.println("Project Number 1: lists and counts all numbers divisible by 7 or 5 between 0 and 500");
		System.out.println("Project Number 2: ");
		System.out.println("Project Number 3:");
		System.out.println("Project Number 4:");
		System.out.println("Project Number 5");
		
		int choose = s.nextInt();
		switch (choose) {
		case 1:
		//Project number 1
		int count =0;
		for(int i=0; i<500; i++) {
			if(i%5==0||i%7==0) {
				System.out.println(i);
				count++;
				
			}
			
		}System.out.println("There are "+ count + " numbers between 0 and 500 that are divisible by 5 & 7");
		break;
		//Project number 2
		case 2:
			
			
			
			
			break;
		case 3:
			
			break;
		case 4:
			break;
		case 5:
			break;
			default:
				System.out.println("Invalid. Please try again");
		
		}
		

		




		

	}

}
