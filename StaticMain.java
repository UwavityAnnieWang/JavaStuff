/**Set 1 
 * I have no idea when this was started, around 5/3/19
 * @author Annie Wang 
 *Class StaticMain, takes user input to determine whether or not the side lengths
 *could create a valid triangle using methods from the Triangle class 
 */
import java.util.Scanner;
public class StaticMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//areTriangular tester
		System.out.println("Please input values to see whether or not they can create a valid triangle");
		double one = s.nextDouble();
		double two = s.nextDouble();
		double three = s.nextDouble();
		if(Triangle.areTriangular(one, two, three)==true) {
			System.out.println("Your values can create a valid triangle");
		}
		else if(Triangle.areTriangular(one, two, three)==false) {
		System.out.println("Your values cannot create a valid triangle");}
		//acuteTriangle tester
		System.out.println("Please input values to see if they can create a valid acute triangle ");
		one=s.nextDouble();
		two=s.nextDouble();
		three=s.nextDouble();
		if(Triangle.acuteTriangle(one, two, three)==true) {
			System.out.println("Your values create a valid acute triangle");
		}
		else if(Triangle.acuteTriangle(one, two, three)==false) {
			System.out.println("Your triangle is not a valid acute triangle");
		}
		
		
		//obtuseTriangle tester
		System.out.println("Please input values to see if they can create a valid obtuse triangle");
		one=s.nextDouble();
		two=s.nextDouble();
		three=s.nextDouble();
		if(Triangle.obtuseTriangle(one, two, three)==true) {
			System.out.println("Your values create a valid obtuse triangle");
		}
		else if(Triangle.obtuseTriangle(one, two, three)==false){
		System.out.println("Your values do not create a valid obtuse triangle");}
		//rightTriangle tester
		System.out.println("Please input values to see if they could create a valid right triangle");
		one=s.nextDouble();
		two=s.nextDouble();
		three=s.nextDouble();
		if(Triangle.rightTriangle(one, two, three)==true) {
			System.out.println("Your values create a valid right triangle");
		}
		else if(Triangle.rightTriangle(one, two, three)==false){
			System.out.println("Your values do not create a valid right triangle");
		}
		//scaleneTriangle tester
		System.out.println("Please input values to see if they can create a valid scalene triangle");
		one=s.nextDouble();
		two=s.nextDouble();
		three=s.nextDouble();
		if(Triangle.scaleneTriangle(one, two, three)==true) {
			System.out.println("Your values create a valid scalene triangle");
		}
		else if(Triangle.scaleneTriangle(one, two, three)==false){
			System.out.println("Your values do not create a valid scalene triangle");
		}
		//isoscelesTriangle tester
		System.out.println("Please input values to see if they can create a valid isosceles triangle");
		one=s.nextDouble();
		two=s.nextDouble();
		three=s.nextDouble();
		if(Triangle.isoscelesTriangle(one, two, three)==true) {
			System.out.println("Your values create a valid isosceles triangle");
		}
		else if(Triangle.isoscelesTriangle(one, two, three)==false){
			System.out.println("Your values do not create a valid isosceles triangle");
		}
		//equilateralTriangle tester 
		System.out.println("Please input values to see if they can create a valid equilateral triangle");
		one=s.nextDouble();
		two=s.nextDouble();
		three=s.nextDouble();
		if(Triangle.equilateralTriangle(one, two, three)==true) {
			System.out.println("Your values create a valid equilateral triangle");
		}
		else if(Triangle.equilateralTriangle(one, two, three)==false) {
			System.out.println("Your values do not create a valid equilateral triangle");}
		
		


	}

}
