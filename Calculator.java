import java.lang.Math;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) { 
	Scanner s = new Scanner(System.in);
	double numberOne;
	double numberTwo;
	double numberThree;
	System.out.println("enter a number");
	numberOne = s.nextDouble();
	System.out.println("enter another number");
	numberTwo = s.nextDouble();
	System.out.println("enter a third number");
	numberThree = s.nextDouble();
	//hahahahahahahahahhahahahahahahahahah
	/*haahahahhahahahhahahahahhahah
	 * well I guess this is cool
	 */
	
	
	
	
	
	
	
	
	System.out.println("You input the values "+ numberOne +" and "+ numberTwo);
	System.out.println("The absolute value of "+ numberOne + " is " + Math.abs(numberOne)  );
	System.out.println("The absolute value of " + numberTwo + " is " + Math.abs(numberTwo));
	System.out.println("The natural logarithm of " + numberOne + " is " + Math.log(numberOne) );
	System.out.println("The natural logarithm of " + numberTwo + " is " + Math.log(numberTwo));
	System.out.println(numberOne + " to the " + numberThree + " power is " + Math.pow(numberOne, numberThree));
	System.out.println(numberTwo + " to the " + numberThree + "power is " + Math.pow(numberTwo, numberThree));
	System.out.println(numberOne + "'s square root is " + Math.sqrt(numberOne) );
	System.out.println(numberTwo + "'s square root is " + Math.sqrt(numberTwo) );
	System.out.println("The cosine of " + numberOne + " is " + Math.cos(numberOne));
	System.out.println("The cosine of " + numberTwo + " is " + Math.cos(numberTwo));
	System.out.println(numberOne + " rounded is " + Math.round(numberOne) );
	System.out.println(numberTwo + " rounded is " + Math.round(numberTwo));
	
	
	

	}

}
