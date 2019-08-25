/**Set 1 
 *Begun: 5/26/19 
 * @author Annie Wang 
 *Implements Employee class into array
 */
import java.util.Scanner;
public class NewWaveMain {
	//method for finding three highest salaries in array 
	public static void Fire(Employee[]thing) {
		
		//
		Employee one = thing[0];
		Employee two = thing[0];
		Employee three = thing[0];
		//finding first highest salary 
		for(int i = 0; i<thing.length; i++) {
			if(thing[i].getSalary()>one.getSalary()) {
				one=thing[i];
				
				
				}}// finding secound highest salary
		for(int k = 0; k<thing.length; k++) {
			if(thing[k].getSalary()!=one.getSalary()&&thing[k].getSalary()>two.getSalary()) {
				two=thing[k];
			}
			
		}//finding third highest salary
		for(int p = 0; p<thing.length; p++) {
			if(thing[p].getSalary()!=one.getSalary()&&thing[p].getSalary()!=two.getSalary()&&thing[p].getSalary()>three.getSalary()) {
				three=thing[p];
			}
		}
		
		//prints out statement specifiying who New Wave fires 	
		System.out.println("You are firing: " + one + two + three);
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	public static void main(String[]args) {
		//instigates new array 
		Employee[]array = new Employee[10];
		//putting values into array 
		array[0] = new Employee("Peter Gibbons", 54000 );
		array[1]= new Employee("Joanna", 26000);
		array[2]=new Employee("Michael Bolton", 63000);
		array[3] = new Employee("Samir Nagheenanajar",32000);
		array[4] = new Employee("Lawrence",23000);
		array[5] = new Employee("Milton Waddams",0);
		array[6]= new Employee("Bill Lumbergh",120000);
		array[7]=new Employee("Tom Smykowski",62000);
		array[8] = new Employee("Bob Slydell",75000);
		array[9] = new Employee("Bob Porter",72000);
		//uses method to determine who will be fired in array 
		Fire(array);
		
		
		
		
	}
	
	
	
	
	

}
