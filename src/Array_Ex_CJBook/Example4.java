package Array_Ex_CJBook;
// Ques - 9
import java.util.Scanner;

class ArrayOper{
	int arr[][][];
	Scanner sc =new Scanner(System.in);
	
	void createArray() {
		System.out.println("Enter school count");
		int scl=sc.nextInt();
		
		arr =new int[scl][][];
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of classes inside the School no: "+(i+1));
			arr[i] = new int[sc.nextInt()][];	
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside class no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of students inside class no.: "+(j+1));
				arr[i][j]=new int[sc.nextInt()];
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
					System.out.println("enter the Marks of student no.: "+(k+1));
					arr[i][j][k] = sc.nextInt();
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
					System.out.println(" the Marks of Student no. "+(k+1)+" is "+arr[i][j][k]);
				}
			}
		}
		System.out.println("-------------------");
	}
}




public class Example4
{
	
	

	public static void main(String[] args) {
		ArrayOper ao=new ArrayOper();
		ao.createArray();
		ao.collectData();
		ao.displayData();

	}

}
