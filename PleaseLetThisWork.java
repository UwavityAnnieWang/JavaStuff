import java.util.Scanner;

public class PleaseLetThisWork {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int NWPCQuantity;
		int MemoryCardQuantity;
		int DiskCardQuantity;
		int SoftwareQuantity;
		double NWPCPrice = 675;
		double MemoryCardPrice = 69.95;
		double DiskCardPrice = 198.50;
		double SoftwarePrice = 34.98;
		
		
		
		String name;
		System.out.println("what's your name?");
		name = s.nextLine();
		System.out.println("how many NPCWs?");
		NWPCQuantity = s.nextInt();
		
		System.out.println("How many memory cards?");
		MemoryCardQuantity = s.nextInt();
		
		System.out.println("How many disk cards?");
		DiskCardQuantity = s.nextInt();
		System.out.println("How much software?");
		SoftwareQuantity = s.nextInt();
		System.out.println("*******************************************");
		System.out.println("New Wave Computers");
		System.out.print("Customer:" + name);
		System.out.printf("%n");
		System.out.printf("%-19s  %-17s %-30s %n", "Quantity", "ITEM", "COST");
		
		System.out.printf("%-20d %-17s  $%,8.2f%n", NWPCQuantity, "NWPC", NWPCQuantity * NWPCPrice );
		System.out.printf("%-20d %-17s  $%,8.2f%n", MemoryCardQuantity, "Memory Cards", MemoryCardQuantity * MemoryCardPrice);
		System.out.printf("%-20d %-17s  $%,8.2f%n", DiskCardQuantity, "Disk Cards", DiskCardQuantity * DiskCardPrice);
		System.out.printf("%-20d %-17s  $%,8.2f%n", SoftwareQuantity, "Software", SoftwareQuantity * SoftwarePrice );
		System.out.printf("%28s         $%,8.2f%n", "TOTAL:", NWPCQuantity * NWPCPrice + MemoryCardQuantity * MemoryCardPrice + DiskCardQuantity * DiskCardPrice + SoftwareQuantity * SoftwarePrice );
		System.out.println("*******************************************");
		
	}

}
