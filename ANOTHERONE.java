import java.util.Scanner;

public class ANOTHERONE {

	public static void main(String[] args) {
	Scanner u = new Scanner(System.in);
	int quantity;
	int second;
	System.out.println("how many do you want?");
	quantity = u.nextInt();
	System.out.printf("%4d %-40s $%-,1.2f%n", quantity, "Total", quantity*19.99);
	System.out.println("second value?");
	second = u.nextInt();
	System.out.printf("%4d %-40s $%-,1.2f%n", quantity, "Total", quantity*19.99);
	
	// "-" means right justified, this above is formatting 1.2 means two digits after decimal place 
	//I actually don't know how to do this 
	}

}
