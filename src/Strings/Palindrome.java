package Strings;

import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String: ");
	String str=sc.nextLine();
	String res="";
	for(int i=str.length()-1;i>=0;i--) {
		res+=str.charAt(i);
	}
	
	
	if(str.equals(res)==true) {
	System.out.println("It is Palindrome!!!");	
	}else {
		System.out.println("It is not palindrome!!!");
	}
	
	
	sc.close();
}
}