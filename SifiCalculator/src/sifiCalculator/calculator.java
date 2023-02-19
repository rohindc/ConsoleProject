package sifiCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {
	static Scanner sc = new Scanner(System.in);
	static WriteToFile his = new WriteToFile();
	static WriteToFilenl nl = new WriteToFilenl();
	static Store store = new Store();
	static int z = 0;

	public static void main(String[] args) {
		int y = 0;
		System.out.println("1 \"+\" -plus or addition\r\n" + "2 \"-\" -minus or subtraction\r\n"
				+ "3 \"*\" -multiply by\r\n" + "4 \"/\" -divided by\r\n"
				+ "5 \"^\" -raised to the power of- x raised to the y\r\n" + "6 \"Sqrt\" -square root\r\n"
				+ "7 \"Nrt\" -nth root\r\n" + "8 \"log\" -Logarithmic value\r\n" + "9 \"logn\" -Natural log\r\n"
				+ "10 \"sin\" -Sine\r\n" + "11 \"isin\" -Inverse sine\r\n" + "12 \"cos\" -Cosine\r\n"
				+ "13 \"icos\" -Inverse cosine\r\n" + "14 \"tan\" -Tangent\r\n" + "15 \"itan\" -Inverse tan\r\n"
				+ "16 \"stor\" -place a number in memory for later use\r\n"
				+ "17 \"recall\" -recover the number from memory for immediate use\r\n"
				+ "18 \"d2b\" -Decimal to Binary number\r\n" + "19 \"b2d\" -Binary to Decimal number\r\n"
				+ "20 \"sip\"- Calculations of monthly, quarterly and yearly SIP calculations for compounding investments.\r\n"
				+ " \"c\"- To clear all.");
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		int a = 0;
		var x = 0;
		while (true) {
			try {
			var b = 0;
			System.out.println("Enter the operation");
			if (sc.hasNextInt()) {
				y = sc.nextInt();
			} else {
				y = sc.next().charAt(0);
				y = 'c';
			}
			if (y != 20 && y != 16 && y != 17 && y != 19) {
				if (a == 0) {
					System.out.println("Enter a number");
					x = sc.nextInt();
					his.writeToFile(x);
					a = 1;
				}
				his.writeToFile(y);
				if (y >= 1 && y <= 5 || y == 7) {
					System.out.println("Enter another number");
					b = sc.nextInt();
					his.writeToFile(b);
				}

			}

			switch (y) {
			case 1:
				x += b;

				break;
			case 2:
				x -= b;
				break;
			case 3:
				x *= b;
				break;
			case 4:
				x /= b;
				break;
			case 5:
				x = (int) Math.pow(x, b);
				break;
			case 6:
				x = (int) Math.sqrt(x);
				break;
			case 7:
				x = (int) Math.pow(x, (1 / b));
				break;
			case 8:
				x = (int) Math.log(x);
				break;
			case 9:
				x = (int) Math.log(x);
				break;
			case 10:
				x = (int) Math.sinh(x);
				break;
			case 11:
				x = (int) Math.asin(x);
				break;
			case 12:
				x = (int) Math.cosh(x);
				break;
			case 13:
				x = (int) Math.acos(x);
				break;
			case 14:
				x = (int) Math.tanh(x);
				break;
			case 15:
				x = (int) Math.atan(x);
				break;
			case 16:
				// Store
				System.out.println("Enter a number to store:");
				x = sc.nextInt();
				store.store(x);
				break;
			case 17:
				// Recall
				if (x == 0) {
					x = store.recall();
				} else
					b = store.recall();
				break;
			case 18:
				x = Integer.valueOf(Integer.toBinaryString(x));
				a = 1;
				break;
			case 19:
				String x1;
				System.out.println("Enter a binary number:");
				x = sc.nextInt();
				try {
					x1 = String.valueOf(x);
					x = Integer.parseInt(x1, 2);
				} catch (NumberFormatException e) {
					System.out.println("Thats not a binary number:");
				}
				his.writeToFile(x);
				break;
			case 20:
				// SIP calculation
				sip();
				a = 1;
				break;
			case 'c':
				a = 0;
				break;

			default:
				System.out.println("Operation not valid!!");
				break;

			}
			System.out.println("= " + x);
			nl.writeToFilenl(x);
			System.out.println("");

		}
		catch (InputMismatchException e) {
			System.out.println("Wrong Input!!");
		}
		}

	}

	private static void sip() {
		// TODO Auto-generated method stub
		SipCal sipCal = new SipCal();
		System.out.println("Enter the investment amount:");
		var p = sc.nextDouble();
		sipCal.setP(p);
		his.writeToFile(p);
		System.out.println("Enter the rate of intrest (%)"); // period of deposit
		var r = sc.nextDouble();
		sipCal.setAr(r);
		his.writeToFile(r);
		System.out.println("Enter the period of deposit");
		var t = sc.nextInt();
		sipCal.setT(t);
		his.writeToFile(t);
		System.out.println("The number of times that interest is compounded per unit time (1, 4 or 12)");
		var n = sc.nextInt();
		sipCal.setN(n);
		his.writeToFile(n);
		int fv = sipCal.answer();
		nl.writeToFilenl(fv);
		System.out.println("Amount is " + "Rs " + fv + "\n");
	}
}