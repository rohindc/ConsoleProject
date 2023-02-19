package login;

import Store.*;

public class accSelect extends store {
	public static void accselect() {
		logIn login = new logIn();
		int t = 3;
		t = login.login();
		uId = logIn.uid;
		if (t == 0) {
			t = 3;
			Customer.customer();
		} else if (t == 1) {
			t = 3;
			Seller.seller();
		} else if (t == 2) {
			t = 3;
			Admin.admin();
		}
	}
}
