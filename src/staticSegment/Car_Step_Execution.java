package staticSegment;
class Car{
	String cname;
	String cmodel;
	int year;
	String weight;
	String color;
	
	void drive(){
		System.out.println("Car Runs");
	}
	void milage() {
		System.out.println("20 Km/l");
	}
	void owner() {
		System.out.println("Owner Name:Raghu");
	}
}

public class Car_Step_Execution {

	public static void main(String[] args) {
		Car c1=new Car();
		c1.cname="TOYOTA";
		c1.cmodel="INNOVA";
		c1.year=2024;
		c1.weight="1.8T";
		c1.color="Black";
		System.out.println("CarName="+c1.cname);
		System.out.println("CarModel="+c1.cmodel);
		System.out.println("Year="+c1.year);
		System.out.println("CarWeight="+c1.weight);
		System.out.println("Car Color="+c1.color);
		
		
		
		

	}

}
