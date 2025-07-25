package wrapperClassUse;
import java.util.Scanner;
public class WrapperExample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Byte Data:");
		Byte b=new Byte(sc.nextByte());
		System.out.println("Byte Data:"+b);
		System.out.println("-------------");
		System.out.println("Enter the Short Data:");
		Short s=new Short(sc.nextShort());
		System.out.println("Short Data:"+s);
		System.out.println("-----------");
		System.out.println("Enter Int Data:");
		Integer i=new Integer(sc.nextInt());
		System.out.println("Integer Data:"+i);
		System.out.println("------------");
		Long l =new Long(sc.nextLong());
		System.out.println("Long Data:"+l);
		System.out.println("------------");
		System.out.println("Enter Float Data:");
		Float f=new Float(sc.nextFloat());
		System.out.println("Float Data:"+f);
		System.out.println("-------------");
		System.out.println("enter Double data:");
		Double d=new Double(sc.nextDouble());
		System.out.println("Double data:"+d);
		System.out.println("-------------");
		System.out.println("Enter String Data:");
		String str =new String(sc.nextLine());
		System.out.println("String Data:");
		System.out.println("-------------");
		Character c=new Character('a');
		System.out.println("charatcer data:+c");
		System.out.println("---------------");
		Boolean b1=new Boolean(true);
		System.out.println("Boolean Data:"+b1);
		sc.close();
		
	}	
}
