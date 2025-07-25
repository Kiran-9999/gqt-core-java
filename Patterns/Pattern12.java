package Patterns;
import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count:");
		int n=sc.nextInt();
		int c=n*n;
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
		System.out.print(c +"	");
		c--;
		sc.close();
		}
		System.out.println();
		}
	}

}
