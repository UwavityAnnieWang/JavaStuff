/**Set 1 
 * Started: 5/26/19
 * @author Annie Wang 
 *Takes in a string name and a double salary, has modifiers and getters for both 
 */
public class Employee {
	//instance variables 
	private String name;
	private double salary;
	//default constructor
	public Employee() {
		name = " ";
		salary = 0.0;
	}
	//second constructor 
	public Employee(String something, double yay) {
		name = something;
		salary = yay;
	}//setters 
	public void setName(String kirby) {
		name = kirby;
	}
	public void setSalary(double kingDe) {
		salary = kingDe;
	}//getters
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}//to String 
	public String toString() {
		return " Name:  " + getName() + " Salary: "+ getSalary();
	}
	
	

}
