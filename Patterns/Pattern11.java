package Patterns;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		int c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
		System.out.print(c +"	");
		c++;
		sc.close();
		}
		System.out.println();
		}
	}

}
