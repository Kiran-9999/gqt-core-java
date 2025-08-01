package Array_Ex_CJBook;
//Ques- 10
import java.util.Scanner;

class ArrayOperaa{
	int arr[][][];
	Scanner sc =new Scanner(System.in);
	
	void createArray() {
		System.out.println("Enter count of  Banks: ");
		int bnk=sc.nextInt();
		
		arr =new int[bnk][][];
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of Branches in Bank no: "+(i+1));
			arr[i] = new int[sc.nextInt()][];	
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("In branch : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the count of customers inside this Branch : "+(j+1));
				arr[i][j]=new int[sc.nextInt()];
			}
		} 	

		System.out.println("Array is created!!!");
		System.out.println("-------------------");
	
	}
	

}

public class Example5
{
	public static void main(String[] args) {
		ArrayOperaa ao=new ArrayOperaa();
		ao.createArray();

	}

}
