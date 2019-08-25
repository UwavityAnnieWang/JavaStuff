import java.util.Scanner;
import java.math.*;
public class guessMyNumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = (int)(Math.random()*10);
		
		System.out.println("Please guess a number");
		int y = s.nextInt();
		 do { 
			
			System.out.println("Please try again");
			y = s.nextInt();}
			while (!(x==y));
		  if(x==y) {
			 System.out.println("You got it!");
		 }
			
			
			
		 
		
		
		
		
		
	}

}
