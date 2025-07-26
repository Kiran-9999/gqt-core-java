package staticSegment;
class Program1{
	int a,b,c;
	static int p,q,r;
	
	//non-static block
	{
		a=100;
		b=200;
		c=300;
		p=9;
		q=8;
		r=7;
	}
static {
	p=1;
	q=2;
	r=3;
	
	// a=8; // Error not permitted
	
	//b=9; // Error not Permitted
}


// Non-Static Method
void display() {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(p);
	System.out.println(q);
	System.out.println(r);
}
static void display2(){
	System.out.println(p);
	System.out.println(q);
	System.out.println(r);
	//System.out.println(a);  Error Not-Permitted
	//System.out.println(b);  Error Not-Permitted
	//System.out.println(c);  Error Not-Permitted
}
}
public class StaticAndNonStaticV {

	public static void main(String[] args) {
		Program1.display2();
		Program1.p=7000;
		Program1.display2();
		Program1 p1=new Program1();
		p1.display();
		p1.display2();

	}

}
