package products;

import java.util.Scanner;

public class productDetails {
	protected static Scanner sc = new Scanner(System.in);
	int n = 1;
	static String[][] pd = new String[10][10];
	int pId;
	int pPrice;

	public productDetails() {
		pd[0][0] = "1.1 Red shirt 100";
		pd[0][1] = "1.2 Cotton saree 1000";
		pd[0][2] = "4.1 Laptop 50000";
		pd[0][3] = "5.1 Chair 500";
	}

	public int getTotalProoduct() {
		int count = 0;
		for (int i = 0; i < pd.length; i++) {
			for (int j = 0; j < pd.length; j++) {
				if (pd[i][j] != null) {
					count++;
				}
			}
		}
		return count;
	}

	public void getSellerProduct(int j) {
		for (int i = 0; i < pd.length; i++) {
			if (pd[j][i] == null) {
				break;
			}
			System.out.println("" + pd[j][i]);
		}
	}

	public void getAllProduct(String i) {
		String str;
		char[] id = i.toCharArray();
		for (int k = 0; k < pd.length; k++) {
			for (int l = 0; l < pd.length; l++) {
				if (pd[k][l] != null) {
					str = pd[k][l];
					char[] chars = str.toCharArray();
					if (chars[0] == id[0] ) {
						System.out.println("" + pd[k][l]);
					}
				}
			}
		}
	}

	public String getProduct(String i, int j) { // j is uId
		String product = "";
		String str;
		char[] id = i.toCharArray();
		for (int k = 0; k < pd.length; k++) {
			for (int l = 0; l < pd.length; l++) {
				if (pd[k][l] != null) {
					str = pd[k][l];
					char[] chars = str.toCharArray();
					if (chars[0] == id[0] && chars[2] == id[2]) {
						product = pd[k][l];
						break;
					}
				}
			}
		}

		return product;
	}

	public void setProduct(int j, String p) {
		for (int i = 0; i < pd.length; i++) {
			if (pd[j][i] == null) {
				pd[j][i] = p;
				break;
			}
		}
	}

	public void removeProduct(String i, int j) {
		int c = 0;
		String str = "";
		char[] id = i.toCharArray();
		for (int k = 0; k < pd.length; k++) {
			str = pd[j][k];
			if (pd[j][k] != null) {
				char[] chars = str.toCharArray();
				if (chars[0] == id[0] && chars[2] == id[2]) {
					pd[j][k] = null;
					c++;
					break;
				}
			}
		}
		if (c == 0) {
			System.out.println("Cant find a product with that id.");
		}
	}

	public int getLength() {
		return pd.length;
	}

}
