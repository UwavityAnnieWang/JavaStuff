/**Set 1
 * Started 4/2/19
 * @author Annie Wang 
 *Implements the Circle, Cone and Cylinder classes, creates a circle first for cone and cylinder and uses it
 *In a loop until you choose to exit 
 */
import java.util.Scanner;
public class GeometryMain {
public static void main(String[]args) {
	Scanner s = new Scanner(System.in);
	//Asks you to choose your method 
	System.out.println("Please choose cylinder (y), cone(o) or circle(c)");
	System.out.println("input e to exit ");
	char somebody = s.next().charAt(0);
	//while loop for using methods 
	while(somebody=='y'||somebody=='Y'||somebody=='C'||somebody=='c'||somebody=='o'||somebody=='O') {
		//Cylinder class 
		if(somebody=='y'||somebody=='Y') {
			System.out.println("You chose cylinder class!");
			//makes base first 
			System.out.println("Please input the name and diameter of the base (a circle)");
			//circle name
			String onceToldMe = s.next();
			//circle diameter
			double theWorldWas =s.nextDouble();
			//makes new circle 
			Circle onceToldMe1 = new Circle(theWorldWas);
			//makes cylinder second 
			System.out.println("Now please input the name and height of your cylinder");
			//name of cylinder
			String gonnaRollMe = s.next();
			//height of cylinder
			double iAintTheSharpest = s.nextDouble();
			//uses previous circle for base in cylinder
			Cylinder gonnaRollMe1 = new Cylinder(iAintTheSharpest, onceToldMe1);
			//to string 
			System.out.println(gonnaRollMe1);
			
		}//Cone class 
		else if (somebody=='o'||somebody=='O') {
			System.out.println("You chose cone class!");
			//makes circle for base
			System.out.println("Please input the name and diameter of the base (a circle)");
			//name of circle
			String onceToldMe = s.next();
			//diameter of circle
			double theWorldWas =s.nextDouble();
			//makes new circle
			Circle onceToldMe1 = new Circle(theWorldWas);
			//now uses circle as base for cone, also making new cone
			System.out.println("Now please input the name and height of your cone");
			//name of cone
			String gonnaRollMe = s.next();
			//height of cone
			double iAintTheSharpest = s.nextDouble();
			//makes new cone 
			Cone gonnaRollMe1 = new Cone(iAintTheSharpest, onceToldMe1);
			//cone to string
			System.out.println(gonnaRollMe1);
		}//Circle class 
		else if(somebody=='c'||somebody=='C') {
			System.out.println("You chose circle class!");
			//makes circle
			System.out.println("Please input the name and diameter of your circle");
			//circle name
			String onceToldMe = s.next();
			//circle diameter
			double theWorldWas =s.nextDouble();
			//makes new circle 
			Circle onceToldMe1 = new Circle(theWorldWas);
			//circle to string 
			System.out.println(onceToldMe1);
		}//asks if you want to try again 
		System.out.println("Do you want to try again?");
		System.out.println("Y for yes, n for no");
		char toolInTheShed = s.next().charAt(0);
		if(toolInTheShed=='Y'||toolInTheShed=='y') {
			System.out.println("Please choose cylinder (y) cone(o) or circle(c)");
			somebody = s.next().charAt(0);
		}
		else if(toolInTheShed=='N'||toolInTheShed=='n') {
			System.out.println("Terminated");
			somebody=('e');
		}
	}
	//what happens if you exit 
	if(somebody =='e'||somebody=='E') {
		System.out.println("Exited");
	}
	
		
	
}
}
