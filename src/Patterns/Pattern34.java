package Patterns;
import java.util.Scanner;
public class Pattern34 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word for the Pattern : ");
        char c = sc.next().charAt(0);
        for (char i = 'A';i<=c;i++) {
            for (int j=c; j>i;j--) {
                System.out.print(" ");
            }
            for (char k=i;k>='A';k--) {
                System.out.print(k);
            }
            for (char l='B';l<=i;l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
