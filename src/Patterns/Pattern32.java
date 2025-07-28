package Patterns;
import java.util.Scanner;
public class Pattern32 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter word for Pattern:");
	int var=1;
	int n=sc.next().charAt(0);
	for(int i='A';i<=n;i++) {
		char word='A';
		for(int j=n;j>i;j--) {
			System.out.println("	");
		}
		for(int k=2*var-1;k>0;k--) {
			System.out.print((char)(word+k-1)+"	");
		}
		var++;
		System.out.println();
	}
}
}
