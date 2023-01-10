package org.outlook;

public class Communication extends LoginPage
{
	public static void main(String[] args) {
		
		String s=new String("Poorni");
		String s1=new String("Poorni");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
	StringBuffer a = new StringBuffer("Poornima");
	StringBuffer b = new StringBuffer("Senthil");
	
	System.out.println(System.identityHashCode(a));
	System.out.println(System.identityHashCode(b));
	
	StringBuffer append=a.append(b);
	System.out.println(append);
	System.out.println(System.identityHashCode(append));
	
}
}


 
