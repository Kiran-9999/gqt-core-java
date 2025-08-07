package Encapsulation;

class Lion{
	private String name;
	private  String color;
	private String country;
	private int age;
	
	void setData1() {
		name="Kiran";
		color="Yellow";
		country="India";
		age=14;
		
	}
	void setData2(String a, String b,String c, int d) {
		name=a;
		color=b;
		country=c;
		age=d;
		
	}
	void getData() {
		System.out.println("Name= "+name);
		System.out.println("Color= "+color);
		System.out.println("country= "+country);
		System.out.println("Age= "+age);
	}

	
}

public class SettersGettersEx {

	public static void main(String[] args) {
		Lion l=new Lion();
		
//		l.name="Ramu"; // Private Members cannot be accessed directly
//		l.color="Yellow";
//		l.country="Iindia";
//		l.age=9;

		
		
		l.setData1();
		l.getData();
		System.out.println("----------------------");
		l.setData2("Ramu","grey","Africa", 16);
		l.getData();
		

	}

}
