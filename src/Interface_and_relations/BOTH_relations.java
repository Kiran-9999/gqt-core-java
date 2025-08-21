package Interface_and_relations;
class Brain {
	double weight;
	float iq;
	public Brain(double weight, float iq) {
		super();
		this.weight = weight;
		this.iq = iq;
	}
	public double getWeight() {
		return weight;
	}
	public float getIq() {
		return iq;
	}
}
class Heart {
	double weight;
	int valves;
	public Heart(double weight, int valves) {
		super();
		this.weight = weight;
		this.valves = valves;
	}
	public double getWeight() {
		return weight;
	}
	public int getValves() {
		return valves;
	}
}
class Human {
		Brain b = new Brain (30,12.5f);
		Heart h = new Heart (50,4);
	}
class Book {
	String name;
	int cost;
	public Book(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	public String getName() {
		return name;
	}
	public int getCost() {
		return cost;
	}
}
	class Mobile1 {
		String Company;
		int cost;
		public Mobile1(String company, int cost) {
			super();
			this.Company = company;
			this.cost = cost;
		}
		public String getCompany() {
			return Company;
		}
		public int getCost() {
			return cost;
		}
	}
	class Student extends Human {
		void Book (Book bk) {
		System.out.println(bk.getName());
		System.out.println(bk.getCost());
	}
		void Mobile1 (Mobile1 m) {
			System.out.println(m.getCompany());
			System.out.println(m.getCost());
		}
}

public class BOTH_relations {
	public static void main (String args[]) {
		Student s = new Student();
		Book bk = new Book("Biology",500);
		Mobile1 m = new Mobile1 ("Vivo",38000);
		
		System.out.println(s.b.getWeight());
		System.out.println(s.b.getIq());
		System.out.println("------------");
		System.out.println(s.h.getWeight());
		System.out.println(s.h.getValves());
		System.out.println("------------");

		
		
	}
}
