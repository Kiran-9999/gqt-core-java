package Multi_Threading;

import java.util.Scanner;

class Addition{
	void add() {
	System.out.println("Addition operation Started");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first Number");
	int num1=sc.nextInt();
	System.out.println("ENter the 2nd number");
	int num2=sc.nextInt();
	int res=num1+num2;
	System.out.println("Result ="+res);
	System.out.println("Addition operation Completed");
}
}

class Printing{
	void print() {
		System.out.println("Printing operation started");
		for(int i=0;i<=10;i++) {
			System.out.println("Happy 6 Years to GQT!!");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing operation completed");
	}
}


class Banking{
	void bank() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Banking operation started");
		System.out.println("Enter the account Number");
		int accno=sc.nextInt();
		System.out.println("ENter the pin number");
		int pin=sc.nextInt();
		System.out.println("Data Entered");
		System.out.println("BAnking operation Completed!!");
	}
}

public class ThreadCode3 {
	public static void main(String[] args) {
		
	Addition a=new Addition();
	Printing p=new Printing();
	Banking b= new Banking();
	
	a.add();
	p.print();
	b.bank();
}
}
