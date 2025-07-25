package staticSegmentExamples;
class Program3{
	int a,b,c;
	static int p,q,r;
	
	// Non-Static Block
	{
		a=100;
		b=200;
		c=300;
	}
	
	//Static Block
	static {
		p=111;
		q=222;
		r=333;
	}
	
	//Non- Static method
	void display1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	// Static Method
	static void display2() {
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
	}
}
public class Static_NonStatic1 {

	public static void main(String[] args) {
		Program3.display2();
		Program3.p=7000;
		Program3.display2();
		Program3 p1= new Program3();
		p1.display1();
		p1.display2();

	}

}
