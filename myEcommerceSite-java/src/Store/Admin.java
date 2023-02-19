package Store;

import java.util.Scanner;

public class Admin extends store {
	public static void admin() {
		int count = 0;
		System.out.println("          Logged in as Admin");
		System.out.println("");
		System.out.print("Total number of Cutomers: ");
		for (int i = 0; i < details.getLength(); i++) {
			if (details.getUser(0, i) != null) {
				count++;
			}
		}
		System.out.println(+count);
		System.out.println("");
		System.out.print("Total number of Sellers: ");
		count = 0;
		for (int i = 0; i < details.getLength(); i++) {
			if (details.getUser(1, i) != null) {
				count++;
			}
		}
		System.out.println(+count);
		System.out.println("");
		System.out.print("Total numer of Products: ");
		System.out.println(pd.getTotalProoduct());
		System.out.println("");
		System.out.println("          Press ENTER to exit");
		@SuppressWarnings("resource")
		Scanner end = new Scanner(System.in);
		end.nextLine();
	}

}
