package Array_DS;

import java.util.Scanner;

class ArrayOperations3{
	String arr[][][];
	Scanner sc =new Scanner(System.in);
	
	void createArray() {
		System.out.println("Enter school count");
		int scl=sc.nextInt();
		/*
		 * System.out.println("Enter class count: "); int cls=sc.nextInt();
		 * System.out.println("Enter the student count in each class"); int
		 * stu=sc.nextInt();
		 */
		
		arr =new String[scl][][];
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of classes inside the School no: "+(i+1));
			arr[i] = new String[sc.nextInt()][];	
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside School no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of students inside class no.: "+(j+1));
				arr[i][j]=new String[sc.nextInt()];
			}
		} 	

		System.out.println("Array is created!!!");
		System.out.println("-------------------");
	
	}
	
	void collectData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside School no. "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside Class no. "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the name of student no.: "+(k+1));
					arr[i][j][k] = sc.next();
				}
			}
		}
		System.out.println("Data collected!!!");
		System.out.println("-------------------");
		
	}
	
	void displayData() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside class no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(" the name of Student no. "+(k+1)+" is "+arr[i][j][k]);
				}
			}
		}
		System.out.println("-------------------");
	}
}




public class Three_Dimen_Jagged_ArrEx
{
	
	

	public static void main(String[] args) {
		ArrayOperations3 ao=new ArrayOperations3();
		ao.createArray();
		ao.collectData();
		ao.displayData();

	}

}
