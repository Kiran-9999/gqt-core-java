package Inheritance;
class plane11{
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
class CargoPlane11 extends plane11{
	@Override
	void fly() {
		System.out.println("cragoPlane flys in low heights");
	}
	void carryGoods() {
		System.out.println("CargoPlane carry goods");
	}
}
class PassengerPalne11 extends plane11{
	@Override
	void fly() {
		System.out.println("PassergerPlane flys in medium plane");
		
	}
	void carryHumans() {
		System.out.println("Passenger plane carry Humans");
	}
}
class FighterPlane11 extends plane11{
	@Override
	void fly() {
		System.out.println("Fighter Plane flys in great Heights");
	}
	void carryWeapons() {
		System.out.println("Fighter plane carry weapons");
	}
	
}

class Airport{
	void permit(plane11 ref) {
		ref.tookOff();
		ref.fly();
		ref.land();
		
	}
}

public class Condensed_PolymorEx {

	public static void main(String[] args) {
		CargoPlane11 cp=new CargoPlane11();
		PassengerPalne11 pp=new PassengerPalne11();
		FighterPlane11 fp=new FighterPlane11();
		
		Airport ap=new Airport();
		
		ap.permit(cp);
		cp.carryGoods();
		
		System.out.println("-------------------------------------");
		
		ap.permit(pp);
		pp.carryHumans();
		System.out.println("-------------------------------------");
		
		ap.permit(fp);
		fp.carryWeapons();
		
	}

}
