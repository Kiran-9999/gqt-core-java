package Array_DS;
import java.util.Scanner;
public class UnstructuredCode_ArrayEX {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Stiudent count:");
		int n=sc.nextInt();
		
		// Creating an array to store n student marks
		
		int arr[]=new int[5];
		
		//collecting and storing the data  of n students from the user 
		
		for(int i=0;i<arr.length;i++)
			{
			System.out.println("Enter the marks of student no."+(i+1));
			arr[i]=sc.nextInt();
			}
			System.out.println("------------");
			
		// display marks of students
		for (int i=0;i<arr.length;i++) 
			{
			System.out.println("The marks of student No."+(i+1)+" is "+arr[i]);
			}
	}

}
