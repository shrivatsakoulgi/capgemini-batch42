
public class StringDemo1 {
	
	public static void main(String []args){
		
		String s1 = "Hello";
		
		String s2 = new String();
		
		String s3 = new String("Hello2");
		
		char chars[] = {'a','b','c','d'};
		String s4 = new String(chars);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		char ch1[] = {'c','a','p','g','e','m','i','n','i'};
		String s5 = new String(ch1,1,5);
		
		byte []b = {65,66,67};
		String s6 = new String(b);
		
		byte []b2 = {97,98,99,100,101,102,103};
		String s7 = new String(b2,3,3);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
		
	}

}
