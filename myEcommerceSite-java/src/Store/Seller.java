package Store;

import java.util.InputMismatchException;

public class Seller extends store {
	public static void seller() {
		System.out.println("          Logged in as seller");
		while (true) {
			System.out.println("What would you like to do:-");
			System.out.println("1. Show your products");
			System.out.println("2. Add a product");
			System.out.println("3. Remove a product");
			System.out.println("4. Contact Admin");
			System.out.println("5. Exit");
			int option = sc.nextInt();
			if (option == 1) {
				pd.getSellerProduct(uId);
			}
			if (option == 2) {
				int ch = 0;
				int ch2 = 0;
				int id = 0;
				String product = null;
				int price = 0;
				int stop = 0;
				while (true) {
					ct.cat();
					if (sc.hasNextInt()) {
						ch = sc.nextInt();
					} else {
						System.out.println("TRY AGAIN!!");
						sc.next();
					}

					if (ch == 1) {
						ct.subCat();
						if (sc.hasNextInt()) {
							ch2 = sc.nextInt();
							break;
						} else {
							System.out.println("TRY AGAIN!!");
							sc.next();
						}
					}
					else {
						break;
					}
				}

					while (stop == 0) {

						try {
							System.out.println("Enter the product id:");
							id = sc.nextInt();
							System.out.println("Enter the product name:");
							product = sc.next();
							System.out.println("Enter the price:");
							price = sc.nextInt();
							stop = 1;
						} catch (InputMismatchException e) {
							System.out.println("Value must be an integer!!");
							System.out.println("");
							sc.next();
						}
					}
					if(ch > 1) {
						ch += 2;
					}
					String sch = Integer.toString(ch);
					String sch2 = Integer.toString(ch2);
					String sid = Integer.toString(id);
					String sprice = Integer.toString(price);
                    if(ch == 1) 				   
				    	sch = sch2;
                    sid = sch + "." + id;
				    String p = sid + " " + product + " " + sprice;
				    pd.setProduct(uId, p);
			}

			if (option == 3) {
				String ans2;
				pd.getSellerProduct(uId);
				System.out.println("Enter the product id that you want to remove:-");
				if (sc.hasNextFloat()) {
					ans2 = sc.next();
					pd.removeProduct(ans2, uId);

				} else {

					System.out.println("TRY AGAIN!!");
					sc.next();
				}
			}
			if (option == 4) {
				System.out.println("Admin contact details: xxxxxxxxxxxx");
			}
			if (option == 5) {
				break;
			}
		}
	}
}
