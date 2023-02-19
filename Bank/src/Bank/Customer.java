package Bank;

import java.util.Scanner;

@SuppressWarnings("static-access")
public class Customer {
	Scanner sc = new Scanner(System.in);
	Scanner wait = new Scanner(System.in);
	Account acc = new Account();

	public void login() {
		int ag = 0;
		while (ag == 0) {
			System.out.print("Enter the name : ");
			if (sc.next().equalsIgnoreCase(acc.name)) {
				ag = 1;
				menu();
			} else {
				System.out.println("TRY AGAIN");
			}

		}
	}

	public void menu() {
		intrest intr = new intrest();
		System.out.println("\n********** Welcome to " + acc.bank + " bank *********\n");
		boolean exit = true;
		while (exit) {
			System.out.println("********* Choose and option ************");
			System.out.println("*         1. Check Balance             *");
			System.out.println("*         2. Deposit amount            *");
			System.out.println("*         3. Withdraw amount           *");
			System.out.println("*         4. See previous transaction  *");
			System.out.println("*         5. Calculate Intrest         *");
			System.out.println("*         6. Exit                      *");
			System.out.println("****************************************");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Balance : " + acc.amt);
				break;
			case 2:
				System.out.print("Enter the amount to deposit : ");
				acc.addAmt = sc.nextInt();
				acc.amt = acc.addAmt;
				System.out.println("\nRs" + acc.addAmt + " added to your account");
				break;
			case 3:
				System.out.println("Enter the ammount to withdraw : ");
				acc.withAmt = sc.nextInt();
				acc.amt -= acc.withAmt;
				break;
			case 4:
				System.out.println("Previous transaction\n");
				if (acc.addAmt != 0)
					System.out.println("Rs" + acc.addAmt + " deposited");
				if (acc.withAmt != 0)
					System.out.println("Rs" + acc.withAmt + " Withdrawn");
				if (acc.addAmt == 0 && acc.withAmt == 0)
					System.out.println("No previous transaction");
				break;
			case 5:
				System.out.println("Enter the number of years : ");
				intr.t = sc.nextInt();
				intr.simple_intrest();
				intr.cmp_intrest();
				break;
			case 6:
				System.out.println("Thank you for using our services");
				exit = false;
				break;
			}
			wait.nextLine();

		}
	}
}
