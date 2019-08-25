import java.util.Scanner;
public class another {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//asterix problemo
		System.out.println("Please input an integer");
		int n = s.nextInt();
		for (int i = 0; i<n; i++ ) {
			System.out.println();
			for(int l = 0; l<n; l++) {
				System.out.print("* ");
			}
		}
		System.out.println();
		//entering different values rectangle
		System.out.println("Please input one value");
		int width = s.nextInt();
		System.out.println("Please input another value");
		int length = s.nextInt();
		for (int i = 0; i<length; i++) {
			System.out.println();
			for (int k = 0; k<width; k++) {
				System.out.print("* ");
			}
		}
		System.out.println();
		//number table
		System.out.println("Please input a number");
		int first = s.nextInt();
		System.out.println("Please input another number");
		int second = s.nextInt();
		for (int i = 0; i<=first; i++) {
			System.out.println();
			for(int k = 0; k <=second; k++) {
				System.out.print(k+i);
				
			}
		}
		System.out.println();
		



	}

}
