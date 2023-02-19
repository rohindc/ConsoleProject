/*
 * default account for customer 

"duser" as username and password

for seller

"dseller" as username and password

for admin

"dadmin" as username and password

new admin acc cannot be created
 */

package Store;



//import java.lang.Package; 

import java.util.Scanner;

import cart.Order;
import cart.cart;
import login.accDetails;
import login.accSelect;
import login.logIn;
import products.categories;
import products.productDetails;

public class store {
	protected static int uId;
	static Scanner sc = new Scanner(System.in);
	logIn login = new logIn();
	static cart add = new cart();
	static productDetails pd = new productDetails();
	static accDetails details = new accDetails();
	static categories ct = new categories();
	static Order order = new Order();

	public static void main(String[] args) {
		System.out.println("Welcome to the store");
		while (true) {
			int l = 0;
			System.out.println("");
			System.out.println("Are you new to the store (y/n)");
			String ans = sc.next();
			if (ans.equals("y")) {
				System.out.println("Create new acc as");
				System.out.println("1.Custumer");
				System.out.println("2.Seller");
				if (sc.nextInt() == 2) {
					l = 1;
				}
				System.out.println("enter the Username");
				ans = sc.next();
				details.setUser(ans, l);
				System.out.println("Enter the password");
				ans = sc.next();
				details.setUserpass(ans, l);
				System.out.println("Account created!!");
				accSelect.accselect();
			} else if (ans.equals("n")) {
				accSelect.accselect();
			} else {
				System.out.println("Enter a valid option");
			}
		}
	}
}