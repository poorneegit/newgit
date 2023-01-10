package org.instagram;
import org.outlook.LoginPage;
public class PersonalInfo {
	private void comNam() {
	System.out.println("ABC Pvt Ltd");

	}
	private void comLoc() {
		System.out.println("Chennai");
	}
	public static void main(String[] args) {
		PersonalInfo per=new PersonalInfo();
		per.comNam();
		per.comLoc();
		
		
		 LoginPage first=new LoginPage();
		 first.userId();
		 first.passWord();
		
	}
}
