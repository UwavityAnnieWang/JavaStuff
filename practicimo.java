import java.lang.Math;
import java.util.Scanner;
public class practicimo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Doge
		int age;
		System.out.println("input the age of your dog");
		age = s.nextInt();
		System.out.println("This is the age of your dog in human years:" +((((age-1)/3)*16)+13)); 
		double current_annual_salary;
		double bonusPercentage;
		System.out.println("Input your annual salary and bonus percentage");
		current_annual_salary = s.nextDouble();
		bonusPercentage = s.nextDouble();
		
		System.out.println("here is your bonus percentage: "+ (current_annual_salary*(bonusPercentage/100)));
		//Max 
		int one;
		int two;
		int three;
		System.out.println("input three integers");
		one = s.nextInt();
		two = s.nextInt();
		three = s.nextInt();
		System.out.println("here is the max for two numbers: " + Math.max(one, two) );
		System.out.println("Here is the max for another two numbers:  " + Math.max(two, three));
		System.out.println("Here is the max for the other two numbers : " + Math.max(three, one));
		//BMI
		double weight;
		double height;
		System.out.println("Input your height (inches) and weight (pounds)");
		weight = s.nextDouble();
		height = s.nextDouble();
		double BMI;
		BMI = ((weight*0.454)/(Math.sqrt(height * 0.0254)));
		System.out.println("Here is your BMI in kilograms and meters " + BMI );
		//challenge program maybe 
		
		
		
		
		
			
		
		
		
		
	}

}
