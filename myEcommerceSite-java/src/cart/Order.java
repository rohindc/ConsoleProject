package cart;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import login.accDetails;

public class Order extends cart {
	static String[][] orders = new String[10][10];
	accDetails ad = new accDetails();

	public void placeOrder(int i) {
		File file = new File(ad.getUser(0, i) + ".txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int j = 0; j < addToCart.length; j++) {
			if (addToCart[j][i] != null) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));) {
					bw.newLine();
					bw.write(addToCart[j][i]);
//					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				orders[i][j] = addToCart[j][i];
			}
		}
	}

	public void getOrder(int i) {
		File file = new File(ad.getUser(0, i) + ".txt");
			try {
				Scanner fl = new Scanner(file);
				String order;
				while(fl.hasNext()) {
				order = fl.nextLine();
				System.out.println("" +order);
				}
				fl.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("No  orders yet!!");
			}
	}
}
