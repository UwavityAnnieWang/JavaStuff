import java.util.Scanner;
public class ifPractice {

	public static void main(String[] args) {
		//Odd vs Even
		Scanner s = new Scanner(System.in);
		int x;
		System.out.println("Please input a number ");
		x=s.nextInt();
		if (x%2==0)
		{ System.out.println("the number is even");}
		if (x%2 != 0)
		{ System.out.println(" the number is odd");}
		//Negative vs Postive
		int y;
		System.out.println("Please input a number");
		y = s.nextInt();
		if (y > 0)
		{System.out.println("The number is positive");}
		if ( y < 0)
		{System.out.println("The number is negative");}
		if (y == 0)
		{System.out.println("Zero is neither positive nor negative");}
		//Integer is factor, question mark
		int r;
		int t;
		System.out.println("Please input two numbers ");
		r = s.nextInt();
		t = s.nextInt();
		if (t%r==0)
		{ System.out.println( r +" is a factor of "+ t);}
		if (t%r != 0)
		{System.out.println(r + " is not a factor of " + t);}
		//I think I'm done
		int temp;
		System.out.println("Please input a number for water temp");
		temp = s.nextInt();
		if (temp<=0)
		{System.out.println("It is ice");}
		if (temp==100)
		{System.out.println("the Water is gas");}
		else;
		{System.out.println("The water is liquid");}
		//switch system
	     int ID = 0;
		 double price = 0;
		 System.out.println("Please input an ID");
		 ID = s.nextInt();
		switch (ID) { 
		case 1:
			price = 50.55;
			break;
		case 2:
			price = 12.35;
		case 9:
			price = 12.35;
			break;
		case 5:
			price = 11.46;
			break;
		case 7:
			price = 11.46;
			break;
		case 11:
			price = 11.46;
			default:
			System.out.println("Invalid");
			int i;
			int e;
			Scanner in = new Scanner(System.in);
			System.out.print("Please enter a number: ");
			e = in.nextInt();

			if (e > 300) {
			   i = e;
			}
			else {
			   i = 0;
			}

			System.out.println("x: " + x);
			
		
			
		
		}
		 
		
		
		
		
		
		
		

	}

}
