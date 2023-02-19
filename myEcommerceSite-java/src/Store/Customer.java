package Store;

import cart.cart;

public class Customer extends store {
	public static void customer() {
	while (true) {
		System.out.println("");
		System.out.println("What would u like to do:");
		System.out.println("1. Browse products");
		System.out.println("2. View cart");
		System.out.println("3. Check Orders");
		System.out.println("4. Remove an item from cart");
		System.out.println("5. Contact Admin");
		System.out.println("6. Exit");
		int option = sc.nextInt();
		if (option == 1) {
			while (true) {
				ct.cat();
				String option1 = sc.next();
				if (option1.equals("1")) {
					ct.subCat();
					String option2 = sc.next();
					if (option2.equals("1") || option2.equals("2") || option2.equals("3")) {
						System.out.println("");
						pd.getAllProduct(option2);
						System.out.println("");
					} else if (option2.equals("4"))
						break;
					else
						System.out.println("Enter a valid option!!");
				}

				else if (option1.equals("2"))
					pd.getAllProduct("4");
				else if (option1.equals("3"))
					pd.getAllProduct("5");
				else if (option1.equals("4"))
					pd.getAllProduct("6");
				else if (option1.equals("5"))
					pd.getAllProduct("7");
				else if (option1.equals("6"))
					break;
				else
					System.out.println("Enter a valid option!");

				System.out.println("");

				System.out.println("Do you want to add products to cart? (y/n)");
				String ans = sc.next();
				if (ans.equals("y")) {
					System.out.println("Enter the product id that u want to add");
					if (sc.hasNextFloat()) {
						String an = sc.next();
						String prod = pd.getProduct(an, uId);
						add.setCart(prod, uId);
					} else {

						System.out.println("TRY AGAIN!!");
						sc.next();
					}
					System.out.println("Product has been added to cart");
				} else if (ans.equals("n"))
					break;
				else
					System.out.println("Enter a valid option");
			}

		} else if (option == 2) {
			add.getCart(uId, 1);
		} else if (option == 3) {
			order.getOrder(uId);
		} else if (option == 5) {
			System.out.println("Admin phone number: xxxxxxxxxx");

		} else if (option == 4) {
			int i = 0;
			add.getCart(uId, 0);
			if (cart.e == 0) {
				while (i == 0) {
					System.out.println("Enter the product id u want to remove");
					if (sc.hasNextFloat()) {
						String ans = sc.next();
						String prod = pd.getProduct(ans, uId);
						add.removeCart(prod, uId);
						add.getCart(uId, 0);
					} else
						System.out.println("Enter a valid answer");
					i = 1;
				}
			}
		} else if (option == 6) {
			break;
		} else
			System.out.println("Enter a valid option");
	}
}
}