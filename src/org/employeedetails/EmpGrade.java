package org.employeedetails;

public class EmpGrade implements PersonalInformation {
	
	@Override
	public void performance() {
		System.out.println("Employee Performance is in Level 1");
	}
	
@Override
public void remark() {
	System.out.println(" Employee Remark is Very Good ");
	
}

public static void main(String[] args) {
	EmpGrade per=new EmpGrade();
	per.performance();
	per.remark();

}
}
