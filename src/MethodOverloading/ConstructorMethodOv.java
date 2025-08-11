package MethodOverloading;
class Dog{
	private String name;
	private String color;
	private int cost;
	private int age;
	private String breed;
	
	
	// Zero Parameterized Constructor
	public Dog() {
		super();
		System.out.println("Inside Zero Parameterized constructor");
		this.name="Ramu";
		this.color="Brown";
		this.cost=7000;
		this.age=3;
		this.breed="Pomerian";
		
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-------------------");
	}
	
	// One Parameterized Constructor
	public Dog(String name) {
		this();
		System.out.println("Inside One Parameterzied Constructor");
		this.name=name;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-------------------");
	}
	
	//Two parameterized Constructor
	public Dog(String name,String color) {
		this("Chintu");
		System.out.println("Inside two parameterized Constructor");
		this.name=name;
		this.color=color;
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-------------------");
	}
	
	//Three parameterized Constructor
	public Dog(String name, String color,int cost) {
		this("Tommy","Blue");
		this.name=name;
		this.color=color;
		this.cost=cost;
		System.out.println("Inside three parameterized Constructor");
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-------------------");
		
	}
	
	//four parameterized constructor
	public Dog(String name, String color,int cost,int age) {
		this("Dobby","Orange",9000);
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		System.out.println("Inside four parameterized constructor");
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-------------------");
}
	
	// five parameterized constructor
	public Dog(String name, String color,int cost,int age,String breed) {
		this("Jimmy","Purplr",7500,7);
		this.name=name;
		this.color=color;
		this.cost=cost;
		this.age=age;
		this.breed=breed;
		System.out.println("Inside four parameterized constructor");
		System.out.println(this.name);
		System.out.println(this.color);
		System.out.println(this.cost);
		System.out.println(this.age);
		System.out.println(this.breed);
		System.out.println("-------------------");
}
}

public class ConstructorMethodOv {

	public static void main(String[] args) {
		
		Dog d1 =new Dog("Rocky","White",8000,8,"GR");

	}

}
