package login;

import java.util.Scanner;

public class logIn extends accDetails {
	int t = 3;
	public static int uid;
	int crtdetails = 0;
	static Scanner sc = new Scanner(System.in);

	public int login() {

		while (crtdetails == 0) {
			// accDetails details = new accDetails();
			System.out.println("Enter the Username and Password to log in");
			String name = "";
			String pass = "";
			name = sc.next();
			pass = sc.next();
			for (int j = 0; j < listOfUsers.length; j++) {
				for (int i = 0; i < listOfUsers[0].length; i++) {
					if (name.equals(getUser(j, i)) && pass.equals(getUserpass(j, i))) {
						uid = i;
						t = j;
						crtdetails = 1;
						break;
					}
					if (crtdetails == 1)
						break;
				}
			}
			if (crtdetails == 0) {
				System.out.println("Try again!!");
				System.out.println("");
			}
		}
		return t;
	}
}
