package Inheritance;

class Animal{
	public Animal() {
		super();
		System.out.println("Animal Zero Parameterized constructor is Invoked");
	}
	
	public Animal(String message ) {
		super();
		System.out.println("Animal Parameterized constructor is invoked");
		System.out.println("The animal constructor received the message as: "+message);
	}
}
class elephant extends Animal{
	String name;
	double weight;
	
	public elephant() {
		super("Hello from Elephant");
		System.out.println("hi from elephant");
		
	}
	public elephant(String name,double weight) {
		super();
		this.name=name;
		this.weight=weight;
		System.out.println(this.name);
		System.out.println(this.weight);
	}
}
public class ConstructorUsing_Inheri {

	public static void main(String[] args) {
		elephant e1 = new  elephant();
		System.out.println("--------------------------");
		elephant e2=new elephant("Arjuna",5223);

	}

}
