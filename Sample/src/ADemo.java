
public class ADemo {

	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		
		a1.a=10;
		a1.b=20;
		a1.number=100;
		
		a1.display();
		
		a2.a=5;
		a2.b=6;
		a2.number=200;
		System.out.println("a2");
		a2.display();
		System.out.println("a1");
		a1.display();
		System.out.println("a3");
		a3.display();
		
		System.out.println(A.number);
		A.myStaticMethod();
		
		A a4=null;
		a4.myStaticMethod();
		System.out.println("a4 number:"+a4.number);
	
		System.out.println(a3);
	}

}
