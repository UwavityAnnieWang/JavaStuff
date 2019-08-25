
public class FunctionThing {

	public static void rapName(String food) {
		if(food.charAt(0)=='P'|| food.charAt(0)=='T')
		System.out.println("Big " + food);
		
		else
			System.out.println("Lil " + food);
		
		
		/* hello this is a comment greentext >be me
		 * >be an idiot anon
		 * >be using eclipse
		 * >much kek
		 *  */
	}
	public static int getRand(double limit) {
		return(int)(Math.random()*limit)+1;
	}
	
	public static void main(String[] args) {
		System.out.print(getRand(Math.PI));
	}
}
