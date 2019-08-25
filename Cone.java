/**Set 1
 * Started 4/2/19
 * @author Annie Wang
 *Cone Class, intakes  double instance variable height and  Circle base, has setters and getters for height
 *and the base, has getters for volume and surface area
 *
 */
public class Cone {
	//instance variables height and base
	private double height;
	private Circle base;
	//default values 
public Cone() {
	height = 0.0;
	base = new Circle();
}//constructor
public Cone(double reee, Circle e) {
	this.height=reee;
	this.base=e;
	
}//setters
public void SetHeight(double somebody) {
	height=somebody;
	
}
public void SetBase(Circle once) {
	this.base=once;
}
//getters
public double getHeight() {
	return height;
}
public Circle getBase() {
	return base;
}
public double Volume() {
	return (base.getArea()*height)*0.33;
}
public double SurfaceArea() {
	return (Math.PI*(Math.pow((base.getDiameter()/2), 2)))+(Math.PI*(base.getDiameter()/2)*height);
}
//To String 
public String toString() {
	return "Height: " + height + " Base: " + base + " Volume: " + Volume() + " Surface Area: " + SurfaceArea() ;
}

}
