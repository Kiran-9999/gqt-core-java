
// SINGLE _ THREAD



package Multi_Threading;

public class ThreadCode1 {
public static void main(String[] args) {
	System.out.println(Thread.currentThread());
	Thread t1=new Thread();
	System.out.println(t1);
	t1.setName("Samantha");
	System.out.println(t1);
	System.out.println(t1.getName());
	System.out.println(t1.getPriority());
}
}
