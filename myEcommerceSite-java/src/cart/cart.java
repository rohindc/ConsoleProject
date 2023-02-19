package cart;

import products.productDetails;

public class cart extends productDetails {
	public static int e = 0;
	int c = 0;
	// private static int j = 0;
	protected static String[][] addToCart = new String[10][10];
	int atc = 0;
	static Order order = new Order();

	public int getCart2(int i) {
		for (int j = 0; j < addToCart.length; j++) {
			if (addToCart[j][i] != null) {
				++atc;
			}
		}
		return atc;
	}

	public void getCart(int i, int o) {
		c = 0;
		System.out.println("Items in your cart:-");
		for (int j = 0; j < addToCart.length; j++) {
			if (addToCart[j][i] != null) {
				++c;
				
				System.out.println("" + addToCart[j][i]);
			}
		}
		if (o == 1 && c >= 1) {
			System.out.println("Do u want to place an order? (y/n)");
			String ans = sc.next();
			if (ans.equals("y")) {
				order.placeOrder(i);
				System.out.println("Order has been placed");
			}
		}
		if (c == 0) {
			System.out.println("          Cart is empty!!");
			e = 1;

		}
	}

	public void setCart(String m, int i) {
		for (int j = 0; j < addToCart.length; j++) {
			if (addToCart[j][i] == null) {
				addToCart[j][i] = m;
				break;
			}
		}
	}

	public void removeCart(String m, int i) {
		for (int j = 0; j < addToCart.length; j++) {
			if (addToCart[j][i] == m) {
				addToCart[j][i] = null;
			}
		}
	}
}
