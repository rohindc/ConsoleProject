package Bank;

import java.util.Scanner;

public class Account {
	static String name = "user", bank = "SBI", accType = "Saving";
	static int age, amt = 0, withAmt, addAmt;
	static double accNo = Math.random();
	@SuppressWarnings("resource")
	public void CreatAcc() {
		while (true) {
			int ag = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Choose a bank 1.SBI 2.ICICI");
			String option = sc.next();
			if (option.equals("1") || option.equalsIgnoreCase("SBI")) {
				bank = "SBI";
			} else if (option.equals("2") || option.equalsIgnoreCase("ICICI")) {
				bank = "ICICI";
			} else {
				System.out.println("\n***** Enter a valid option *****\n");
				continue;
			}
			System.out.print("Enter your name : ");
			name = sc.next();
			System.out.print("Enter your age : ");
			age = sc.nextInt();
			while (ag == 0) {
				System.out.println("What type of account 1. Saving 2. Current");
				accType = sc.next();
				if (accType.equalsIgnoreCase("1") || accType.equalsIgnoreCase("2") || accType.equalsIgnoreCase("Saving")
						|| accType.equalsIgnoreCase("current")) {
					ag = 1;
				} else {
					accType = null;
					System.out.println("\n	*******Choose a valid option*******\n");
					continue;
				}
			}
			accNo = Math.random();
			System.out.println("\n********************************");
			System.out.println("          ACCOUNT CREATED");
			System.out.println("******************************** \n");
			System.out.println("Your account number : "+accNo);
			break;

		}

	}

}
