package staticSegment;
import java.util.Scanner;
class Aadhardetails{
	int number;
	String name;
	String gender;
	static String region;
	static {
		region = "INDIAN";
	}
	void collectDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Aadhar number:");
		number = sc.nextInt();
		System.out.println("Enter name:");
		name = sc.next();
		System.out.println("enter gender:");
		gender = sc.next();
	}
	void display() {
		System.out.println("Aadhar Number is:"+number);
		System.out.println("Name is:"+name);
		System.out.println("Gender is:"+gender);
		System.out.println("Region :"+region);
	}
}
public class Aadhar_Example {
	public static void main(String[] args) {
		Aadhardetails a1 = new Aadhardetails();
		Aadhardetails a2 = new Aadhardetails();
		Aadhardetails a3 = new Aadhardetails();
		System.out.println("person-1");
		a1.collectDetails();
		a1.display();
		System.out.println("--------------------");
		a2.collectDetails();
		a2.display();
		System.out.println("--------------------");
		a3.collectDetails();
		a3.display();
	}

}
