/**Set 1 
 * Started: 3/27/19
 * @author Annie Wang
 *Takes in instance variables width and length
 *Has setters for width and length and getters for them, also
 *has getters for perimeter and area 
 */
public class Rectangle{
	//instance variables 
	private double width;
	private double length;
	//default values
	public Rectangle() {
		width = 0.0;
		length = 0.0;
	}//constructor
	public Rectangle(double one, double two) {
		width = one;
		length = two;
		
	}//setters
	public void SetWidth(double some) {
		width = some;
	}
	public void SetLength(double thing) {
		length = thing;
	}//getters
	public double GetWidth() {
		return width;
	}
	public double GetLength() {
		return length;
	}
	public double GetPerimeter() {
		return (2*length)+(2*width);
	}
	public double GetArea() {
		return length * width;
	}//to string 
	public String toString() {
		return "Width: " + width + " Length:" + length;
	}
}
