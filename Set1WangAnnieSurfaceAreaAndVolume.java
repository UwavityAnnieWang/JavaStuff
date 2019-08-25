//Surface Area and Volume Project
//By Annie Wang 
//Begun 2/5/19
/*Project will allow user to use methods to calculate the volume and surface area 
 * of three dimensional objects until the user inputs a certain number */
import java.util.Scanner;

public class Set1WangAnnieSurfaceAreaAndVolume {
	//Calculates the volume of a sphere
	public static double sphereVolume(double radius) {
		return(Math.pow(radius, 3)*(4/3.0)*Math.PI );
	}
	//Calculates the surface area of a sphere
	public static double sphereSurface(double radius) {
		return(Math.pow(radius, 2) * 4 * Math.PI);
	}
	//Calculates the volume of a cone
	public static double coneVolume(double radius, double height) {
		return(Math.pow(radius, 2)*height*(1/3.0)*Math.PI);
	}
	//Calculates the surface area of a cone
	public static double coneSurfaceArea(double radius, double height ) {
		return((Math.PI*(Math.pow(radius, 2)))+(Math.PI*radius)*(Math.sqrt(Math.pow(radius, 2)+Math.pow(height, 2))));
	}
	//Calculates the volume of a cylinder
	public static double cylinderVolume(double radius, double height) {
		return(Math.pow(radius, 2)*Math.PI*height);
	}
	//Calculates the surface area of a cylinder
	public static double cylinderSurface(double radius, double height) {
		return((Math.PI*2*Math.pow(radius, 2))+(2*Math.PI*radius*height));
	}
	//Calculates the volume of a rectangular prism
	public static double rectVolume(double length, double width, double height ) {
		return(length*width*height);
	}
	//Calculates the surface area of a rectangular prism
	public static double rectSurf(double length, double width, double height) {
		return((2*length*width)+(2*length*height)+(2*width*height));
		
	}
	
	public static void main(String[]args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Please input the number for the function you want to use");
		System.out.println("1 for rectangular prism, 2 for sphere, 3 for cone and 4 for cylinder");
		System.out.println("Choose 5 if you want to terminate");
		int choose = s.nextInt();
		//Switch statement within a while loop that tests whether or not the user inputs 5
		while(choose!=5) {
			switch(choose) {
			case 1://(Rectangular Prism)
				System.out.println("Please choose either surface area(1) or volume(2)");
				int another = s.nextInt();
				//switch statement for choosing either surface area method or volume method
				switch(another) {
				case 1://Surface area
					System.out.println("Please input the values for length, width and height");
					double length = s.nextDouble();
					double width = s.nextDouble();
					double height = s.nextDouble();
					System.out.println(rectSurf(length, width, height));
					break;
				case 2://Volume
					System.out.println("Please input the values for length, width and height");
					double l = s.nextDouble();
					double w = s.nextDouble();
					double h = s.nextDouble();
					System.out.println(rectVolume(l, w, h));
					break;
					default:
						System.out.println("Please try again");
						
					
				}
				break;
			case 2://(Sphere)
				System.out.println("Please choose surface area(1) or volume(2)");
				int sigh = s.nextInt();
				//switch statement for choosing surface area method or volume method 
				switch(sigh) {
				case 1://Surface Area
					System.out.println("Please input the value for the radius");
					double radius = s.nextDouble();
					System.out.println(sphereSurface(radius));
					break;
				case 2://Volume 
					
					System.out.println("Please input the value for the radius");
					double radi = s.nextDouble();
					System.out.println(sphereVolume(radi));
					break;
					default:
						System.out.println("Please try again");
						
				}
				break;
			case 3://(Cone)
				System.out.println("Please choose surface area(1) or volume(2)");
				int lo = s.nextInt();
				switch(lo) {
				case 1://Surface Area
					System.out.println("Please input the values for radius and height");
					double radius = s.nextDouble();
					double height = s.nextDouble();
					System.out.println(coneSurfaceArea(radius, height));
					break;
				case 2://Volume 
					System.out.println("Please input the values for radius and height");
					double r = s.nextDouble();
					double h = s.nextDouble();
					System.out.println(coneVolume(r, h));
					break;
					default:
						System.out.println("Please try again");
						
				}
				break;
			case 4://Cylinder
				System.out.println("Please choose surface area(1) or volume (2)"); 
				int last = s.nextInt();
				switch(last) {
				case 1://Surface Area
					System.out.println("Please input values for the radius and height");
					double radius = s.nextDouble();
					double height = s.nextDouble();
					System.out.println(cylinderSurface(radius, height));
					break;
				case 2://Volume
					System.out.println("Please input values for the radius and height");
					double r = s.nextDouble();
					double h = s.nextDouble();
					System.out.println(cylinderVolume(r, h));
					break;
					default:
						System.out.println("Please try again");
				}
				
				break;
				default:
					
			}
			System.out.println("Please choose again");
			choose = s.nextInt();
		}
		if(choose==5) {
			System.out.println("Terminated");
		}
		
				
				}
				
			
		

		
	}
	


