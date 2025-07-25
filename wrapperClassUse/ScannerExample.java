package wrapperClassUse;

import java.util.Scanner;

public class ScannerExample {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter byte data:");
	byte b=sc.nextByte();
	System.out.println("Byte Data:"+b);
	System.out.println("-------------");
	System.out.println("enter short data:");
	short s=sc.nextShort();
	System.out.println("Short data:"+s);
	System.out.println("--------------");
	System.out.println("enetr int Data:");
	int i=sc.nextInt();
	System.out.println("Int Data:"+i);
	System.out.println("-------------");
	System.out.println("enter Long data:");
	long l=sc.nextLong();
	System.out.println("Long Data:"+l);
	System.out.println("-------------");
	System.out.println("enter float data:");
	float f=sc.nextFloat();
	System.out.println("float data:"+f);
	System.out.println("--------------");
	System.out.println("enter double data:");
	double d=sc.nextDouble();
	System.out.println("Double data:"+d);
	System.out.println("------------");
	System.out.println("Enter String Data:");
	sc.nextLine();
	String str1=sc.nextLine();
	
	System.out.println("String Data:"+str1);
	sc.close();
	
}
}
