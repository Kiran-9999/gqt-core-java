package Inheritance;
class plane1{
	void tookOff() {
		System.out.println("Plane took Off");
	}
	void fly() {
		System.out.println("Plane flys");
	}
	void land() {
		System.out.println("Plane lands");
	}
}
class CargoPlane1 extends plane1{
	@Override
	void fly() {
		System.out.println("cragoPlane flys in low heights");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}
class PassengerPalne1 extends plane1{
	@Override
	void fly() {
		System.out.println("PassergerPlane flys in medium plane");
		
	}
	void carryHumans() {
		System.out.println("Passenger plane carry Humans");
	}
}
class FighterPlane1 extends plane1{
	@Override
	void fly() {
		System.out.println("Fighter Plane flys in great Heights");
	}
	void carryWeapons() {
		System.out.println("Fighter plane carry weapons");
	}
	
}

public class Polymor_Example1 {

	public static void main(String[] args) {
		CargoPlane1 cp=new CargoPlane1();
		PassengerPalne1 pp=new PassengerPalne1();
		FighterPlane1 fp=new FighterPlane1();
		
		plane1 ref;
		ref=cp;
		ref.tookOff();
		ref.fly();
		cp.carryGoods();
		ref.land();
		System.out.println("-------------------------------------");
		
		ref=pp;
		ref.tookOff();
		ref.fly();
		pp.carryHumans();
		ref.land();
		System.out.println("-------------------------------------");
		
		ref=fp;
		ref.tookOff();
		fp.carryWeapons();
		ref.fly();
		ref.land();
	}

}
