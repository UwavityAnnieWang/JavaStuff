/**Set 1 
 * Annie Wang
 * Started 5/13/19
 * Array Project, uses the methods addEvenNeg, average and averageScore 
 */
import java.util.Scanner;
public class ArrayProject {
//Odd Even and Negative method 
public static void oddEvenNeg(int[] numbers) {
	
	int[] even = new int[10];
	int[] odd = new int [10];
	int[] neg = new int [10];
	
	int eCount=0, oCount = 0, nCount = 0;
	
	for(int i = 0; i < numbers.length; i++) {
		if(numbers[i]%2==0) {
			even[eCount]= numbers[i];
			eCount++;
		}
		
	}//prints out even array 
	for(int i=0; i<eCount; i++)
		System.out.print(even[i] + " ");
	System.out.println();
	
	
for(int k = 0; k <numbers.length; k++) {
	if(numbers[k]%2!=0) {
		odd[oCount]=numbers[k];
		oCount++;
	}
}//prints out odd array 
for(int k =0; k<oCount; k++)
	System.out.print(odd[k] + " ");
System.out.println();

for (int t =0; t<numbers.length; t++) {
	if(numbers[t]<0) {
		neg[nCount]=numbers[t];
		nCount++;
	}
}//prints out negative array 
for(int t =0; t<nCount; t++)
	System.out.print(neg[t]+ " ");

	
}

//average method
public static void average(double[] average) {
	double[] larger = new double[10];
	int bigger = 0; 
	double really = 0.0;
	for(int i=0; i<average.length; i++) {
		//calculates average 
		really=really+=average[i];
		
		
		}
	//calculates average 
	really=really/average.length;
	//prints out average 
	System.out.println("Your average is " + really);
	
	//if number is larger than average is put in seperate array 
	for(int k =0; k<average.length; k++) {
		if(average[k]>really) {
			larger[bigger]=average[k];
			bigger++;
			System.out.println("Numbers greater than the average " + larger[bigger] + " ");
		}
		
	}
}//score average method
public static void averageScore(double[]scores) {
	
	double E = scores[0];
	double F = scores[0];
	double boba = 0.0;
	
	
	
	//calculates largest scores 
	int something = scores.length;
	for(int i = 0; i<scores.length; i++) {
		if(scores[i]>E) {
			E=scores[i];
			
		}
		if(scores[i]<F) {
			F=scores[i];
			
		}//calculates average 
		boba=boba+=scores[i];
		
		
	}
	//calculates average 
	boba=boba-(E+F);
	boba=boba/(int)(scores.length-2);
	//prints out average, high and low score 
	System.out.println("Your highest score is " + E);
	System.out.println("Your lowest score is " + F);
	System.out.println("Your average is " + boba);
	
	
	

	

}




//main method 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please choose one array");
		//instructions for choosing 
		System.out.println("1 for the odd even project, 2 for the average project, 3 for the average score, 9 to stop");
		int something = s.nextInt();
		//if statement for choosing 
		if(something==1||something==2||something==3) {
			//odd even project 
			if(something==1) {
			System.out.println("You chose the odd even negative project");
			System.out.println("Please input 10 integers, negative or positive");
			//takes in 10 numbers and puts them in array
			//then array is used in project 
			int [] fun = new int[10];
			for(int i =0; i<fun.length; i++) {
				fun[i]=s.nextInt();
			}
			
			oddEvenNeg(fun);
			
			}//average project 
			if(something==2) {
				System.out.println("You have chosen the average project");
				System.out.println("Please input 10 numbers");
				//takes in 10 numbers and puts them into an array 
				//then array is used in method 
				double []avenge = new double[10];
				for(int i =0; i<avenge.length; i++) {
					avenge[i]=s.nextDouble();
				}
				average(avenge);
				
			}//average score project 
			if(something==3) {
				System.out.println("You have chosen the average score project ");
				System.out.println("Please input 8 numbers");
				//takes in 8 numbers and puts them in an array
				//array is then used 
				double[]score = new double[8];
				for(int i =0; i<score.length; i++) {
					score[i]=s.nextDouble();
				}
				averageScore(score);
				
			}
			if(something==9) {
				System.out.println("Thank you for using this program");
			}
		}
		
		
		

	}

}
