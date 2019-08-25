/**Set 1
 * Started 4/2/19
 * @author Annie Wang
 *Cylinder Class, intakes double instance variable height and Circle base, has getters and setters for both
 *instance variables and has a getter for surface area and volume 
 */
public class Cylinder {
	//instance variables 
	private double height;
	private Circle base;
	//default values 
	public Cylinder() {
		height = 0.0;
		base = new Circle();
	}
	//constructor
	public Cylinder(double some, Circle a) {
		height = some;
		base = a;
	}//setters
	public void setHeight(double some) {
		height = some;
	}
	
	public void setBase(Circle some) {
		base = some;
	}//getters
	public double getHeight() {
		return height;
	}
	public Circle getBase() {
		return base;
	}//volume and surface area getters
	public double Volume() {
		return base.getArea()*height;
	}
	public double SurfaceArea() {
		return (2*Math.PI*(Math.pow((base.getDiameter()/2), 2)))+(2*Math.PI*(base.getDiameter()/2)*height);
	}
	public String toString() {
		return "Height: " + height + " Base: " + base + " Volume: " + Volume() + " Surface Area: " + SurfaceArea() ;
	}

}
