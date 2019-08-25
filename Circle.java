/**Set 1
 * Started 4/2/19
 * @author Annie Wang
 *Started 4/2/19
 *Class Circle, intakes  double instance variable diameter, has setter and getters for diameter and getters 
 *for area and perimeter
 */
public class Circle {
	//instance variable
private double diameter;
//default value 
public Circle() {
	diameter = 0.0;
}//constructor
public Circle(double some) {
	diameter = some;
}//setter
public void setDiameter(double body) {
	diameter = body;
}//getter
public double getDiameter() {
	return diameter;
}//getter of area 
public double getArea() {
	return (Math.pow((diameter/2), 2)*Math.PI);
}//getter of perimeter
public double getPerimeter() {
	return diameter * Math.PI;
}

//to string 
public String toString() {
	return "Your diameter is " + diameter + " Area: " + getArea() + " Perimeter: " + getPerimeter();
}
}
