package Exception_Handling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage() {
		return "The age is less than the minimum age. Application cannopt be processed!";
	}
}
	
class OverAgeException extends Exception{
	public String getMessage() {
		return "The age is more than the maximum age. Application cannopt be processed!";
	}
}

class candidate{
	int age;
	void collectData() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Age:");
		age=sc.nextInt();
		
	}
	void validate() throws UnderAgeException, OverAgeException {
		if(age<18) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println( uae.getMessage());
			throw uae;
		}
		else if(age>60) {
			OverAgeException oae = new OverAgeException();
			System.out.println( oae.getMessage());
			throw oae;
		}
		else {
			System.out.println("Application can be processed!");
		}
	}
}
class Matrimony{
	void process(candidate c) {
		try {
			c.collectData();
			c.validate();
		}
		catch(OverAgeException | UnderAgeException e1) {
			try {
				c.collectData();
				c.validate();
			}
			catch(OverAgeException | UnderAgeException e2) {
				try{
					c.collectData();
					c.validate();
			}
			catch(OverAgeException | UnderAgeException e3) {
				System.out.println("Candidature is blocked!");
				System.exit(0);
			}
		}
	}
}

}

public class User_defined_ExHandle8 {
	public static void main(String[] args) {
		candidate c= new candidate();
		Matrimony m= new Matrimony();
		m.process(c);
	}

}
