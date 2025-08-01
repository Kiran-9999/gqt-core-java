package Strings;
//////////////////// equals() Method Example
public class StringCode1 {

	public static void main(String[] args) {
		String s1="RAMA";
		String s2="RAMA";
		String s3="rama";
		String s4="SITA";
		System.out.println(" Case-1: Same strings");
		if(s1.equals(s2)==true) {
			System.out.println(" Strings Equal");
		}else {
			System.out.println("Strings Not Equal");
		}
		System.out.println("--------------------");
		if(s1==s2) {
			System.out.println("References are equal");
			
		}else {
		System.out.println("Referances are not equal");
		}
		
		System.out.println("=========================");
		
		System.out.println(" Case-2: Different strings");
		if(s1.equals(s4)==true) {
			System.out.println(" Strings Equal");
		}else {
			System.out.println("Strings Not Equal");
		}
		System.out.println("--------------------");
		if(s1==s4) {
			System.out.println("References are equal");
			
		}else {
		System.out.println("Referances are not equal");
		}
		System.out.println("========================");
		
		System.out.println(" Case-3: Same string but Different case");
		if(s1.equals(s3)==true) {
			System.out.println(" Strings Equal");
		}else {
			System.out.println("Strings Not Equal");
		}
		System.out.println("--------------------");
		if(s1==s3) {
			System.out.println("References are equal");
			
		}else {
		System.out.println("Referances are not equal");
		}
}
}