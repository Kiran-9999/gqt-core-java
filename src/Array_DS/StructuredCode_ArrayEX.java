package Array_DS;
import java.util.Scanner;
class Array_operations {

	int arr[];
	Scanner sc=new Scanner(System.in);
	
	void createArray() {
		System.out.println("enter the student count:");
		int n=sc.nextInt();
		arr=new int[n];
		System.out.println("Array Created!!!");
		System.out.println("-----------------");
	}
	
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the marks of Student No."+(i+1));
			arr[i]=sc.nextInt();
		}
		System.out.println("Data Stored into memory!!!");
	}
	
	void displayData() {
		for(int i=0;i<arr.length;i++) {
		System.out.println("The marks of student no.: "+(i+1)+" is "+arr[i]);
		}
	}

}

public class StructuredCode_ArrayEX{
	public static void main(String args[]) {
		Array_operations ao=new Array_operations();
		
		ao.createArray();
		ao.collectData();
		ao.displayData();
	}
}

