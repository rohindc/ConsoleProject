package login;

public class accDetails {

	int n = 0;
	static String[][] listOfUsers = new String[3][10];
	static String[][] listOfUserpass = new String[3][10];
	String User = "";
	String Userpass = "";

	public accDetails() {
		listOfUsers[0][0] = "duser";
		listOfUsers[1][0] = "dseller";
		listOfUsers[2][0] = "dadmin";
		listOfUserpass[0][0] = "duser";
		listOfUserpass[1][0] = "dseller";
		listOfUserpass[2][0] = "dadmin";	
	}
	
	public void setUser(String users, int l) {
		for (int i = 1; i < listOfUsers.length; i++) {
			if (listOfUsers[l][i] == null) {
				listOfUsers[l][i] = users;
				break;
			}
		}
	}

	public void setUserpass(String userpass, int l) {
		for (int i = 1; i < listOfUserpass.length; i++) {
			if (listOfUserpass[l][i] == null) {
				listOfUserpass[l][i] = userpass;
				break;
			}
		}
	}
	public String getUser(int j, int i) {
		User = listOfUsers[j][i];
		return User;
	}

	public String getUserpass(int j, int i) {
		Userpass = listOfUserpass[j][i];
		return Userpass;
	}
	public int getLength() {
		return listOfUsers.length;
	}

}
