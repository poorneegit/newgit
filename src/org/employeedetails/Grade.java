package org.employeedetails;

public class Grade {
	
	public static void main(String[] args) {
	String a[]=new String[3];
	
	a[0]="Father";
	a[1]="Mother";
	a[2]="Child";
	
	for (int i = 1 ; i < a.length; i++) {
		System.out.println(a[i]);
	}
	
	System.out.println("-------------");
	
		for(String i:a) {
			System.out.println(i);
		}
		
		System.out.println("-----------------");
		
 String b[][]=new String[2][2];
		b[0][0]="House";
		b[0][1]="Car";
		b[1][0]="Bike";
		b[1][1]="Pet";
		
		for (int j = 0; j < b.length; j++) {
			for (int j2 = 0; j2 < b[j].length; j2++) {
				System.out.println(b[j][j2]);
			}
		}
	}
	}


	
