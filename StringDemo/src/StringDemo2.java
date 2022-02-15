
public class StringDemo2 {

	public static void main(String[] args) {
		
		String s1 = new String("abc");
		String s2 = "Hello";
		String s3 = new String("Hello");
		char []ch={'H','e','l','l','o'};
		String s4 = new String(ch);
		System.out.println(s1+" "+s1.hashCode());
		System.out.println(s2+" "+s2.hashCode());
		System.out.println(s3+" "+s3.hashCode());
		System.out.println(s4+" "+s4.hashCode());
		System.out.println();
		
		String s5=s1.replace('a', 'z');
		System.out.println(s1+" "+s1.hashCode());
		System.out.println(s5+" "+s5.hashCode());
		System.out.println();
		String s6=s1.concat("def");
		System.out.println(s1+" "+s1.hashCode());
		System.out.println(s6+" "+s6.hashCode());
		
		
	}

}
