package Bank;

import java.util.Scanner;

public class RBI {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner wait = new Scanner(System.in);
		Account ac = new Account();
		Customer cus = new Customer();
		System.out.println("************** WELCOME ***************\n");
		while (true) {
			System.out.println("********* Choose an option ***********");
			System.out.println("*         1. Login                   *");
			System.out.println("*         2. Create an Account       *");
			System.out.println("*         3. Contact us              *");
			System.out.println("**************************************");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				cus.login();
				break;
			case 2:
				ac.CreatAcc();
				break;
			case 3:
				System.out.println("\nPhone number : 12345 \nEmail id : xyz@abc.com");
			}
			System.out.println("\n******** PRESS ENTER TO CONTINUE ********");
			wait.nextLine();
		}
	}

}
