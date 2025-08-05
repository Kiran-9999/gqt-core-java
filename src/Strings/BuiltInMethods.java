package Strings;

public class BuiltInMethods {

	public static void main(String[] args) {
		String str="SachinRameshTendulkar";
		//1. Length
		int len=str.length();
		
		//2. charAt()
		System.out.println("The length of the String is "+len);
		char c=str.charAt(0);
		System.out.println("The character AT 0TH POSITION IS "+c);
		
		//3. concat()
		String str1= str.concat(" is the best batsman in the world");
		System.out.println(str1);
		
		//4. contains()
		boolean res1=str.contains("Ramesh");
		System.out.println(res1);
		
		//5. endsWith()
		boolean res2=str.endsWith("Tendulkar");
		System.out.println(res2);
		res2=str.endsWith("Pendulkar");
		System.out.println(res2);
		
		//6. startsWth()
		boolean res3=str.startsWith("Sachin");
		System.out.println(res3);
		res3=str.startsWith("Pachin");
		System.out.println(res3);
		
		//7. getClass()
		Class class1=str.getClass();
		System.out.println(class1);
				
		//8. hashCode()
		int index1=str.hashCode();
		System.out.println(index1);
		
		//9. indexOf()
		int res5=str.indexOf('S');
		System.out.println(res5);
		
		//10.isBlank()
		boolean res4=str.isBlank();
		System.out.println(res4);
		String str2="                 ";
		res4=str2.isBlank();
		System.out.println(res4);
		String str3="";
		res4=str3.isBlank();
		System.out.println(res4);
		
		//11. isEmpty()
		boolean res6=str.isEmpty();
		System.out.println(res6);
		res6=str2.isEmpty();
		System.out.println(res6);
		res6=str3.isEmpty();
		System.out.println(res6);
		
		//12. lastIndexOf()
		int index2=str.lastIndexOf('l');
		System.out.println(index2);
		
		//13. replace()
		String replace = str.replace('S', '$');//It will replace the old character with new character
		System.out.println(replace);

		
		//14. substring(int start)
		String substring=str.substring(6);
		System.out.println(substring);
		
		//15. substring(int start,int end)
		substring = str.substring(6,12);//provide the substring from the specified position to the specified position
		System.out.println(substring);

		//16. toUpperCase()
				String upperCase = str.toUpperCase();//it convert string to upper case
				System.out.println(upperCase);
				
		//17. toLowerCase()
		String lowerCase = str.toLowerCase();//it convert string to upper case
		System.out.println(lowerCase);

	}

}
