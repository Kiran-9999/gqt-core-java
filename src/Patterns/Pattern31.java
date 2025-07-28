package Patterns;
import java.util.Scanner;

public class Pattern31 {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	int n=sc.next().charAt(0);
	int var=1;
	for (char i='A';i<=n;i++) {
		for (int j = n; j > i; j--) {
            System.out.print("  ");
        }
        for (int k = 1; k <= (2 *var - 1); k++) {
            System.out.print(i + " ");
        }
        var++;
        System.out.println();
	}
	
}
}
