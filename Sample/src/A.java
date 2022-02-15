
public class A {
	
	public static int number;
	public int a;
	public int b;
	
	
	public A(){
		System.out.println("Inside Constructor...");
		a=10;
		b=20;
	}
	
	static {
		number=100;
		System.out.println("Inside Static block...");
	}
	
	static {
		System.out.println("Inside Static block 2...");
	}
	static {
		System.out.println("Inside Static block 3...");
	}
	
	
	public void display(){
		
		System.out.println("static number:"+number);
		System.out.println("a = "+a+" b = "+b);
	}
	
	public static void myStaticMethod(){
		
		System.out.println("Inside static method");
	}

}
